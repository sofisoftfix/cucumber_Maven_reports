package scenarios.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class HolaMundoFallandoStepDefinition {
    private String holaMundo;

    @When("Yo digo hola al mundo")
    public void yo_digo_hola_al_mundo() {
        holaMundo = "Hola Mundo";
    }

    @Then("Yo deberia ver")
    public void yo_deberia_ver() {
          assertEquals(2,3);
    }
}
