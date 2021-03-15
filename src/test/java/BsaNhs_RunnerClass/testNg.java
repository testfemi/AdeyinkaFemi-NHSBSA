package BsaNhs_RunnerClass;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.Test;

@Test
@CucumberOptions(

        plugin = {"pretty", "html:target/Report1",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        glue = "BsaNhs_StepDefinition",
        features = "features/BshNhs_E2E_Wales_Checker.feature"
)


public class testNg extends AbstractTestNGCucumberTests {



}