package vens.ai.graduate.design.numbers.controller;

import vens.ai.graduate.design.numbers.request.NumRequest;
import vens.ai.graduate.design.numbers.response.NumResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author
 * @date 2018-05-04 19:22
 **/
@Path("/endpoint")
public interface NumbersController {
    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    NumResponse addNumber(NumRequest request);
}
