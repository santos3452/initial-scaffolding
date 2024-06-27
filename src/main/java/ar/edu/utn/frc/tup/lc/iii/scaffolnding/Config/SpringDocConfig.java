package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

public class SpringDocConfig {

    @Value("${app.url}") private String Url;
    @Value("${app.dev-name}") private String devName;
    @Value ("${app.dev-email}") private String devEmail;

    @Bean
    public OpenAPI openAPI(
            @Value("${app.name}") String appName,
            @Value("${app.version}") String appVersion,
            @Value("${app.description}") String appDescription) {

        Info info = new Info()
                .title(appName)
                .version(appVersion)
                .description(appDescription)
                .contact(new Contact().name(devName).email(devEmail));

        return new OpenAPI().info(info);
    }
}