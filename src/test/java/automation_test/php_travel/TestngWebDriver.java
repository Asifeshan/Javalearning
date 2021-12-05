package automation_test.php_travel;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

//public class TestngWebDriver {
//    @Test
//    public void verifyHomePageTitle() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://qateksolutions.com/");
//        String expectedTitle =  "QA Tek Solutions Inc.-Global IT Solutions Provider" ;
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//        driver.quit();


//        public void verifyHomePageTitle() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://phptravels.com/demo/");
//        String expectedTitle =  "Demo Script Test drive - PHPTRAVELS" ;
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//        driver.quit();



//    NOW WE WILL TRY TO ENHANCE THIS CODE*****

public class TestngWebDriver {
    WebDriver driver;   // this is at global level so that all method can access it.

    @BeforeMethod       // explain - if we run a class we have to tell java which method should run first.
    public void browserInitialization() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//            driver.get("https://phptravels.com/demo/");
        ActOn.browser(driver).openBrowser("https://phptravels.com/demo/");
            // dataSetup();

        }
      //  Note : if we have other methods then we can call them inside the before method.
    // example
    // public void dataSetup() {
    // }

       @Test
        public void verifyHomePageTitle() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
       //     String actualTitle = driver.getTitle();
           String actualTitle = ActOn.browser(driver).captureTitle();
            Assert.assertEquals(actualTitle, expectedTitle);

        }

        @AfterMethod    // ex[plain- we are telling java to run this at the end or last.
        public void closeBrowser() {
          //  driver.quit();
            ActOn.browser(driver).close();

        }
    }


