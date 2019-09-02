package com.gordon.spring.cloud.web.admin.feign.service.hystrix;

import com.gordon.spring.cloud.web.admin.feign.service.WebService;
import org.springframework.stereotype.Component;

@Component
public class WebServiceHystrix implements WebService {
    @Override
    public String sayHi(String message) {
        return "your request is bad";
    }
}
