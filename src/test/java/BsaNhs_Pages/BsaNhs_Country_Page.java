package BsaNhs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Which country do you live in Page
 */

public class BsaNhs_Country_Page {

    public BsaNhs_Country_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "label-wales")
    public WebElement country;

    public void Country() throws Exception {

        country.click();

    }


}
