package tek.bdd.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.Pages.AccountPage;
import tek.bdd.Utality.SelenuiamUtality;


public class AccountSteps extends SelenuiamUtality {
    @Then("validate accounts {int} rows is default")
    public void validate_accounts_rows_is_default(int expected) {
        int actual = getSizeOfElement(AccountPage.ACCOUNT_ROWS);
     Assert.assertEquals(actual, expected);
    }

    @When("click on account button")
    public void clickOnAccountButton() {
        clickOnElement(AccountPage.ACCOUNT_BUTTON);
    }

    @When("click on change show button")
    public void clickOnChangeShowButton() {
        clickOnElement(AccountPage.ACCOUNT_SHOW_SELECT);
    }

    @When("select 10 show")
    public void selectShow10() {
       clickOnElement(AccountPage.ACCOUNT_SHOW_10);
    }

    @Then("validate {int} values are correct")
    public void validateValuesAreCorrect10(int  expected) {
        int actual = getSizeOfElement(AccountPage.SHOW_10_VALUES);
        Assert.assertEquals(actual, expected);
    }

    @Then("validate {int} show values")
    public void validateShowValues25(int expected) {
        int actual = getSizeOfElement(AccountPage.SHOW_25_VALUES);
        Assert.assertEquals(actual, expected);

    }

    @Then("validate {int} values")
    public void validateValues50(int expected ) throws InterruptedException {
        Thread.sleep(3000);
        int actual = getSizeOfElement(AccountPage.SHOW_50_VALUES);
        Assert.assertEquals(actual, expected);
    }

    @When("select 25 show")
    public void selectShow25() {
        clickOnElement(AccountPage.ACCOUNT_SHOW_25);

    }

    @When("select 50 show")
    public void selectShow50() throws InterruptedException {
        clickOnElement(AccountPage.ACCOUNT_SHOW_50);
        Thread.sleep(5000);
    }
}
