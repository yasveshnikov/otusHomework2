package ru.otus.WebDriverFactory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

public interface WebDriverFactoryParrent {
    WebDriver create(MutableCapabilities options);
}
