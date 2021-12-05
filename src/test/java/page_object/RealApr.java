package page_object;

import command_providers.ActOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealApr extends NavigationBar{

    private final By CalculatorTab = By.xpath("//label[text()= 'Calculator']");
    private final By HomePriceInputFields = By.name("HomeValue");
    private final By DownPaymentInDollar = By.name("DownPaymentSel");
    private final By DownPaymentInputFields = By.name("DownPayment");
    private final By InterestRatesInputFields = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table[1]/tbody/tr/td/strong[text()='Actual APR:']/../../td[2]/strong");


    public RealApr(WebDriver driver) {
        super(driver);
    }
    public RealApr waitForPageToLoad() {
        ActOn.wait(driver, CalculatorTab).waitForElementToBeVisible();
        return this;
    }
    public RealApr typeHomePrice(String value) {
        ActOn.element(driver, HomePriceInputFields).setValue(value);
        return this;
    }
    public RealApr typeDownPayment(String value) {
        ActOn.element(driver, DownPaymentInputFields).setValue(value);
        return this;
    }
    public RealApr selectDownPaymentInDollar() {
        ActOn.element(driver, DownPaymentInDollar).click();
        return this;
    }
    public RealApr typeInterestRate(String value) {
        ActOn.element(driver, InterestRatesInputFields).setValue(value);
        return this;
    }
    public RealApr clickOnCalculateButton() {
        ActOn.element(driver, CalculateRateButton).click();
        return this;
    }

    public RealApr validateAprRate(String expectedValue) {
        String AprRate = ActOn.element(driver, ActualAprRate).getTextValue();
        // now I will do the comparison
        Assert.assertEquals(AprRate, expectedValue);
        return this;
    }
}



