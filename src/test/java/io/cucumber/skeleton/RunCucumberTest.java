package io.cucumber.skeleton;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(
        jsonReport = "build/cucumber-reports/cucumber-report.json",
        detailedAggregatedReport = true,
        outputFolder = "build/cucumber-reports/cucumber-html-reports"
)
@CucumberOptions(
        plugin = {
               "json:build/cucumber-reports/cucumber-report.json",
        },
        features = "src/test/resources/io/cucumber/skeleton",
        glue = "io.cucumber.skeleton"

)

public class RunCucumberTest {
}
