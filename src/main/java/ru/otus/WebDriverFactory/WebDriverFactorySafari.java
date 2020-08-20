package ru.otus.WebDriverFactory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class WebDriverFactorySafari implements WebDriverFactoryParrent {
    @Override
    public WebDriver create(MutableCapabilities options) {
        if (options != null) {
            return new SafariDriver((SafariOptions) options);
        } else {
            return new SafariDriver();
        }
    }
}
