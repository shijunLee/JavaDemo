package com.lianzhong.jerseylearn.action;

import com.lianzhong.jerseylearn.service.IServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by lishijun on 16/4/15.
 */

@Component
@Path("lzapi")
public class LzApi {

    @Autowired
    IServiceTest iServiceTest;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("start")
    public  String getInfo()
    {
        String result = iServiceTest.getString();
        return result;
    }
}
