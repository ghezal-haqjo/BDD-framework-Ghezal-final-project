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

            public void OpenBrowser() {
                //step to read a property file
                //step 1) the absolute file path the property file.
                String configPath = System.getProperty("user.dir")+"/src/test/resources/config/dev.env.cofig.properties";
                //step 2) create object from properties class in java library.
                Properties properties = new Properties();
                //step 3) LOAD OBJECT FROM PROPERTIES CLASS IN JAVA Library.
                try {
                    FileInputStream devConfigFile = new FileInputStream(configPath);
                    properties.load(devConfigFile);
                }catch (IOException e){//is a class
                    e.printStackTrace();//print exception
                }

                String devURL = properties.getProperty("ui.url");
                String browserType = properties.getProperty("ui.browser.type");

                if (browserType.equalsIgnoreCase("chrome")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);
                } else if (browserType.equalsIgnoreCase("firefox")) {
                    driver = new FirefoxDriver();
                } else if (browserType.equalsIgnoreCase("edge")) {
                    driver = new EdgeDriver();
                } else {
                    throw new RuntimeException("Wrong Browser Type");
                }
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                driver.get(APP_URL);
            }
            public WebDriver GetDriver() {
                return driver;
            }
            public void driverQuit() {
                if (driver != null) {
                    GetDriver().quit();
                }
            }
        }

