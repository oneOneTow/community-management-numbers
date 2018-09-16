package vens.ai.graduate.design.numbers.service;

import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.request.NumberRequestVo;
import vens.ai.graduate.design.numbers.response.NumResponse;

import java.util.List;

/**
 * @author
 * @date 2018-05-18 23:51
 **/
public interface NumbersService {
    /**
     * 添加成员
     * @param request
     * @return
     */
    NumResponse addNumber(NumberRequestVo request);

    /**
     * 删除成员
     * @param request
     * @return
     */
    NumResponse deleteNumber(DeleteRequest request);

    /**
     * 更新成员
     * @param request
     * @return
     */
    NumResponse updateNumber(NumRequest request);

    /**
     * 查询成员
     * @param request
     * @return
     */
    List<Number> selectNumber(String flag);
}
