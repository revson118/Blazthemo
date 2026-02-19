package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservePage {

    WebDriver driver;

    public ReservePage(WebDriver driver) {
        this.driver = driver;
    }

    By chooseFlightBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public void chooseFlight() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@value='Choose This Flight']")));

        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();
    }
}
