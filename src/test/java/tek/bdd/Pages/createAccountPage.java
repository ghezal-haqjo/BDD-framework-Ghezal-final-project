package tek.bdd.Pages;

import org.openqa.selenium.By;

public class createAccountPage {

    public final static By EMAIL_ADDRESS = By.xpath("//div/form/div/div[1]/div[1]/input");
    public final static By FIRST_NAME = By.xpath("//div/form/div/div[1]/div[3]/input");
    public final static By GENDER = By.xpath("//form/div/div[1]/div[5]/div/select");
    public final static By EMPLOYMENT_STATUS = By.name("employmentStatus");
    public final static By TITLE = By.id("title");
    public final static By LAST_NAME = By.id("lastName");
    public final static By MARITAL_STATUS = By.id("maritalStatus");
    public final static By DATE_OF_BIRTH = By.id("dateOfBirth");
    public final static By CREATE_ACCOUNT_BUTTON = By.xpath("//form/div/div[2]/button[1]");
    public final static By PAGE_HEADER_TITLE = By.xpath("//div/div[2]/div/div/div/h2[1]");
    public final static By ACTUAL_EMAIL = By.xpath("//div/div/h2[3]");
    public final static By ERROR_MESSAGE = By.xpath("//div/form/div[1]/div");
}
