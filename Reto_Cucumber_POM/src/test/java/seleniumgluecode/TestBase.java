package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.AuthenticationPage;
import pom.HomePage;
import pom.MeetingPage;
import pom.RegisterPage;

public class TestBase
{
    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected AuthenticationPage authenticationPage = new AuthenticationPage(driver);
    protected RegisterPage registerPage = new RegisterPage(driver);
    protected MeetingPage meetingPage = new MeetingPage(driver);
}
