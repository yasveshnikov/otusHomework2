import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class WebDriverFactory {
    public static WebDriver createNewDriver(String webDriverName, String ...options) {
        if (webDriverName.equalsIgnoreCase(Browsers.CHROME.toString())) {
            Chrome driver = new Chrome();
            return driver.openChrome(options);
        }
        if (webDriverName.equalsIgnoreCase(Browsers.FIREFOX.toString())) {
            Firefox driver = new Firefox();
            return driver.openFirefox(options);
        }
        if (webDriverName.equalsIgnoreCase(Browsers.OPERA.toString())) {
            Opera driver = new Opera();
            return driver.openOpera(options);
        }
        if (webDriverName.equalsIgnoreCase(Browsers.SAFARI.toString())) {
            Safari driver = new Safari();
            return driver.openSafari(options);
        }
        if (webDriverName.equalsIgnoreCase(Browsers.EDGE.toString())){
            Edge driver = new Edge();
            return driver.openEdge(options);
        }
        return null;
    }
}

class Chrome {
    public WebDriver openChrome(String ...options) {
        WebDriverManager.chromedriver().setup();
        if (options != null) {
            ChromeOptions co = new ChromeOptions();
            co.addArguments(options);
            return new ChromeDriver(co);
        }
        return new ChromeDriver();
    }
}

class Firefox {
    public WebDriver openFirefox(String ...options) {
        WebDriverManager.firefoxdriver().setup();
        if (options != null) {
            FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments(options);
            return new FirefoxDriver(fo);
        }
        return new FirefoxDriver();
    }
}

class Safari {
    public WebDriver openSafari(String ...options) {
        if (options != null) {
            SafariOptions so = new SafariOptions();
            //add argument for SafariOptions here
            return new SafariDriver(so);
        }
        return new SafariDriver();
    }
}

class Opera {
    public WebDriver openOpera(String ...options) {
        WebDriverManager.operadriver().setup();
        if (options != null) {
            OperaOptions oo = new OperaOptions();
            oo.addArguments(options);
            return new OperaDriver(oo);
        }
        return new OperaDriver();
    }
}

class Edge {
    public WebDriver openEdge(String ...options) {
        WebDriverManager.edgedriver().setup();
        if (options != null) {
            EdgeOptions eo = new EdgeOptions();
            //add argument for EdgeOptions here
            return new EdgeDriver(eo);
        }
        return new EdgeDriver();
    }
}