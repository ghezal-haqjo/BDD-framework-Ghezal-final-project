package tek.bdd.Utality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.Base.Base;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelenuiamUtality extends Base {

    public static String email;

    public String getElementText(By locator) {
        WebDriverWait wait = new WebDriverWait(GetDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(GetDriver(), Duration.ofMinutes(1));

    }

    public void clickOnElement(By locator) {
        WebDriverWait wait = new WebDriverWait(GetDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

    }

    public void enterValue(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(GetDriver(), Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(text);
    }

    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String domain = "tekschool.us";
        int usernameLength = 10;

        StringBuilder randomEmail = new StringBuilder();

        Random random = new Random();

        // Generate the username part
        for (int i = 0; i < usernameLength; i++) {
            int index = random.nextInt(allowedChars.length());
            randomEmail.append(allowedChars.charAt(index));
        }

        // Append the domain
        randomEmail.append("@").append(domain);
        email = randomEmail.toString();
        return email;

    }
    public List<WebElement> getWaitOfElements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public int getSizeOfElement(By locator) {
       return getWaitOfElements(locator).size();

    }

    }


