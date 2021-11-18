package io.cucumber.skeleton;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(
         jsonReport = "build/reports/json/testresult.json",
        customTemplatesPath = "/templates/reports/templates.json",
        overviewReport = true,
        jsonUsageReport = "build/reports/json/cucumber-usage.json",
        detailedAggregatedReport = true,
        toPDF = true,
        outputFolder = "build/reports/cucumber_reports/"
)
@CucumberOptions(
        plugin = {
                "html:build/reports/html",
                "json:build/reports/json/testresult.json",
                "pretty:build/reports/cucumber-pretty.txt",
                "usage:build/reports/json/cucumber-usage.json",
                "junit:build/reports/cucumber-results.xml",
        },
        features = "src/test/resources/io/cucumber/skeleton",
        glue = "src/test/java/io/cucumber/skeleton"

)

public class RunCucumberTest {
}
