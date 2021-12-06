package com.pfa.elklogsswaggerrestfulapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.pfa.elklogsswaggerrestfulapi.controller.*;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@PropertySource("classpath:application.properties")
@ComponentScan(basePackageClasses = {DocteurController.class,PatientController.class})

public class SwaggerConfig {

    private static final String SWAGGER_API_VERSION = "1.2";
    private static final String LICENSE_TEXT = "COPYRIGHT";
    private static final String title = "HTTP METHODS FOR DOCUMENTS";
    private static final String description = "This page provides you to try http methods such as CRUD";

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .license(LICENSE_TEXT)
                .version(SWAGGER_API_VERSION)
                .build();
    }

    @Bean
    public Docket productsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/Rest.*"))
                .build();
    }
}