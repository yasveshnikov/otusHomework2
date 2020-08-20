package ru.otus.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class WebDriverFactoryOpera implements WebDriverFactoryParrent{
    @Override
    public WebDriver create(MutableCapabilities options) {
        WebDriverManager.operadriver().setup();
        if (options != null) {
            return new OperaDriver((OperaOptions) options);
        } else {
            return new OperaDriver();
        }
    }
}
