package BsaNhs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BshNhs_DateOfBirth_Page {

    public BshNhs_DateOfBirth_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dob-day")
    public WebElement textday;

    @FindBy(id = "dob-month")
    public WebElement textmonth;

    @FindBy(id = "dob-year")
    public WebElement texxtyear;


    public void inputKeywords(String day, String month, String Year) {
        textday.sendKeys(day);
        textmonth.sendKeys(month);
        texxtyear.sendKeys(Year);

    }


}
