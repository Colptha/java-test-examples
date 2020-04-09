package com.colphta;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        strict = true,
        features = { "src/test/resources/features" }
)
public class Runner {}
