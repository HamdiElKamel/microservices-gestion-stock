package com.mproduits.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@Data
@RefreshScope
public class ApplicationPropertiesConfiguration {
    private int limitDeProduits;

}
