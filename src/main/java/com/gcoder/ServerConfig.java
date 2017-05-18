package com.gcoder;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gcoder on 2017/5/18.
 */
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "server")
public class ServerConfig {
    private String group;
    private String version;
    private int numLimit;
}
