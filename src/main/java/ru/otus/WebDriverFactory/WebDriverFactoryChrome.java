package ru.otus.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactoryChrome implements WebDriverFactoryParrent {
    @Override
    public WebDriver create(MutableCapabilities options) {
        WebDriverManager.chromedriver().setup();
        if (options != null){
            return new ChromeDriver((ChromeOptions) options);
        } else {
            return new ChromeDriver();
        }
    }
}