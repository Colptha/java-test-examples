package com.colphta;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    String day;

    @Given("today is {string}")
    public void today_is(String day) {
        this.day = day;
    }

    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_Friday() {

    }
    @Then("I should be told {string}")
    public void i_should_be_told(String message) {
        assertEquals(message, IsItFriday.day(this.day));
    }

}
