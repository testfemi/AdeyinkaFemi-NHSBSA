package BsaNhs_StepDefinition;

import baseUtility.baseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BshNhs_Hook extends baseClass {

    private baseClass base;

    public BshNhs_Hook(baseClass base) {

        this.base = base;
    }

    @Before
    public void openBrowser() {
        String browserName = "chrome";

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            base.driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
            base.driver = new FirefoxDriver();
            //firefox code

        } else if (browserName.equals("IE")) {

            driver = new FirefoxDriver();
            //firefox code

        }
    }

    @After
   public void closeBrowser() {
      base.driver.close();
   }


}

