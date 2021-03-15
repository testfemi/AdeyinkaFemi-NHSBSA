package BsaNhs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


/**
 * This Page will help will help with all general elements (eg NextButton, Yes or No butoon )
 */


public class BshNhs_Wales_Result_Page {

    public BshNhs_Wales_Result_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div[2]")

    public WebElement resultPage;

    public void ResultPageChecker(String ExpectedWordings) {
        String Actualwordings = resultPage.getText();
        Assert.assertEquals(ExpectedWordings, Actualwordings, "Verify Confirmation Result");

    }

}
