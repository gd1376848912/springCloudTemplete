package com.gordon.spring.cloud.web.com.gordon.spring.cloud.web.admin.ribbon.controller;

import com.gordon.spring.cloud.web.com.gordon.spring.cloud.web.admin.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "hi",method= RequestMethod.GET)
    public String sayHi(String message){
        return ribbonService.sayHi(message);
    }
}
