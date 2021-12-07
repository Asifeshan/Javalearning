package api_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;


public class BaseClassAPITest {
    public WebDriver driver;
    Logger LOGGER = LogManager.getLogger(this.getClass().getName());
    String testCaseName = String.format("------Test: %s-----", this.getClass().getName());
    String endTestCase = String.format("--------Test End: %s-------", this.getClass().getName());

    @BeforeClass // before class is annotation will execute right before the class at testng
                 // Before method will execute right before the method. match it with Testng
    public void addThread () {
        ThreadContext.put("threadName", this.getClass().getName()); // this "threadName" is from log4j2 file name

    }
}
