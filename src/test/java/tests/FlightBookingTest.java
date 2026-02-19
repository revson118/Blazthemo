package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.*;
import com.baseClass.BaseTest;

public class FlightBookingTest extends BaseTest {

    @Test(groups = "smoke")
    public void verifyHomePageLoads() {
        Assert.assertTrue(driver.getTitle().contains("BlazeDemo"));
    }

    @Test(groups = "functional")
    public void completeFlightBooking() {

        HomePage home = new HomePage(driver);
        home.selectDeparture("Boston");
        home.selectDestination("New York");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails(
                "Hrithik Rudra",
                "Street 1",
                "IND",
                "IN",
                "10001",
                "1234567890123456"
        );
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);
        Assert.assertTrue(confirm.getConfirmationMessage().contains("Thank you"));
    }

    @Test(dataProvider = "bookingData", groups = "data-driven")
    public void multipleBookings(String name, String card) {

        HomePage home = new HomePage(driver);
        home.selectDeparture("Boston");
        home.selectDestination("London");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails(
                name,
                "Street",
                "City",
                "State",
                "12345",
                card
        );
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);
        Assert.assertTrue(confirm.getConfirmationMessage().contains("Thank you"));
    }

    @DataProvider
    public Object[][] bookingData() {
        return new Object[][]{
                {"Hrithik", "1111222233334444"},
                {"Rudra", "5555666677778888"}
        };
        
    }
}
