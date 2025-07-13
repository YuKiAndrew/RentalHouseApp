package org.andrew.fileHandler.controller;

import org.andrew.fileHandler.Entity.TestEntity;
import org.andrew.fileHandler.helper.Response;
import org.andrew.fileHandler.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

    @Controller
    @RequestMapping("/api/connection")
public class ConnectController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/ping",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> Ping() {
        return new Response().success();
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Response<String> test() {
        List<TestEntity> testEntities = testService.selectAll();
        return new Response().success(testEntities);
    }
}
