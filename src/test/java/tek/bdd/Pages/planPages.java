package tek.bdd.Pages;

import org.openqa.selenium.By;

public class planPages {
public static final By PLAN_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]");
public static final By DATE_CREATED = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");
public static final By DATE_EXPIRED = By.xpath("//div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");
public static final By PLANS_DATA = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr");
public static By getDateCreated(int date){
    return By.xpath("//tbody/tr["+date+"]/td[4]");
}
}
