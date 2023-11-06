package tek.bdd.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.Pages.planPages;
import tek.bdd.Utality.SelenuiamUtality;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlansSteps extends SelenuiamUtality {
    public static String todayDate;
    @When("click on plans page")
    public void click_on_plans_page() {
        clickOnElement(planPages.PLAN_BUTTON);

    }
    @Then("validate {int} row of data is present")
    public void validate_row_of_data_is_present(int expected) {
        int actual = getSizeOfElement(planPages.PLANS_DATA);
        Assert.assertEquals("validating plans row", actual, expected);

    }

    @Then("validate created date is today")
    public void validateCreatedDateIs() {
        String actual = getElementText(planPages.DATE_CREATED);
        Assert.assertEquals("validate created date", getCurrentDate(), actual);
    }

    @Then("validate expired date is tomorrow")
    public void validateExpiredDateIs() {
        String actual = getElementText(planPages.DATE_EXPIRED);
        Assert.assertEquals(actual, getExpiredDate());

    }
    public static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
       todayDate = currentDate.format(formatter).trim();
        return todayDate;

    }
    public static String getExpiredDate() {
        LocalDate todayDate = LocalDate.now();
        LocalDate tomorrow = todayDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String  expiredDateITomorrow = tomorrow.format(formatter);
        return expiredDateITomorrow ;
    }
}

