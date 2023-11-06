package tek.bdd.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;
import java.time.Duration;

public class Base {

        private static WebDriver driver;
        private final String APP_URL ="https://dev.insurance.tekschool-students.com/";
        public final String BRAWSER_TYPE = "chrome";

        public void OpenBrowser(){
            String ConfigFilePath = System.getProperty("user.dir")+ "//src/test/resources/config/qa_env_config.properties";
            if(BRAWSER_TYPE.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver();
            }else if(BRAWSER_TYPE.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }else if  (BRAWSER_TYPE.equalsIgnoreCase("edge")) {
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
