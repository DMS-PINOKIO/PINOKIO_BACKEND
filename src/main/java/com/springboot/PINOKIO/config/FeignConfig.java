package com.springboot.PINOKIO.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.springboot.PINOKIO.util.api")
@Configuration
public class FeignConfig {
}
