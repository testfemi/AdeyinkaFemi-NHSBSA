package BsaNhs_StepDefinition;

import BsaNhs_Pages.BsaNhs_Country_Page;
import BsaNhs_Pages.BsaNhs_Helper_Page;
import BsaNhs_Pages.BshNhs_DateOfBirth_Page;
import BsaNhs_Pages.BshNhs_Wales_Result_Page;
import baseUtility.baseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

@Test
public class BshNhs_E2E_Wales_Checker_StepDefinition extends baseClass {

    public baseClass base;
    public BsaNhs_Helper_Page helper_Page;
    public BsaNhs_Country_Page country_Page;
    public BshNhs_DateOfBirth_Page DateOfBirth_Page;
    public BshNhs_Wales_Result_Page wales_Result_Page;

    public BshNhs_E2E_Wales_Checker_StepDefinition(baseClass base) {

        this.base = base;

        helper_Page = new BsaNhs_Helper_Page(base.driver);
        country_Page = new BsaNhs_Country_Page(base.driver);
        DateOfBirth_Page = new BshNhs_DateOfBirth_Page(base.driver);
        wales_Result_Page = new BshNhs_Wales_Result_Page(base.driver);

    }

    @Given("^that I am on the Landing Page Using URL \"([^\"]*)\"$")
    public void thatIAmOnTheLandingPageUsingURL(String webUrl) {
        base.driver.navigate().to(webUrl);
    }

    @When("^I click on Start button$")
    public void iClickOnStartButton() throws Exception {
        helper_Page.NextButton();
    }

    @And("^I click on Wales Radio button \\(Question  - Which country do you live in\\?\\)$")
    public void iClickOnWalesRadioButtonQuestionWhichCountryDoYouLiveIn() throws Exception {
        country_Page.Country();
    }

    @And("^I click on Next button$")
    public void iClickOnNextButton() throws Exception {
        helper_Page.NextButton();

    }

    @And("^I enter Day as \"([^\"]*)\", Month as \"([^\"]*)\" and Year as \"([^\"]*)\" \\(Question -  What is your date of birth\\?\\)$")
    public void iEnterDayAsMonthAsAndYearAsQuestionWhatIsYourDateOfBirth(String dd, String mm, String yyyy) {
        DateOfBirth_Page.inputKeywords(dd, mm, yyyy);

    }

    @And("^I click on No Radio button \\(Question - Do you live with a partner\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouLiveWithAPartner() {
        helper_Page.NoRadio();

    }

    @And("^I click on No Radio button \\(Question - Do you claim any benefits or tax credits\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouClaimAnyBenefitsOrTaxCredits() {
        helper_Page.NoRadio();
    }

    @And("^I click on No Radio button \\(Question - Are you pregnant or have you given birth in the last twelve months\\?\\)$")
    public void iClickOnNoRadioButtonQuestionAreYouPregnantOrHaveYouGivenBirthInTheLastTwelveMonths() {
        helper_Page.NoRadio();
    }

    @And("^I click on No Radio button \\(Question - Do you have an injury or illness caused by serving in the armed forces\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouHaveAnInjuryOrIllnessCausedByServingInTheArmedForces() {
        helper_Page.NoRadio();
    }

    @And("^I click on No Radio button \\(Question - Do you have diabetes\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouHaveDiabetes() {
        helper_Page.NoRadio();
    }

    @And("^I click on No Radio button \\(Question - Do you have glaucoma\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouHaveGlaucoma() {
        helper_Page.NoRadio();
    }


    @And("^I click on No Radio button \\(Question - Do you live permanently in a care home\\?\\)$")
    public void iClickOnNoRadioButtonQuestionDoYouLivePermanentlyInACareHome() {
        helper_Page.NoRadio();

    }

    @And("^I click on Yes Radio button \\(Question - Do you have more than sixtheen thousand in savings, investments or property\\?\\)$")
    public void iClickOnYesRadioButtonQuestionDoYouHaveMoreThanSixtheenThousandInSavingsInvestmentsOrProperty() {
        helper_Page.YesRadio();
    }

    @Then("^I should get result \"([^\"]*)\"$")
    public void iShouldGetResult(String ExpectedResult) {
        wales_Result_Page.ResultPageChecker(ExpectedResult);


    }

}
