package tek.bdd.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import tek.bdd.Pages.UserProfile;
import tek.bdd.Utality.SelenuiamUtality;

public class UserprofileSteps extends SelenuiamUtality {

    @When("click on profile button")
    public void click_on_profile_button() {
        clickOnElement(UserProfile.PROFILE_button);
    }

    @Then("validate profile side drawer title should be {string}")
    public void validateSideDrawerTitle(String ExpectedValue) {
       String Actual = getElementText(UserProfile.PROFILE_header);
       Assert.assertEquals(Actual,ExpectedValue);

    }

    @Then("validate profile side drawer name should be {string}")
    public void validateProfileSideDrawerNameShouldBe(String Expected) {
        String actual = getElementText(UserProfile.NAME);
        Assert.assertEquals(actual,Expected);
    }

    @Then("validate profile side drawer Username should be {string}")
    public void validateProfileSideDrawerUsernameShouldBe(String expected) {
        String actual = getElementText(UserProfile.USERNAME_NAME);
        Assert.assertEquals(actual,expected);
    }


    @Then("validate profile side drawer authorities should be {string}")
    public void validateProfileSideDrawerAuthoritiesShouldBe(String expected) {
        String actual = getElementText(UserProfile.AUTHORITIES_NAME);
        Assert.assertEquals(actual,expected);
    }

    @Then("validate profile side drawer Logout should be {string}")
    public void validateProfileSideDrawerLogoutShouldBe(String expected) {
        String actual = getElementText(UserProfile.LOG_OUT_BUTTON);
        Assert.assertEquals(actual,expected);
    }

    @Then("validate profile side drawer nameValue should be {string}")
    public void validateProfileSideDrawerNameValueShouldBe(String expected) {
        String actual = getElementText(UserProfile.SUPERVISOR_NAME);
        Assert.assertEquals(actual,expected);

    }

    @Then("validate profile side drawer UsernameValue should be {string}")
    public void validateProfileSideDrawerUsernameValueShouldBe(String expected) {
        String actual = getElementText(UserProfile.SUPERVISOR_USERNAME);
        Assert.assertEquals(actual,expected);

    }

    @Then("validate profile side drawer authoritiesValue should be {string}")
    public void validateProfileSideDrawerAuthoritiesValueShouldBe(String expected) {
        String actual = getElementText(UserProfile.ADMIN_NAME);
        Assert.assertEquals(actual,expected);
    }

    @Then("click on profile side drawer Logout")
    public void clickOnProfileSideDrawerLogout() {
        clickOnElement(UserProfile.LOG_OUT_BUTTON);
    }

    @Then("validate user is in {string} homepage")
    public void validateUserIsInHomepage(String expected) {
        String actual = getElementText(UserProfile.PAGE_HEADER_TITLE);
        Assert.assertEquals(actual,expected);
    }
}
