package vens.ai.graduate.design.numbers.controller;

import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.response.NumResponse;

/**
 * @author vens
 * @date 2018-05-04 19:28
 **/
public class NumbersControllerImpl implements NumbersController {
    @Override
    public NumResponse addNumber(NumRequest request) {
        NumResponse response=new NumResponse();
        response.setInfo("success");
        response.setStats("200");
        return response;
    }
}
