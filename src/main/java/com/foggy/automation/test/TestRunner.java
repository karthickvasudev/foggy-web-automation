package com.foggy.automation.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources"},
        glue = {"com.foggy.automation"},
        tags = "@Dashboard-2"
)
public class TestRunner {
}
