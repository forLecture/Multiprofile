package dev.be.profile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties2 {
    private String name;
    private String version;
    private String message;
    private String databaseUrl;

}
