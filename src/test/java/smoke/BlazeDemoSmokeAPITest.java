package smoke;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.api.BlazeDemoAPISteps;
import steps.api.FindFlightsAPISteps;

@RunWith(SerenityRunner.class)
public class BlazeDemoSmokeAPITest {
    @Steps
    BlazeDemoAPISteps blazeDemoAPISteps;

    @Test
    @WithTag(type="type", name="Smoke")
    public void verifyFlightsSearchWithAPI() {
        blazeDemoAPISteps.verifyThatAppIsRunning();
    }
}
