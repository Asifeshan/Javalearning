package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Year;
import java.util.logging.LogManager;

public class Home {

    private final By HomeValue = By.id("homeval");
    private final By DownPayment = By.id("downpayment");
    private final By DownPaymentInDollar = By.name("param[downpayment_type]");
    private final By LoanAmount = By.id("loanamt");
    private final By InterestRate = By.id("intrstsrate");
    private final By LoanTerm = By.id("loanterm");
    private final By MonthDropDown = By.name("param[start_month]");
    private final By StartYear = By.id("start_year");
    private final By PropertyTax = By.id("pptytax");
    private final By Pmi = By.id("pmi");
    private final By Hoi = By.id("hoi");
    private final By Hoa = By.id("hoa");
    private final By LoanType = By.name("param[milserve]");
    private final By RefiOrBuyr = By.name("param[refiorbuy]");
    private final By Calculate = By.name("cal");

    public WebDriver driver;

    public Home(WebDriver driver) {

        this.driver = driver;

    }



    //Enter Home value
    public Home typeHomePrice(String value) {
        ActOn.element(driver, HomeValue).setValue(value);
        return this;

    }
    public Home typeDownPayment(String value) {
        ActOn.element(driver, DownPayment).setValue(value);
        return this;
    }
    public Home clickDownPaymentInDollar() {
        ActOn.element(driver, DownPaymentInDollar).click();
        return this;
    }
    public Home typeLoanAmount(String value) {
        ActOn.element(driver, LoanAmount).setValue(value);
        return this;
    }
    public Home typeInterestRate(String value) {
        ActOn.element(driver, InterestRate).setValue(value);
        return this;
    }
    public Home typeLoanTermYears(String value) {
        ActOn.element(driver, LoanTerm).setValue(value);
        return this;
    }
    public Home selectMonth(String value) {
        ActOn.element(driver, MonthDropDown).selectValue(value);
        return this;
    }
    public Home selectYear(String value) {
        ActOn.element(driver, StartYear).setValue(value);
        return this;
    }
    public Home typePropertyTax(String value) {
        ActOn.element(driver, PropertyTax).setValue(value);
        return this;
    }
    public Home typePmi(String value) {
        ActOn.element(driver, Pmi).setValue(value);
        return this;
    }
    public Home typeHomeOwnerInsurance(String value) {
        ActOn.element(driver, Hoi).setValue(value);
        return this;
    }
    public Home typeMonthlyHoa(String value) {
        ActOn.element(driver, Hoa).setValue(value);
        return this;
    }
    public Home selectLoanType(String value) {
        ActOn.element(driver, LoanType).selectValue(value);
        return this;
    }
    public Home selectBuyOrRefinance(String value) {
        ActOn.element(driver, RefiOrBuyr).selectValue(value);
        return this;
    }
    public Home clickOnCalculateButton() {
        ActOn.element(driver, Calculate).click();
        return this;
    }
    public Home validateTotalMonthlyPayment(String expectedTotalMonthlyPayment) {
        String formattedXPath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);
        By monthlyPayment = By.xpath(formattedXPath);

        AssertThat.elementAssertions(driver, monthlyPayment).elementIsDisplayed();
        return this;
    }
}
