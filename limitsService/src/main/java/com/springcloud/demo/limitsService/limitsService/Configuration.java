package com.springcloud.demo.limitsService.limitsService;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int maximum;
    private int minimum;
}
