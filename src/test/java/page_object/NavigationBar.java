package page_object;

import command_providers.ActOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

    public WebDriver driver;
    private final By MortgageCalculatorLogo = By.xpath("//a/img[@alt='Logo']");
    private final By RatesLink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    //Navigate to Home page
    public Home navigateToHome() {
        ActOn.element(driver, MortgageCalculatorLogo).click();
        return new Home(driver);

    }
    //Mouse Hover To Rate's Link
    public NavigationBar mouseHoverToRates() {
        ActOn.element(driver, RatesLink).mouseHover();
        return this;
    }
    //Navigate to RealApr Page
    public RealApr navigateToRealApr() {
        ActOn.element(driver, RealAprLink).click();
        return new RealApr(driver);
    }
}