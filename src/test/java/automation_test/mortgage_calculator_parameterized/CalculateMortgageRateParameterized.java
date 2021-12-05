package automation_test.mortgage_calculator_parameterized;



/**

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculateMortgageRate {

    WebDriver driver;
    Select select;

    @BeforeMethod

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();


    }
    private void enterData() {  // It was public before but I have changed it cause Nobody else can Access It
        // Enter home value "30000"
        driver.findElement(By.id("homeval")).clear();
        driver.findElement(By.id("homeval")).sendKeys("300000");
        // Enter Down payment "60000"
        driver.findElement(By.id("downpayment")).clear();
        driver.findElement(By.id("downpayment")).sendKeys("60000");
    // Click on radio button $
    driver.findElement(By.name("param[downpayment_type]")).click();
        // Enter loan Amount "240000.00"
        driver.findElement(By.id("loanamt")).clear();
        driver.findElement(By.id("loanamt")).sendKeys("240000.00");
        // Enter Interest Rate "3.0%"
        driver.findElement(By.id("intrstsrate")).clear();
        driver.findElement(By.id("intrstsrate")).sendKeys("3.0");
        // Enter loan Term "30 years"
        driver.findElement(By.id("loanterm")).clear();
        driver.findElement(By.id("loanterm")).sendKeys("30");
        // Enter start date next month "Dec"
        Select select = new Select(driver.findElement(By.name("param[start_month]"))); // if we select anything from
                                                                                    // dropdown we have to use Select.
        select.selectByVisibleText("Dec");  // convenient to use visible text cause its clearly seen and easy to select
        // Enter the Year "2021"
        driver.findElement(By.id("start_year")).clear();
        driver.findElement(By.id("start_year")).sendKeys("2021");
        // Enter Property tax "5000"
        driver.findElement(By.id("pptytax")).clear();
        driver.findElement(By.id("pptytax")).sendKeys("5000");
        // Enter PMI "0.5"
        driver.findElement(By.id("pmi")).clear();
        driver.findElement(By.id("pmi")).sendKeys("0.5");
        // Enter Home Ins "1000"
        driver.findElement(By.id("hoi")).clear();
        driver.findElement(By.id("hoi")).sendKeys("1000");
        // Enter monthly HOA "100"
        driver.findElement(By.id("hoa")).clear();
        driver.findElement(By.id("hoa")).sendKeys("100");
        // Enter Loan type "FHA"
        select = new Select(driver.findElement(By.name("param[milserve]")));
        select.selectByVisibleText("FHA");
        // Enter Buy or Refi: "Buy",
        select = new Select(driver.findElement(By.name("param[refiorbuy]")));
        select.selectByVisibleText("Buy");

    }
    @Test
    public void calculateMonthlyPayment() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        enterData();

        //Click on the calculate button
        driver.findElement(By.name("cal")).click();

        // Enter the monthly payment expected from the web page "1611.85"
        String expectedTotalMonthlyPayment = "1,611.85";  // This should be exactly same as displayed in web page
        String formattedXPath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);

        // driver.findElement(By.xpath("//h3[text()='$1,611.85']"))
        // But we are not using the above one here we use a boolean
        // in case we get any wrong result as boolean returnsTrue or false
        boolean present = driver.findElement(By.xpath(formattedXPath)).isDisplayed();

        // Validate the monthly payment is "1611.85"
        Assert.assertTrue(present, "Total Monthly payment is not presented"); // any message we prefer only-
                                                                           // -visible if boolean condition is false

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

 // now its time to Modification for a cleaner code also make it private final so nobody can modify

    **/

