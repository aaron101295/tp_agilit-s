import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, tags = "@voiture", features = "src/main/resources/features", plugin = {
"pretty", "html:target/cucumber" }, glue = "definiton")
public class VoitureInvocationStepDefinitionTest {

}
