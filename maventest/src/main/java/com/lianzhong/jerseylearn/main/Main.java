package com.lianzhong.jerseylearn.main;

import com.lianzhong.jerseylearn.service.IServiceTest;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.net.URI;

/**
 * Created by lishijun on 16/4/15.
 */
public class Main {

    public static final String BASE_URL="http://localhost:9001/lztestapp";

    public  static HttpServer startServer ()
    {
        final ResourceConfig  lztestapp = new ResourceConfig().packages("com.lianzhong.jerseylearn.action");

        HttpServer server =  GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URL),lztestapp);

        return  server;
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        if(context != null)
        {

            context.start();
            Object aa =   context.getBean("iServiceTest") ;
            String aaa = ((IServiceTest)aa).getString();
            System.out.println(aaa);
        }
        final  HttpServer server = startServer();

        System.in.read();
        server.stop();
    }
}
