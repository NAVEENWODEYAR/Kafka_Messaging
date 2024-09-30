package com.kafka.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @projectMensagens
 */
@Configuration
public class SwaggerConfig {

	@Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Mensangens[ασφάλεια,Greek]~~[Mesaging]")
                        .description("Spring Boot demo project for spring_security")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Naveen K Wodeyar")
                                .url("http://naveen.co.in")
                                .email("naveenwodeyar@yahoo.com"))
                        .license(new License()
                                .name("My License")
                                .url("http://www.license.co.in"))
                );
    }
}
