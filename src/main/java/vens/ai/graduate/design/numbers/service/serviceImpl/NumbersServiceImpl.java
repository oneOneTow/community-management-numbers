package vens.ai.graduate.design.numbers.service.serviceImpl;

import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vens.ai.graduate.design.numbers.constant.BaseConstant;
import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.mapper.NumberMapper;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.request.NumberRequestVo;
import vens.ai.graduate.design.numbers.response.NumResponse;
import vens.ai.graduate.design.numbers.service.NumbersService;

import java.util.Arrays;
import java.util.List;

/**
 * @author vens
 * @date 2018-05-18 23:51
 **/
@Service
public class NumbersServiceImpl implements NumbersService{
    @Autowired
    NumberMapper numberMapper;
    @Autowired
    MapperFactory mapperFactory;
    @Override
    public NumResponse addNumber(NumberRequestVo request) {
        NumResponse response=new NumResponse();
        Number number=mapperFactory.getMapperFacade().map(request,Number.class);
        number.setStatus(Integer.valueOf(request.getStatus()));
        List<String> faildNumbers=null;
        int result= numberMapper.add(number);
        if( 0>result||result==0) {
            faildNumbers.add(number.getStudentId());
            response.setCode(BaseConstant.FAILD_OPTION);
        }
        response.setCode(BaseConstant.OK_RESPONSE);
        response.setFaildNumbers(faildNumbers);
        return response;
    }

    @Override
    public NumResponse deleteNumber(DeleteRequest request) {
        NumResponse response=new NumResponse();
        List<String> faildNumbers=null;
        for(String stuId:request.getList()){
            int result= numberMapper.deleteByStuId(stuId);
            if( 0>result||result==0){
                faildNumbers.add(stuId);
                response.setCode(BaseConstant.FAILD_OPTION);
            }
        }
        response.setFaildNumbers(faildNumbers);
        return response;
    }

    @Override
    public NumResponse updateNumber(NumRequest request) {
        NumResponse response=new NumResponse();
        List<Number> numbers=request.getNemder();
        List<String> faildNumbers=null;
        for(Number number:numbers){
            int result= numberMapper.update(number);
            if( 0>result||result==0){
                faildNumbers.add(number.getStudentId());
            }
        }
        response.setFaildNumbers(faildNumbers);
        return response;
    }

    @Override
    public List<Number> selectNumber(String flag) {
        List<Number> result=null;
        if(BaseConstant.FIND_ALL==flag){
           result= numberMapper.findAll();
        }
        if(BaseConstant.FIND_OLD==flag){
           result= Arrays.asList(numberMapper.findOld());
        }
        if(BaseConstant.FIND_NOW==flag){
           result= numberMapper.findNow();
        }
        return result;
    }
}
