package ru.otus.WebDriverFactory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    public static WebDriver createNewDriver(String webDriverName) {
        return createNewDriver(webDriverName, null);
    }

    public static WebDriver createNewDriver(String webDriverName, MutableCapabilities options){
        webDriverName = webDriverName.toUpperCase();

        if (webDriverName.equals(Browsers.CHROME.name())) {
            return new WebDriverFactoryChrome().create(options);
        }

        if (webDriverName.equals(Browsers.FIREFOX.name())) {
            return new WebDriverFactoryFirefox().create(options);
        }

        if (webDriverName.equals(Browsers.SAFARI.name())) {
            return new WebDriverFactorySafari().create(options);
        }

        if (webDriverName.equals(Browsers.OPERA.name())) {
            return new WebDriverFactoryOpera().create(options);
        }

        if (webDriverName.equals(Browsers.EDGE.name())) {
            return new WebDriverFactoryEdge().create(options);
        }

        return null;
    }
}