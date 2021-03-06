import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.otus.WebDriverFactory.WebConfig;
import ru.otus.WebDriverFactory.WebDriverFactory;

public class WebDriverFactoryTest {

    String browser = WebConfig.BASE_CONFIG.getBrowser();
    WebDriver wd = WebDriverFactory.createNewDriver(browser);

        @Test
        public void test() {
            wd.get("https://otus.ru");
        }

        @After
        public void setDown() {
            if (wd != null) {
                wd.quit();
            }
        }
    }
