package tek.bdd.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Atunci;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.Pages.Homepage;
import tek.bdd.Utality.SelenuiamUtality;

public class HomepageLoginSteps extends SelenuiamUtality {

    @Then("validate application title is {string}")
    public void validateTitleIs(String ExpectedTitle) {
        String ActualTitle = GetDriver().getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }

    @Then("validate {string} button is exist")
    public void validateLoginButtonIsExist(String ExpectedCondition) {
        String Actual = getElementText(Homepage.CREATE_PRIMARY_ACCOUNT_BUTTON);
     Assert.assertEquals(ExpectedCondition, Actual);

    }




}