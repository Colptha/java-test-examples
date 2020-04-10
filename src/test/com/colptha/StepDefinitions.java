package com.colptha;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

enum Beverage {
    COFFEE, TEA
}

public class StepDefinitions {

    @ParameterType("coffee|tea")
    public Beverage beverage(String beverage) {
        String name = beverage.toUpperCase();

        for (Beverage beverageEnum : Beverage.values()) {
            if (beverageEnum.name().equals(name)) {
                return beverageEnum;
            }
        }

        throw new RuntimeException("fix your regex or update your enum");
    }

    String day;

    List<String> items;

    Beverage beverage;

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

    @Given("I have a list of items:")
    public void i_have_a_list_of_items(List<String> items) {
        this.items = items;
    }

    @When("I execute the statement")
    public void i_execute_the_statement() {
    }

    @Then("I should expect all items to be present")
    public void i_should_expect_all_items_to_be_present() {
        assertEquals(2, this.items.size());
    }


    @Given("{beverage} is specified")
    public void coffee_is_specified(Beverage beverage) {
        this.beverage = beverage;
    }

    @When("it reaches the step definition")
    public void it_reaches_the_step_definition() {
        assertNotNull(this.beverage);
    }
    @Then("it should have a name of {string}")
    public void it_should_have_a_name_of(String name) {
        assertEquals(this.beverage.name(), name);
    }
}
