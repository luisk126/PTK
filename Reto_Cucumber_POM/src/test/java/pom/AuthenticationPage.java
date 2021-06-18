package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage
{
    private String tituloPaginaAuthentication = "Login";
    private String tituloPaginaIntakeAuthentication = "Dashboard - StartSharp";

    private By txtUsuarioLocator = By.id("StartSharp_Membership_LoginPanel0_Username");
    private By txtPasswordLocator = By.id("StartSharp_Membership_LoginPanel0_Password");
    private By btnSignInLocator = By.id("StartSharp_Membership_LoginPanel0_LoginButton");
    //Organization
    private By btnOrganizationLocator = By.xpath("//span[contains(text(),'Organization')]");
    private By btnBusinessUnitsLocator = By.xpath("//span[contains(text(),'Business Units')]");


    private By ventanaErrorLocator = By.id("create_account_error");

    private String Email = "";


    public By getTxtUsuarioLocator()
    {
        return txtUsuarioLocator;
    }


    public By getTxtPasswordLocator()
    {
        return txtPasswordLocator;
    }

    public AuthenticationPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean authenticationPageIsDispalyed() throws Exception
    {
        return this.getTitle().equals(tituloPaginaAuthentication);
    }

    public boolean authenticationPageIntakeIsDispalyed() throws Exception
    {
        return this.getTitle().equals(tituloPaginaIntakeAuthentication);
    }

    public boolean authenticationPageElementIsDispalyed() throws Exception
    {
        return this.isDisplayed(ventanaErrorLocator);
    }

    public void authenticationPageClick() throws Exception
    {
        this.click(btnSignInLocator);
    }

    public void authenticationPageOrganizationClick() throws Exception
    {
        this.click(btnOrganizationLocator);
    }

    public void authenticationPageBusinessUnitsClick() throws Exception
    {
        this.click(btnBusinessUnitsLocator);
    }

    public String authenticationPagegetText() throws Exception
    {
        return this.getText(ventanaErrorLocator);
    }

}
