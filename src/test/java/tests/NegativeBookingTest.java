package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.*;
import com.baseClass.BaseTest;

public class NegativeBookingTest extends BaseTest {

    @Test(groups = "negative")
    public void blankCreditCardTest() {

        HomePage home = new HomePage(driver);
        home.selectDeparture("Boston");
        home.selectDestination("Paris");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails(
                "Test User",
                "Address",
                "City",
                "State",
                "12345",
                ""  // blank card
        );
        purchase.clickPurchase();

        // Validation: Confirmation should NOT appear
        Assert.assertFalse(driver.getPageSource().contains("Thank you"));
    }

    @Test(groups = "negative")
    public void invalidCreditCardTest() {

        HomePage home = new HomePage(driver);
        home.selectDeparture("Boston");
        home.selectDestination("London");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails(
                "Test User",
                "Address",
                "City",
                "State",
                "12345",
                "ABC123XYZ"  // invalid card
        );
        purchase.clickPurchase();

        Assert.assertFalse(driver.getPageSource().contains("Thank you"));
    }
}
