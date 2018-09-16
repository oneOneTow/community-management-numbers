package vens.ai.graduate.design.numbers.controller;

import org.springframework.web.bind.annotation.RequestParam;
import vens.ai.graduate.design.numbers.request.DeleteRequest;
import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.request.PersonalRequest;
import vens.ai.graduate.design.numbers.response.NumResponse;
import vens.ai.graduate.design.numbers.response.PersonalResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author
 * @date 2018-05-13 0:06
 **/
@Path("/personal")
public interface PersonalController {
    /**
     * 增加成员
     * @param request
     * @return
     */
    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    PersonalResponse addPersonal(PersonalRequest request);

    /**
     * 删除一个number
     * @param request
     * @return
     */
    @Path("/delete")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    PersonalResponse deletePersonal(DeleteRequest request);

    /**
     * 修改number
     * @param request
     * @return
     */
    @Path("/update")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    PersonalResponse updatePersonal(PersonalRequest request);


    /**
     * 查询
     * @param
     * @return
     */
    @Path("/get/{stuId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    PersonalResponse getPersonal(@RequestParam("stuId") String stuId);
}
