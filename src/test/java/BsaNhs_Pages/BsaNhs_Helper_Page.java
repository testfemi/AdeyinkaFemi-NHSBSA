package BsaNhs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This Page will help will help with all general elements (eg NextButton, Yes or No butoon )
 */


public class BsaNhs_Helper_Page {


    public BsaNhs_Helper_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);


    }

    @FindBy(id = "next-button")
    public WebElement nextButton;

    @FindBy(id = "label-no")
    public WebElement noRadio;

    @FindBy(id = "label-yes")
    public WebElement yesRadio;


    @FindBy(id = "nhsuk-cookie-banner__link_accept_analytics")
    public WebElement cookies;


    // To select Next Button and if cookies pops up at any page
    public void NextButton() throws Exception {
        nextButton.click();

        try {
            cookies.click();

        } catch (Exception e) {
            // System.out.println("Issues with Cookies: To Handle later");

        }

    }

    public void NoRadio() {
        noRadio.click();

    }

    public void YesRadio() {
        yesRadio.click();

    }


}
