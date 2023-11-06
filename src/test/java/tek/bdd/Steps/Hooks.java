package tek.bdd.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tek.bdd.Utality.SelenuiamUtality;

public class Hooks extends SelenuiamUtality {
    @Before
    public void setUpTests(){
        OpenBrowser();

    }
    @After
public void cleanUpTest(Scenario scenario){
        if(scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) GetDriver();
            screenshot.getScreenshotAs(OutputType.BYTES);
            byte[] picture = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(picture, "image/png", "failedScreenshot");
        }
        driverQuit();
}


}
