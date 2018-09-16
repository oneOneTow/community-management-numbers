package vens.ai.graduate.design.numbers.mapper;

import vens.ai.graduate.design.numbers.entity.Personal;

/**
 * @author
 * @date 2018-05-12 19:27
 **/
public interface PersonalMapper {
    int add(Personal person);
    int update(Personal person);
    Personal findByStuId(String stuId);
    int deleteByStuId(String stuId);
}
