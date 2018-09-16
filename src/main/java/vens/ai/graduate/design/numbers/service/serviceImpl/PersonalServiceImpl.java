package vens.ai.graduate.design.numbers.service.serviceImpl;

import org.springframework.stereotype.Service;
import vens.ai.graduate.design.numbers.entity.Personal;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.PersonalRequest;
import vens.ai.graduate.design.numbers.response.PersonalResponse;
import vens.ai.graduate.design.numbers.service.PersonalService;

import java.util.Arrays;
import java.util.List;

/**
 * @author vens
 * @date 2018-05-19 0:50
 **/
@Service
public class PersonalServiceImpl implements PersonalService {
//    @Autowired
//    PersonalMapper personalMapper;
    @Override
    public PersonalResponse addPersonal(PersonalRequest request) {
        PersonalResponse response=new PersonalResponse();
        List<Personal> personals=request.getPersonals();
        List<String> faildPersonals=null;
        for(Personal personal:personals){
            int result= 1;//personalMapper.add(personal);
            if( 0>result||result==0){
                faildPersonals.add(personal.getStudentId());
            }
        }
        response.setFaildPersonals(faildPersonals);
        return response;
    }

    @Override
    public PersonalResponse deletePersonal(DeleteRequest request) {
        PersonalResponse response=new PersonalResponse();
        List<String> stuIds=request.getList();
        List<String> faildPersonals=null;
        for(String stuId:stuIds){
            int result=1; //personalMapper.deleteByStuId(stuId);
            if( 0>result||result==0){
                faildPersonals.add(stuId);
            }
        }
        response.setFaildPersonals(faildPersonals);
        return response;
    }

    @Override
    public PersonalResponse updatePersonal(PersonalRequest request) {
        PersonalResponse response=new PersonalResponse();
        List<Personal> personals=request.getPersonals();
        List<String> faildPersonals=null;
        for(Personal personal:personals){
            int result= 1;//personalMapper.update(personal);
            if( 0>result||result==0){
                faildPersonals.add(personal.getStudentId());
            }
        }
        response.setFaildPersonals(faildPersonals);
        return response;
    }

    @Override
    public PersonalResponse selectPersonal(String stuId) {
        PersonalResponse response=new PersonalResponse();
        Personal result= null;//personalMapper.findByStuId(stuId);
        response.setPersonals(Arrays.<Personal>asList(result));
        return response;
    }
}
