import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   features = {"src/test/java/features/TestScenario.feature"},
                    plugin = {"pretty"},glue = {"stepdefs"},
                    tags = "@E2E"
                )

public class TestRunner {
}
