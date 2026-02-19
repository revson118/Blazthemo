package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By departureCity = By.name("fromPort");
    By destinationCity = By.name("toPort");
    By findFlightsBtn = By.cssSelector("input[type='submit']");

    public void selectDeparture(String city) {
        driver.findElement(departureCity).sendKeys(city);
    }

    public void selectDestination(String city) {
        driver.findElement(destinationCity).sendKeys(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }
}
