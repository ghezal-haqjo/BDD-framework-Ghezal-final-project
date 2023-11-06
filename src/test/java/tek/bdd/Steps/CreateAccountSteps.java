package tek.bdd.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.Pages.Homepage;
import tek.bdd.Pages.createAccountPage;
import tek.bdd.Utality.SelenuiamUtality;

public class CreateAccountSteps extends SelenuiamUtality {

    @When("enter Email Address")
    public void enter_email_address_as() {
       enterValue(createAccountPage.EMAIL_ADDRESS, generateRandomEmail());

    }
    @When("enter Firstname as {string}")
    public void enter_firstname_as(String firstname) {
        enterValue(createAccountPage.FIRST_NAME, firstname);

    }
    @When("Select Gender {string}")
    public void select_gender(String gender) {
        enterValue(createAccountPage.GENDER, gender);

    }
    @When("enter Employment Status {string}")
    public void enter_employment_status(String employment) {
        enterValue(createAccountPage.EMPLOYMENT_STATUS, employment);

    }
    @When("select Title or Prefix {string}")
    public void select_title_or_prefix(String title) {
        enterValue(createAccountPage.TITLE, title);

    }
    @When("enter Lastname {string}")
    public void enter_lastname(String lastname) {
        enterValue(createAccountPage.LAST_NAME, lastname);

    }
    @When("select Marital Status {string}")
    public void select_marital_status(String marital) {
        enterValue(createAccountPage.MARITAL_STATUS, marital);

    }
    @When("enter Date Of Birth {string}")
    public void enter_date_of_birth(String dateOfBirth) {
        enterValue(createAccountPage.DATE_OF_BIRTH, dateOfBirth);

    }
    @When("click on Create Account button")
    public void click_on_create_account_button() throws InterruptedException {
        clickOnElement(createAccountPage.CREATE_ACCOUNT_BUTTON);
        Thread.sleep(3000);

    }
    @Then("validate user is on {string} page")
    public void validate_user_is_on(String expectedValue) {
        String Actual = getElementText(createAccountPage.PAGE_HEADER_TITLE);
        Assert.assertEquals("validate sing up page title", Actual, expectedValue);

    }
    @Then("validate email address")
    public void validate_email_address_should_be()  {
        String actualEmail = getElementText(createAccountPage.ACTUAL_EMAIL);
        Assert.assertEquals("validate expected email on login page", actualEmail, email);

    }

    @Then("validate error message as {string}")
    public void validateErrorMessage(String expectedError) throws InterruptedException {
        Thread.sleep(5000);
        String actualError = getElementText(createAccountPage.ERROR_MESSAGE);
       Assert.assertEquals("validate ", expectedError, actualError);
    }

    @When("enter Email Address as {string}")
    public void enterEmailAddressAs(String expected) {
        enterValue(createAccountPage.EMAIL_ADDRESS, expected);
    }
    @When("click on create primary account button")
    public void clickOnPrimaryAccountButton() {
        clickOnElement(Homepage.CREATE_PRIMARY_ACCOUNT_BUTTON);

    }

    @Then("validate create account title should be {string}")
    public void validateCreateAccountTitle(String expectedTitle) {
        String ActualTitle = getElementText(createAccountPage.PAGE_TITLE);
        Assert.assertEquals(expectedTitle, ActualTitle);

    }

}
