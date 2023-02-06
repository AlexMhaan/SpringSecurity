package com.demo.SpringSecurity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Swagger Config api REST.
 * http://localhost:8080/swagger-ui/
 * http://localhost:8080/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiDetails(){
        return new ApiInfo("Spring 'Books' Api REST(Library)",
                           "Api REST Dynamic Docs from Library Spring 'Books'",
                           "1.0",
                           "https://www.simplesoftware.com.ar/sitio/terminos-y-condiciones-de-uso/",
                           new Contact("Alexis, Lara",
                                       "https://www.linkedin.com/in/alexis88lara",
                                       "alexis.lara@live.com.ar"),
                           "License X11",
                           "https://es.wikipedia.org/wiki/Licencia_MIT",
                           Collections.emptyList());
    }
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }





}

