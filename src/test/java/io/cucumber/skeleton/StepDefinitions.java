package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class StepDefinitions {
    @Given("^I have (.+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (.+) hour$")
    public void i_wait_hour(int waitTime) {
        if (waitTime > 5){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        
    }
    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        Belly belly = new Belly();
        belly.growl();
    }

}