/**

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.Assert;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;

    public class CalculateMortgageRate {
        private final By HomeValueInputField = By.id("homeval");
        private final By DownPaymentInputField = By.id("downpayment");
        private final By SelectDownPaymentInDollar = By.name("param[downpayment_type]");
        private final By LoanAmountInputField = By.id("loanamt");
        private final By InterestRateInputField = By.id("intrstsrate");
        private final By LoanTermInputField = By.id("loanterm");
        private final By StartMonthDropDown = By.name("param[start_month]");
        private final By StartYearInputField = By.id("start_year");
        private final By PropertyTaxInputField = By.id("pptytax");
        private final By PmiInputField = By.id("pmi");
        private final By HoiInputField = By.id("hoi");
        private final By HoaInputField = By.id("hoa");
        private final By LoanTypeDropDown = By.name("param[milserve]");
        private final By RefiOrBuyropDown = By.name("param[refiorbuy]");
        private final By CalculateButton = By.name("cal");






    WebDriver driver;
    Select select;

 @BeforeMethod

 public void openBrowser() {
 WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
 driver.get("https://www.mortgagecalculator.org/");
 driver.manage().window().maximize();


 }
 private void enterData() {  // It was public before but I have changed it cause Nobody else can Access It
 // Enter home value "30000"
 driver.findElement(HomeValueInputField).clear();
 driver.findElement(HomeValueInputField).sendKeys("300000");

 // Enter Down payment "60000"
 driver.findElement(DownPaymentInputField ).clear();
 driver.findElement(DownPaymentInputField ).sendKeys("60000");

 // Click on radio button $
     driver.findElement(SelectDownPaymentInDollar).click();

 // Enter loan Amount "240000.00"
 driver.findElement(LoanAmountInputField).clear();
 driver.findElement(LoanAmountInputField).sendKeys("240000.00");
 // Enter Interest Rate "3.0%"
 driver.findElement(InterestRateInputField).clear();
 driver.findElement(InterestRateInputField).sendKeys("3.0");
 // Enter loan Term "30 years"
 driver.findElement(LoanTermInputField).clear();
 driver.findElement(LoanTermInputField).sendKeys("30");
 // Enter start date next month "Dec"
 Select select = new Select(driver.findElement(StartMonthDropDown)); // if we select anything from
 // dropdown we have to use Select.
 select.selectByVisibleText("Dec");  // convenient to use visible text cause its clearly seen and easy to select
 // Enter the Year "2021"
 driver.findElement(StartYearInputField).clear();
 driver.findElement(StartYearInputField).sendKeys("2021");
 // Enter Property tax "5000"
 driver.findElement(PropertyTaxInputField).clear();
 driver.findElement(PropertyTaxInputField).sendKeys("5000");
 // Enter PMI "0.5"
 driver.findElement(PmiInputField).clear();
 driver.findElement(PmiInputField).sendKeys("0.5");
 // Enter Home Ins "1000"
 driver.findElement(HoiInputField).clear();
 driver.findElement(HoiInputField).sendKeys("1000");
 // Enter monthly HOA "100"
 driver.findElement(HoaInputField).clear();
 driver.findElement(HoaInputField).sendKeys("100");
 // Enter Loan type "FHA"
 select = new Select(driver.findElement(LoanTypeDropDown));
 select.selectByVisibleText("FHA");
 // Enter Buy or Refi: "Buy",
 select = new Select(driver.findElement(RefiOrBuyropDown));
 select.selectByVisibleText("Buy");

 }
 @Test
 public void calculateMonthlyPayment() {
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 enterData();

 //Click on the calculate button
 driver.findElement(CalculateButton).click();

 // Enter the monthly payment expected from the web page "1611.85"
 String expectedTotalMonthlyPayment = "1,611.85";  // This should be exactly same as displayed in web page
 String formattedXPath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);

 // driver.findElement(By.xpath("//h3[text()='$1,611.85']"))
 // But we are not using the above one here we use a boolean
 // in case we get any wrong result as boolean returnsTrue or false
 boolean present = driver.findElement(By.xpath(formattedXPath)).isDisplayed();

 // Validate the monthly payment is "1611.85"
 Assert.assertTrue(present, "Total Monthly payment is not presented"); // any message we prefer only-
 // -visible if boolean condition is false

 }

 @AfterMethod
 public void closeBrowser() {
// driver.quit();
 }
 } **/


