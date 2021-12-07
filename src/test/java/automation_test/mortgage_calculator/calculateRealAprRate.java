package automation_test.mortgage_calculator;

import org.testng.annotations.Test;
import page_object.NavigationBar;
import utilities.RetryFailedTests;

// Now we will automate another scenario from mortgage calculator.
// 1. Open https://www.mortgagecalculator.org/
// 2. Mouse hover to “Rates” link at the menu bar  and select “Real APR” option
// 3. Wait until the Real APR page is loaded
// 4. Enter Home Price “200000”, down payment “15000” $, interest rate 3%
// 5. Click on calculate button6. Validate that Actual APR is “3.130%”
/**
public class calculateRealAprRate {
    private final By RatesLink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");
    private final By CalculatorTab = By.xpath("//label[text()= 'Calculator']");
    private final By HomePriceInputFields = By.name("HomeValue");
    private final By DownPaymentInDollar = By.name("DownPaymentSel");
    private final By DownPaymentInputFields = By.name("DownPayment");
    private final By InterestRatesInputFields = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    // here we want the Apr% link with the actual Apr td(tableData) so in future
    // if any of the input changed the code will not break
    //So I wil not take the xpath of the amount directly but linked it with ActualApr data
//    //*[@id="analysisDiv"]/table[1]/tbody/tr/td/strong[text()='Actual APR:']/../../td[2]/strong
    // this is the xpath but not derived directly from the ActualApr value .
    private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table[1]/tbody/tr/td/strong[text()='Actual APR:']/../../td[2]/strong");


     WebDriver driver;
     @BeforeMethod
    public void openBrowser() {
         WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
//         driver.get("https://www.mortgagecalculator.org/");
//         driver.manage().window().maximize();
         ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
     }
     public void navigateToRealAprPage() {
         // MouseHover to Rates Link
       //  Actions actions = new Actions(driver); // if we want to use anything mouseHover Actions is the syntax
        // actions.moveToElement(driver.findElement(RatesLink)).perform();//MouseHover Action Syntax
         ActOn.element(driver, RatesLink).mouseHover();
         // Click on Real Apr Link
        // driver.findElement(RealAprLink).click();
         ActOn.element(driver, RealAprLink).click();

         // then I want to use the wait time so it could wait for tab to load
     //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     //    wait.until(ExpectedConditions.visibilityOfElementLocated(CalculatorTab));
         ActOn.wait(driver, CalculatorTab).waitForElementToBeVisible();
     }

     public void enterData() {
         // Enter homePrice 200000
        // driver.findElement(HomePriceInputFields).clear();
       //  driver.findElement(HomePriceInputFields).sendKeys("200000");
         ActOn.element(driver, HomePriceInputFields).setValue("200000");

         // Click $ in down Payment
        // driver.findElement(DownPaymentInDollar).click();
         ActOn.element(driver, DownPaymentInDollar).click();
         // Enter downPayment 15000
       //  driver.findElement(DownPaymentInputFields).clear();
       //  driver.findElement(DownPaymentInputFields).sendKeys("15000");
         ActOn.element(driver, DownPaymentInputFields).setValue("15000");
         // Enter interest rate 3%
       //  driver.findElement(InterestRatesInputFields).clear();
      //   driver.findElement(InterestRatesInputFields).sendKeys("3");
         ActOn.element(driver, InterestRatesInputFields).setValue("3");

     }

     @Test
    public void calculateRealApr(){
         navigateToRealAprPage();
         enterData();

         // Click on the Calculate Button
       //  driver.findElement(CalculateRateButton).click();
         ActOn.element(driver, CalculateRateButton).click();

         // Validate that Actual APR is “3.130%”
        // driver.findElement(ActualAprRate).getText(); // but I have to capture the value So I will write
      //   String actualRealAprRate = driver.findElement(ActualAprRate).getText(); // .gettext() for the Apr value
         String actualRealAprRate = ActOn.element(driver, ActualAprRate).getTextValue();
         // now I will do the comparison
         Assert.assertEquals(actualRealAprRate, "3.130%");
     }
    @AfterMethod
    public void quitBrowser() {
     //  driver.quit();
        ActOn.browser(driver).close();
     }

}
 **/
// After setting up the Pom Now we can apply that here
public class calculateRealAprRate extends BaseClassUITest {

                                        // We will enhance this Before method at base class,so we don't do it over again
                                                                                                //    @BeforeMethod
                                                                                     //    public void openBrowser() {
                                                                     //        WebDriverManager.chromedriver().setup();
                                                                                  //        driver = new ChromeDriver();
                                    //        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
                                                                                                                //    }

    @Test(retryAnalyzer = RetryFailedTests.class)  // as we created Retry failed test at utilities
    public void calculateRealApr(){
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice("200000")
                .typeDownPayment("15000")
                .selectDownPaymentInDollar()
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateAprRate("3.130%");

    }
                                                                                    //    @AfterMethod
                                                                                    //    public void quitBrowser() {
                                                                                    //        //  driver.quit();
                                                                                    //    ActOn.browser(driver).close();
                                                                                    //    }

}

