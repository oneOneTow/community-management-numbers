package vens.ai.graduate.design.numbers.request;

import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.entity.Personal;

import java.util.List;

/**
 * @author vens
 * @date 2018-05-19 0:51
 **/
public class PersonalRequest {
    List<Personal> personals;

    public List<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(List<Personal> personals) {
        this.personals = personals;
    }
}
