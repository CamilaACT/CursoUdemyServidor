package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-01T18:52:06.421435096Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Digitalthinking Shool")
                .description("Digitalthinking Shool API reference for developers, teh error handler is implement using   The IETF devised RFC 7807 effor, which creates a generalized error-handling schema. https://tools.ietf.org/html/rfc7807")
                .termsOfService("")
                .version("1.0")
                .license(new License()
                    .name("sotobotero License")
                    .url("https://digitalthinking.biz/es/ada-enterprise-core#contactus"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("https://digitalthinking.biz/es/udemy")));
    }

}
