package automation_test.mortgage_calculator_parameterized;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.NavigationBar;
import parameters.DataProviderClass;
import utilities.ReadConfigFiles;

// Here we will provide the data from data provider class.(data driven testing)
public class calculateRealAprRateParameterized {
    private static final Logger LOGGER = LogManager.getLogger(calculateRealAprRateParameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------Test Name: Calculate Real Apr Rate------");


        String browseUrl = ReadConfigFiles.getPropertyValues("Url");
        ActOn.browser(driver).openBrowser(browseUrl);
    }

    @Test(dataProvider = "RealAprRates", dataProviderClass = DataProviderClass.class)
    public void calculateRealApr(String homePrice, String downPayment, String interestRate, String expectedApr){
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice(homePrice)
                .typeDownPayment(downPayment)
                .selectDownPaymentInDollar()
                .typeInterestRate(interestRate)
                .clickOnCalculateButton()
                .validateAprRate(expectedApr);

    }
    @AfterMethod
    public void quitBrowser() {
        //  driver.quit();
        LOGGER.info("-----End Test Case: Calculate Real Apr Rate------");
        ActOn.browser(driver).close();
    }

}

