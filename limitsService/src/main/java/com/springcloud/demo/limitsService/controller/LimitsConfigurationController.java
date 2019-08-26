package com.springcloud.demo.limitsService.controller;

import com.springcloud.demo.limitsService.limitsService.Configuration;
import com.springcloud.demo.limitsService.limitsService.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration helloWorld() {
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }

}