package tek.bdd.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Base {

        private static WebDriver driver;
        private final String APP_URL ="https://dev.insurance.tekschool-students.com/";
        public final String BROWSER_TYPE = "chrome";

        public void OpenBrowser(){
            String ConfigFilePath = System.getProperty("user.dir")+ "/src/test/resources/config/dev.env.config.properties";



            if(BROWSER_TYPE.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver( options );
            }else if(BROWSER_TYPE.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }else if  (BROWSER_TYPE.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }else{
                throw new RuntimeException("Wrong Browser Type");

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.get(APP_URL);


        }
        public WebDriver GetDriver(){
            return driver;
        }
public void driverQuit(){
            if(driver != null){
            driver.close();
}
}}
