package api;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.api.FindFlightsAPISteps;

@RunWith(SerenityRunner.class)
public class BlazeDemoAPITest {
    @Steps
    FindFlightsAPISteps findFlightsAPISteps;

    @Test
    @WithTag(type="type", name="API")
    public void verifyFlightsSearchWithAPI() {
        findFlightsAPISteps.findFlights();
    }
}
