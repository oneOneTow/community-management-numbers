package vens.ai.graduate.design.numbers.request;

import vens.ai.graduate.design.numbers.entity.Number;

import java.util.List;

/**
 * @author vens
 * @date 2018-05-04 19:27
 **/
public class NumRequest {
    List<Number> nemder;

    public List<Number> getNemder() {
        return nemder;
    }

    public void setNemder(List<Number> nemder) {
        this.nemder = nemder;
    }
}
