package com.iftm.client.Resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/client")
public class ClientResource {

    @Value("${eureka.instance.instance-id}")
    String id;

    @Value("${test.config}")
    String testconfig;

    @GetMapping
    public String getId() {
        return id;
    }

    @GetMapping(value="/configs")
    public String  getConfigs() {
        return testconfig;
    }
    
}
