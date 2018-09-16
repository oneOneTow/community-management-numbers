package vens.ai.graduate.design.numbers.response;

import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.entity.Personal;

import java.util.List;

/**
 * @author vens
 * @date 2018-05-19 0:52
 **/
public class PersonalResponse {

    List<String> faildPersonals;
    List<Personal> personals;

    public List<String> getFaildPersonals() {
        return faildPersonals;
    }

    public void setFaildPersonals(List<String> faildPersonals) {
        this.faildPersonals = faildPersonals;
    }

    public List<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(List<Personal> personals) {
        this.personals = personals;
    }
}
