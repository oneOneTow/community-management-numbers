package vens.ai.graduate.design.numbers.controller;

import vens.ai.graduate.design.numbers.entity.Number;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.request.NumberRequestVo;
import vens.ai.graduate.design.numbers.response.NumResponse;
import vens.ai.graduate.design.numbers.response.NumberResponseVo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author
 * @date 2018-05-04 19:22
 **/
@Path("/endpoint")
public interface NumbersController {
    /**
     * 增加成员
     * @param request
     * @return
     */
    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    NumResponse addNumber(NumberRequestVo request);

    /**
     * 删除一个number
     * @param request
     * @return
     */
    @Path("/delete")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    NumResponse deleteNumber(DeleteRequest request);

    /**
     * 修改number
     * @param request
     * @return
     */
    @Path("/update")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    NumResponse updateNumber(NumRequest request);


    /**
     * 查询
     * @param flag 用来确定查询什么类型的成员
     * @return
     */
    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    NumberResponseVo getNumber();

    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    List<Number> getNumbers();
}
