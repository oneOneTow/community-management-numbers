package vens.ai.graduate.design.numbers.controller.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vens.ai.graduate.design.numbers.constant.BaseConstant;
import vens.ai.graduate.design.numbers.controller.NumbersController;
import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.mapper.NumberMapper;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.request.NumberRequestVo;
import vens.ai.graduate.design.numbers.response.NumResponse;
import vens.ai.graduate.design.numbers.response.NumberResponseVo;
import vens.ai.graduate.design.numbers.service.serviceImpl.NumbersServiceImpl;

import java.util.List;

/**
 * @author vens
 * @date 2018-05-04 19:28
 **/
@Component
public class NumbersControllerImpl implements NumbersController {
    @Autowired
    NumbersServiceImpl numbersService;
    @Autowired
    NumberMapper mapper;
    @Override
    public NumResponse addNumber(NumberRequestVo request) {
        NumResponse response;
        response=numbersService.addNumber(request);
        return response;
    }

    @Override
    public NumResponse deleteNumber(DeleteRequest request) {
        NumResponse response;
        response=numbersService.deleteNumber(request);
        return response;
    }

    @Override
    public NumResponse updateNumber(NumRequest request) {
        NumResponse response;
        response=numbersService.updateNumber(request);
        return response;
    }

    @Override
    public NumberResponseVo getNumber() {
        NumberResponseVo response=new NumberResponseVo();
        response.setNumbers(numbersService.selectNumber("all"));
        response.setCode(BaseConstant.OK_RESPONSE);
        return response;
    }

    @Override
    public List<Number> getNumbers() {
        return mapper.findAll();
    }
}
