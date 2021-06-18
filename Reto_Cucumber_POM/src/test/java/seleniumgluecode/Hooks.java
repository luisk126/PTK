package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks
{
    private static ChromeDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://serenity.is/demo/");
        driver.manage().window().maximize();
    }


    @After
    public void tearDown()
    {
        //driver.quit();
    }

    public static ChromeDriver getDriver()
    {
        return driver;
    }
}
