package dev.be.profile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppProperties {

    @Value("${app.name:default value}")
    private String name;

    @Value("${app.version:default value}")
    private String version;

    @Value("${app.message:default value}")
    private String message;

    @Value("${app.database-url:default value}")
    private String databaseUrl;

}