//Now it's time to utilize the framework


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
import utilities.DateUtils;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
public class CalculateMortgageRate {
 private final By HomeValueInputField = By.id("homeval");
 private final By DownPaymentInputField = By.id("downpayment");
 private final By SelectDownPaymentInDollar = By.name("param[downpayment_type]");
 private final By LoanAmountInputField = By.id("loanamt");
 private final By InterestRateInputField = By.id("intrstsrate");
 private final By LoanTermInputField = By.id("loanterm");
 private final By StartMonthDropDown = By.name("param[start_month]");
 private final By StartYearInputField = By.id("start_year");
 private final By PropertyTaxInputField = By.id("pptytax");
 private final By PmiInputField = By.id("pmi");
 private final By HoiInputField = By.id("hoi");
 private final By HoaInputField = By.id("hoa");
 private final By LoanTypeDropDown = By.name("param[milserve]");
 private final By RefiOrBuyropDown = By.name("param[refiorbuy]");
 private final By CalculateButton = By.name("cal");






    WebDriver driver;


    @BeforeMethod

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
//        driver.get("https://www.mortgagecalculator.org/");
//        driver.manage().window().maximize();
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");// so i can delete upper two lines


    }
    private void enterData() {  // It was public before but I have changed it cause Nobody else can Access It
        // Enter home value "30000"
//        driver.findElement(HomeValueInputField).clear();
//        driver.findElement(HomeValueInputField).sendKeys("300000");
        ActOn.element(driver, HomeValueInputField).setValue("300000"); // this way i can delete upper two lines

        // Enter Down payment "60000"
//        driver.findElement(DownPaymentInputField ).clear();
//        driver.findElement(DownPaymentInputField ).sendKeys("60000");
        ActOn.element(driver, DownPaymentInputField).setValue("60000");

        // Click on radio button $
//        driver.findElement(SelectDownPaymentInDollar).click();
        ActOn.element(driver, SelectDownPaymentInDollar).click();

        // Enter loan Amount "240000.00"
//        driver.findElement(LoanAmountInputField).clear();
//        driver.findElement(LoanAmountInputField).sendKeys("240000");
        ActOn.element(driver, LoanAmountInputField).setValue("240000");

        // Enter Interest Rate "3.0%"
//        driver.findElement(InterestRateInputField).clear();
//        driver.findElement(InterestRateInputField).sendKeys("3.0");
        ActOn.element(driver, InterestRateInputField).setValue("3.0");

        // Enter loan Term "30 years"
       // driver.findElement(LoanTermInputField).clear();
      //  driver.findElement(LoanTermInputField).sendKeys("30");
        ActOn.element(driver, LoanTermInputField).setValue("30");

        // Enter start date next month "Dec"
     //   Select select = new Select(driver.findElement(StartMonthDropDown)); // if we select anything from

        // dropdown we have to use Select.
      //  select.selectByVisibleText("Dec");  // convenient to use visible text cause its clearly seen and easy to select
        // I have create the dateUtils inside utilities to get next month.

        String date = DateUtils.returnNextMonth();// as it returns moth and date i will use split to get both seperatly
        String[] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];

       // ActOn.element(driver, StartMonthDropDown).selectValue("Dec");   as month can be change so i use it like this.
        ActOn.element(driver, StartMonthDropDown).selectValue(month);

        // Enter the Year "2021"
//        driver.findElement(StartYearInputField).clear();
//        driver.findElement(StartYearInputField).sendKeys("2021");
      //  ActOn.element(driver, StartYearInputField).setValue("2021");// as year can be change so i use it like this
        ActOn.element(driver, StartYearInputField).setValue(year);

        // Enter Property tax "5000"
//        driver.findElement(PropertyTaxInputField).clear();
//        driver.findElement(PropertyTaxInputField).sendKeys("5000");
        ActOn.element(driver, PropertyTaxInputField).setValue("5000");

        // Enter PMI "0.5"
//        driver.findElement(PmiInputField).clear();
//        driver.findElement(PmiInputField).sendKeys("0.5");
        ActOn.element(driver, PmiInputField).setValue("0.5");

        // Enter Home Ins "1000"
