package com.gordon.spring.cloud.web.admin.feign.controller;

import com.gordon.spring.cloud.web.admin.feign.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController{

    @Autowired
    private WebService webService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message) {
        return webService.sayHi(message);
    }
}
