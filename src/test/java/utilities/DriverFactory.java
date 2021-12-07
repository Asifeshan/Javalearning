package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    //Do not allow to initialize this class outside or create object outside of this class

    private DriverFactory() {
        //do nothing -- Empty constructor
    }

    private static final DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {

        return instance;
    }

    // Thread local driver object for webDriver
    ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {     // lambda expression. we can use threadLocale
        WebDriverManager.chromedriver().setup();                        // while we try to crate a thread object
        return new ChromeDriver();                                       // can be replaced by other browser drivers
// i want to assign chrome driver instance information assigned to this driver so i used lambda expression
// when this method will be executed the chrome driver value will be assigned to this driver.
    });

    // call this method to get the driver object and launch the browser
    public WebDriver getDriver() {
        ThreadLocal<WebDriver> driver = this.driver;
        return driver.get();
    }
        // quits the driver and closes the browser
        public void removeDriver() {

            driver.get().quit();
            driver.remove();
        }
    }


