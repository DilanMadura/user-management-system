package com.dmjtech.application.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project mobile-house-manage-system
 * @Version 1.0.0
 * @Author Dilan Madura Jayaneththi , ddmdilan@gmail.com
 * @Date 06, January 2023, 9:49 AM
 * @Countory Sri Lanka
 */

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI initOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .name("bearerAuth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")))
                .info(this.info());
    }


    private Info info() {
        return new Info()
                .title("user-manage-system")
                .version("1.0.0")
                .contact(this.contact())
                .description("This microservice is to user manage system.").termsOfService("https://www.bezkoder.com/terms")
                .license(this.license());
    }

    private Contact contact() {
        Contact contact = new Contact();
        contact.setName("Dilan Madura Jayaneththi");
        contact.email("ddmdilan@gmail.com");
        return contact;
    }

    private License license() {
        return new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");
    }
}
