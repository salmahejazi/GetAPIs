package com.APIsProject.security;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import javax.annotation.PostConstruct;

public class GetAPIsConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${opentracing.jaeger.udp-sender.host}")
    private String udpHost;

    @Value("${opentracing.jaeger.udp-sender.port}")
    private int udpPort;

    @Value("${opentracing.jaeger.udp-sender.size}")
    private int packetSize;




    @Bean
    public OpenAPI customOpenAPI(@Value("${application.version}") String appVersion) {
        return new OpenAPI()
                .components(
                        new Components()
                                .addSecuritySchemes(
                                        "basicAuth",
                                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
                .info(
                        new Info()
                                .title("Get APIs")
                                .version(appVersion)
                                .description(
                                        "get APIs")
                                .termsOfService("TBD")
                                );
    }

}
