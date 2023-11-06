package tek.bdd.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.Pages.loginPage;
import tek.bdd.Utality.SelenuiamUtality;

public class LoginSteps extends SelenuiamUtality {
    @When("click on login button")
    public void clickOnLoginButton() {
        clickOnElement(loginPage.LOGIN_BUTTON);
    }

    @When("enter username {string}")
    public void enter_username(String username) {
        enterValue(loginPage.USERNAME, username);

    }

    @When("enter password {string}")
    public void enter_password(String password) throws InterruptedException {
        enterValue(loginPage.PASSWORD, password);
        Thread.sleep(2000);

    }

    @When("click on sign in button")
    public void clickOnSignInButton() throws InterruptedException {
        clickOnElement(loginPage.SIGN_IN_BUTTON);
        Thread.sleep(2000);

    }

    @Then("validate title {string}")
    public void validate_title(String expectedTitle) {
        String actual = getElementText(loginPage.HEADER_TITLE);
        Assert.assertEquals("validate header title", actual, expectedTitle);
    }


    @Then("validate error message {string}")
    public void validateErrorMessage(String expected) {
    }
}
