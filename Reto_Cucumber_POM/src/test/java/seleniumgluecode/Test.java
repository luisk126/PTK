package seleniumgluecode;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class Test extends TestBase
{


    @Given("^El usuario se ubica en la pagina de inicio de StarSharp$")
    public void el_usuario_se_ubica_en_la_pagina_de_inicio_de_StarSharp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(homePage.homePageIsDispalyed());
    }

    @When("^Realiza proceso de usuario y password despues click en SignIn$")
    public void realiza_proceso_de_usuario_y_password_despues_click_en_SignIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //homePage.clickSingIn();

        Assert.assertTrue(authenticationPage.authenticationPageIsDispalyed());

        WebElement txtUsuarioLocator = driver.findElement(authenticationPage.getTxtUsuarioLocator());
        txtUsuarioLocator.clear();
        txtUsuarioLocator.sendKeys("admin");

        WebElement txtPasswordLocator = driver.findElement(authenticationPage.getTxtPasswordLocator());
        txtPasswordLocator.clear();
        txtPasswordLocator.sendKeys("serenity");

        authenticationPage.authenticationPageClick();

        //Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @Then("^Se direcciona a la pagina de crear nueva reunion$")
    public void se_direcciona_a_la_pagina_de_crear_nueva_reunion() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        Assert.assertTrue(authenticationPage.authenticationPageIntakeIsDispalyed());

        authenticationPage.authenticationPageOrganizationClick();
        authenticationPage.authenticationPageBusinessUnitsClick();

        //nuevo pagina Business Units - StartSharp

        registerPage.registerNewBusinessPageClick();

        WebElement txtNameNewBusinessLocator = driver.findElement(registerPage.getTxtNameNewBusinessLocator());
        txtNameNewBusinessLocator.clear();
        txtNameNewBusinessLocator.sendKeys("Unidad1");

        registerPage.registerSaveNewBusinessPageClick();


        //nuevo pagina Meeting

        meetingPage.meetingPageClick();
        Thread.sleep(3000);
        meetingPage.meetingsPageClick();
        Thread.sleep(3000);
        meetingPage.newMeetingPageClick();


        WebElement txtMeetingNameLocator = driver.findElement(meetingPage.getTxtMeetingNameLocator());
        txtMeetingNameLocator.clear();
        txtMeetingNameLocator.sendKeys("General Nuevo");

        WebElement txtMeetingNumberLocator = driver.findElement(meetingPage.getTxtMeetingNumberLocator());
        txtMeetingNumberLocator.clear();
        txtMeetingNumberLocator.sendKeys("2");
        /*
        WebElement txtUnitLocator = driver.findElement(meetingPage.getTxtUnitLocator());
        txtUnitLocator.clear();
        txtUnitLocator.sendKeys("Unidad25");
        txtUnitLocator.sendKeys(Keys.ENTER);
        */

        meetingPage.meetingSaveMeetingPageClick();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;




    }



}
