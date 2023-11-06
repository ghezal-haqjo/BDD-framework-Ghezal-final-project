package tek.bdd.Pages;

import org.openqa.selenium.By;

public class UserProfile {

    public static final By PROFILE_button = By.xpath("/html/body/div[1]/div/div[1]/div/button");
    public static final By PROFILE_header = By.xpath("/html/body/div[3]/div[3]/div/div/header");
    public static final By STATUS_NAME = By.xpath("//div[3]/div/div/div/div/div/div[1]/p[1]");
    public static final By ACTIVE_NAME =By.xpath("//div[1]/p[2]/span/span");
    public static final By USER_TYPE_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[1]");
    public static final By CSR_NAME = By.xpath("//div/div/div/div/div/div[2]/p[2]");
    public static final By NAME = By.xpath("//div[3]/div/div/div/div/div/div[3]/p[1]");
    public static final By SUPERVISOR_NAME = By.xpath("//div/div/div/div/div/div[3]/p[2]");
    public static final By USERNAME_NAME = By.xpath("//div/div/div/div/div/div[4]/p[1]");
    public static final By SUPERVISOR_USERNAME = By.xpath("//div/div/div/div/div/div[4]/p[2]");
    public static final By AUTHORITIES_NAME = By.xpath("//div/div/div/div/div/div[5]/p");
    public static final By ADMIN_NAME = By.xpath("//div/div/div/div/div/div[5]/ul/li");
    public static final By LOG_OUT_BUTTON = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");
    public final static  By PAGE_HEADER_TITLE = By.xpath("/html/body/div[1]/div/div[1]/div/h2");
}
