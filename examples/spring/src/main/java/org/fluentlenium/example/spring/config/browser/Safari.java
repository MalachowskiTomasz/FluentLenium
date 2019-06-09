package org.fluentlenium.example.spring.config.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.safari.SafariOptions;

public class Safari implements IBrowser {

    @Override
    public Capabilities getBrowserCapabilities() {
        SafariOptions safariOptions = new SafariOptions();
        safariOptions.setCapability("browser_version", "12.0");
        safariOptions.setCapability("os_version", "Mojave");
        return safariOptions;
    }

    @Override
    public String getDriverExecutableName() {
        return "safaridriver";
    }

    @Override
    public String getDriverSystemPropertyName() {
        return "webdriver.safari.driver";
    }
}
