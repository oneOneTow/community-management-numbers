package vens.ai.graduate.design.numbers.mapper;

import vens.ai.graduate.design.numbers.entity.Number;

import java.util.List;

/**
 * @author vens
 * @date 2018-05-20 9:36
 **/
public interface NumberMapper {
    List<Number> findAll();
    int add(Number number);
    Number findOld();
    List<Number> findNow();
    int update(Number number);
    int deleteByStuId(String stuId);
}
