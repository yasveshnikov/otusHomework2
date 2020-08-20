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
            WebDriverFactoryChrome chrome = new WebDriverFactoryChrome();
            return chrome.create(options);
        }

        if (webDriverName.equals(Browsers.FIREFOX.name())) {
            WebDriverFactoryFirefox firefox = new WebDriverFactoryFirefox();
            return firefox.create(options);
        }

        if (webDriverName.equals(Browsers.SAFARI.name())) {
            WebDriverFactorySafari safari = new WebDriverFactorySafari();
            return safari.create(options);
        }

        if (webDriverName.equals(Browsers.OPERA.name())) {
            WebDriverFactoryOpera opera = new WebDriverFactoryOpera();
            return opera.create(options);
        }

        if (webDriverName.equals(Browsers.EDGE.name())) {
            WebDriverFactoryEdge edge = new WebDriverFactoryEdge();
            return edge.create(options);
        }

        return null;
    }
}