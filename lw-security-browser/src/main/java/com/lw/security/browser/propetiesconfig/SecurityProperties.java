package com.lw.security.browser.propetiesconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "lw.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();
}
