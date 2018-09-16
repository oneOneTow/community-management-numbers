package vens.ai.graduate.design.numbers.response;

import java.util.List;
import vens.ai.graduate.design.numbers.entity.Number;
/**
 * @author vens
 * @date 2018-05-04 19:26
 **/
public class NumResponse {
    List<String> faildNumbers;
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

    public List<String> getFaildNumbers() {
        return faildNumbers;
    }

    public void setFaildNumbers(List<String> faildNumbers) {
        this.faildNumbers = faildNumbers;
    }
}
