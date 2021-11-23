package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.Scenario;
import cucumber.api.java.Before;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class StepDefinitions {
    private Scenario scenario;
    private HttpURLConnection con;

    @Before
    public void setupScenario(Scenario scenario){
        this.scenario = scenario;
    }

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

    @Given("^I make a request to a public api$")
    public void I_make_a_request_to_a_public_api() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
        con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");

        scenario.write(con.getURL().toString());
    }

    @Then("^I should get a 200 response$")
    public void I_should_get_a_200_response() throws IOException {
        assertEquals(200, con.getResponseCode());

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        con.disconnect();
        scenario.write(content.toString());
    }


}