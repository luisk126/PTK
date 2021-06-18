package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage
{
    private String tituloPaginaHome = "Login";

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public boolean homePageIsDispalyed() throws Exception
    {
        return this.getTitle().equals(tituloPaginaHome);
    }
}
