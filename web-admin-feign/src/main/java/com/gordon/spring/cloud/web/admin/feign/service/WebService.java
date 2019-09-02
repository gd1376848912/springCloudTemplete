package com.gordon.spring.cloud.web.admin.feign.service;

import com.gordon.spring.cloud.web.admin.feign.service.hystrix.WebServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-admin",fallback = WebServiceHystrix.class)
public interface WebService {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
