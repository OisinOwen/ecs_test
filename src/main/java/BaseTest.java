import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    //Create driver
    public static WebDriver driver;

    //Set up test for Chrome on Windows. Tech debt: Other browsers and other OSs
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("localhost:3000");
    }

    //Kill driver after test
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}