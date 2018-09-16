package vens.ai.graduate.design.numbers.service;

import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.PersonalRequest;
import vens.ai.graduate.design.numbers.response.PersonalResponse;

/**
 * @author vens
 * @date 2018-05-19 0:49
 **/
public interface PersonalService {
    /**
     * 添加成员
     * @param request
     * @return
     */
    PersonalResponse addPersonal(PersonalRequest request);

    /**
     * 删除成员
     * @param request
     * @return
     */
    PersonalResponse deletePersonal(DeleteRequest request);

    /**
     * 更新成员
     * @param request
     * @return
     */
    PersonalResponse updatePersonal(PersonalRequest request);

    /**
     * 查询成员
     * @param request
     * @return
     */
    PersonalResponse selectPersonal(String stuId);
}
