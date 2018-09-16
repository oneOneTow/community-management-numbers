package vens.ai.graduate.design.numbers.response;

import java.util.List;
import vens.ai.graduate.design.numbers.entity.Number;
/**
 * @author vens
 * @date 2018-05-19 23:44
 **/
public class NumberResponseVo {
    List<Number> numbers;
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }
}