//        driver.findElement(HoiInputField).clear();
//        driver.findElement(HoiInputField).sendKeys("1000");
        ActOn.element(driver, HoiInputField).setValue("1000");

        // Enter monthly HOA "100"
   //     driver.findElement(HoaInputField).clear();
     //   driver.findElement(HoaInputField).sendKeys("100");
        ActOn.element(driver, HoaInputField).setValue("100");
        // Enter Loan type "FHA"
   //     select = new Select(driver.findElement(LoanTypeDropDown));
    //    select.selectByVisibleText("FHA");
        ActOn.element(driver, LoanTypeDropDown).selectValue("FHA");
        // Enter Buy or Refi: "Buy",
//        select = new Select(driver.findElement(RefiOrBuyropDown));
//        select.selectByVisibleText("Buy");
        ActOn.element(driver, RefiOrBuyropDown).selectValue("Buy");

    }
    @Test
    public void calculateMonthlyPayment() {
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //after adding this line to command provider > ElementActions> getElemnt() we can remove it from here
        enterData();

        //Click on the calculate button
       // driver.findElement(CalculateButton).click();
        ActOn.element(driver, CalculateButton).click();

        // Enter the monthly payment expected from the web page "1611.85"
        String expectedTotalMonthlyPayment = "1,611.85";  // This should be exactly same as displayed in web page
        String formattedXPath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);
        By monthlyPayment = By.xpath(formattedXPath);

        // driver.findElement(By.xpath("//h3[text()='$1,611.85']"))
        // But we are not using the above one here we use a boolean
        // in case we get any wrong result as boolean returnsTrue or false
     //   boolean present = driver.findElement(monthlyPayment).isDisplayed();

        // Validate the monthly payment is "1611.85"
      //  Assert.assertTrue(present, "Total Monthly payment is not presented"); // any message we prefer only-
        // -visible if boolean condition is false
        AssertThat.elementAssertions(driver, monthlyPayment).elementIsDisplayed();

    }

    @AfterMethod
    public void quitBrowser() {
      //  driver.quit();
        ActOn.browser(driver).close();
    }
}
**/
// here we will do SQL connects to get data
public class CalculateMortgageRateParameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMortgageRateParameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void BrowserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        LOGGER.info("--------Test Name: Calculate Monthly Payment------");


        String browseUrl = ReadConfigFiles.getPropertyValues("Url");
        ActOn.browser(driver).openBrowser(browseUrl);

    }

    @Test
    public void calculateMonthlyPayment() {
        String date = DateUtils.returnNextMonth();// as it returns moth and date i will use split to get both seperatly
        String[] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];

        try {
            ResultSet rs = SqlConnector.readData("select * from monthly_mortgage");
            while (rs.next()) {     // i just copied the column labels from Sql pg admin
                new NavigationBar(driver)
                        .navigateToHome()
                        .typeHomePrice(rs.getString("homevalue"))
                        .typeDownPayment(rs.getString("downpayment"))
                        .clickDownPaymentInDollar()
                        .typeLoanAmount(rs.getString("loanamount"))
                        .typeInterestRate(rs.getString("interestrate"))
                        .typeLoanTermYears(rs.getString("loanterm"))
                        .selectMonth(month)
                        .selectYear(year)
                        .typePropertyTax(rs.getString("propertytax"))
                        .typePmi(rs.getString("pmi"))
                        .typeHomeOwnerInsurance(rs.getString("homeownerinsurance"))
                        .typeMonthlyHoa(rs.getString("monthlyhoa"))
                        .selectLoanType(rs.getString("loantype"))
                        .selectBuyOrRefinance(rs.getString("buyorrefi"))
                        .clickOnCalculateButton()
                        .validateTotalMonthlyPayment(rs.getString("totalmonthlypayment"));
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }


    }

    @AfterMethod
    public void quitBrowser() {
        //  driver.quit();
        LOGGER.info("-----End Test Case: Calculate Monthly Payment ------");
        ActOn.browser(driver).close();
    }
}

