package scenarios.stepdefinitions;

/**
 * @user bizadmin
 */

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class HelloWorldStepDefinition {

    private String helloWorld;

    @When("I say hello to the world")
    public void i_say_hello_to_the_world() {
        helloWorld = "Hello World";
    }

    @Then("I should see")
    public void i_should_see() {
        assertEquals(2,2);
    }

}
