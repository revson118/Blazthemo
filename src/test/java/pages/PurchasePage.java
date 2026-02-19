package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zip = By.id("zipCode");
    By cardNumber = By.id("creditCardNumber");
    By purchaseBtn = By.cssSelector("input[type='submit']");

    public void enterPassengerDetails(String n, String a, String c, String s, String z, String card) {
        driver.findElement(name).sendKeys(n);
        driver.findElement(address).sendKeys(a);
        driver.findElement(city).sendKeys(c);
        driver.findElement(state).sendKeys(s);
        driver.findElement(zip).sendKeys(z);
        driver.findElement(cardNumber).sendKeys(card);
    }

    public void clickPurchase() {
        driver.findElement(purchaseBtn).click();
    }
}
