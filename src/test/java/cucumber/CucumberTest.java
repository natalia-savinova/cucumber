package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target cucumber"},
        features = "src/test/java/cucumber/feature",
        glue = {"src/test/java/cucumber/steps"}
)
public class CucumberTest {
}
