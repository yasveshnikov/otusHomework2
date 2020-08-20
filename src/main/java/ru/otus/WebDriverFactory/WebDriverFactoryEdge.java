package ru.otus.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverFactoryEdge implements WebDriverFactoryParrent {
    @Override
    public WebDriver create(MutableCapabilities options) {
        WebDriverManager.edgedriver().setup();
        if (options != null) {
            return new EdgeDriver((EdgeOptions) options);
        } else {
            return new EdgeDriver();
        }
    }
}
