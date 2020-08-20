package ru.otus.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactoryFirefox implements WebDriverFactoryParrent{
    @Override
    public WebDriver create(MutableCapabilities options) {
        WebDriverManager.firefoxdriver().setup();
        if (options != null){
            return new FirefoxDriver((FirefoxOptions) options);
        } else {
            return new FirefoxDriver();
        }
    }
}