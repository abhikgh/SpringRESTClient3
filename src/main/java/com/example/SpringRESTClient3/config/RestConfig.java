package com.example.SpringRESTClient3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.config.annotation.WsConfigurationSupport;

import java.time.Duration;

@Configuration
public class RestConfig extends WsConfigurationSupport {

    @Value("${rest.timeOut:10000}")
    private long timeOut;

    @Bean
    @Scope(value = "prototype")
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(timeOut))
                .setReadTimeout(Duration.ofMillis(timeOut))
                .build();
    }

}
