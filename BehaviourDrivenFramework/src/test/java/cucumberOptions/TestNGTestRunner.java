package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",
glue = "stepDefinations", tags = "@Smoke", dryRun = true, monochrome = true, plugin = {"pretty","html:target/cucumber.html", "json:target/cucum.json", "junit:target/cake.xml" })
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
