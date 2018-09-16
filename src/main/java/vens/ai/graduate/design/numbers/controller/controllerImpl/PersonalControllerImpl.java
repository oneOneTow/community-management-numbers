package vens.ai.graduate.design.numbers.controller.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vens.ai.graduate.design.numbers.controller.PersonalController;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.PersonalRequest;
import vens.ai.graduate.design.numbers.response.PersonalResponse;
import vens.ai.graduate.design.numbers.service.serviceImpl.PersonalServiceImpl;

/**
 * @author vens
 * @date 2018-05-13 0:07
 **/
@Component
public class PersonalControllerImpl implements PersonalController{
    @Autowired
    PersonalServiceImpl personalService;
    @Override
    public PersonalResponse addPersonal(PersonalRequest request) {
        PersonalResponse response;
        response=personalService.addPersonal(request);
        return response;
    }

    @Override
    public PersonalResponse deletePersonal(DeleteRequest request) {
        PersonalResponse response;
        response=personalService.deletePersonal(request);
        return response;
    }

    @Override
    public PersonalResponse updatePersonal(PersonalRequest request) {
        PersonalResponse response;
        response=personalService.updatePersonal(request);
        return response;
    }

    @Override
    public PersonalResponse getPersonal(String stuId) {
        PersonalResponse response;
        response=personalService.selectPersonal(stuId);
        return response;
    }
}
