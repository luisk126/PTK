package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage
{
    //private By txtNameNewBusinessLocator = By.id("StartSharp_Organization_BusinessUnitDialog7_Name");
    private By txtNameNewBusinessLocator = By.cssSelector("input[name='Name']");
    //input[name='Name']
    private By btnNewBusinessLocator = By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
    private By btnSaveNewBusinessLocator = By.xpath("//span[contains(text(),'Save')]");

    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    public By getTxtNameNewBusinessLocator()
    {
        return txtNameNewBusinessLocator;
    }

    public void registerNewBusinessPageClick() throws Exception
    {
        this.click(btnNewBusinessLocator);
    }

    public void registerSaveNewBusinessPageClick() throws Exception
    {
        this.click(btnSaveNewBusinessLocator);
    }
}
