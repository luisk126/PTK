package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeetingPage extends BasePage
{

    private By btnNewMetingLocator = By.xpath("//span[contains(text(),'New Meeting')]");
    private By btnMeetingLocator = By.xpath("//body[1]/div[2]/aside[1]/section[1]/div[1]/ul[1]/li[5]/a[1]/span[1]");
    private By btnMeetingsLocator = By.xpath("//span[contains(text(),'Meetings')]");
    private By txtMeetingNameLocator = By.xpath("//input[@name='MeetingName']");
    private By txtMeetingNumberLocator = By.xpath("//input[@name='MeetingNumber']");
    private By txtUnitLocator = By.xpath("input[@class='select2-input']");
    private By btnSaveMeetingLocator = By.xpath("//span[contains(text(),'Save')]");

    public MeetingPage(WebDriver driver)
    {
        super(driver);
    }


    public void meetingPageClick() throws Exception
    {
        this.click(btnMeetingLocator);
    }

    public void meetingsPageClick() throws Exception
    {
        this.click(btnMeetingsLocator);
    }

    public void meetingSaveMeetingPageClick() throws Exception
    {
        this.click(btnSaveMeetingLocator);
    }

    public void newMeetingPageClick() throws Exception
    {
        this.click(btnNewMetingLocator);
    }

    public By getTxtMeetingNameLocator()
    {
        return txtMeetingNameLocator;
    }

    public By getTxtMeetingNumberLocator()
    {
        return txtMeetingNumberLocator;
    }

    public By getTxtUnitLocator()
    {
        return txtUnitLocator;
    }
}
