package api.qa.techtorialwork.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue = "api/qa/techtorialwork/stepdefinitions",
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty","html:target/apiReport.html","rerun:target/ApiFailedTests.txt",
        "json:target/cucumber-reports/cucumber.json"}
)
public class Runner {
}
