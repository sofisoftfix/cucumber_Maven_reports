package scenarios.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/resources/features"
        , glue = "scenarios"
        , plugin = { "pretty","html:target/site/cucumber-pretty","json:target/cucumber.json" }
)
public class RunBDDTest {

}