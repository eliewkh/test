package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
 //  protected static WebDriver driver=DriverSingleton.getInstance();
     public static WebDriver driver;

    public void SetUPBeforeAll() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Delete all cookies
        driver.manage().deleteAllCookies();

        //Maximize Window
        driver.manage().window().maximize();


        }



    public void OpenBrowser() {
        try {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriverr.exe");
           System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");

         //   driver = new ChromeDriver();
            driver = new FirefoxDriver();
            SetUPBeforeAll();
            driver.get("http://www.facebook.com");
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }
}

