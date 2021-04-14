package com.example.smallexample.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi(){

        final String securitySchemeName = "bearerAuth";

        return new OpenAPI().info(getInfo());

    }

    private Info getInfo(){
        final String apiTitle = "Normal Application";
        final String description = "This is a normal description";

        return new Info().title(apiTitle).description(description).version("1.0").contact(getContact());

    }

    private Contact getContact(){
        return new Contact().name("Achyuth Varma").email("achyuth.varma1@gmail.com");
    }



}
