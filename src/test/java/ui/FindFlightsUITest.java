package ui;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.ui.FindFlightsUISteps;

@RunWith(SerenityRunner.class)
public class FindFlightsUITest {
    @Managed
    WebDriver driver;

    @Steps
    FindFlightsUISteps findFlightsUISteps;

    @Test
    @WithTag(type="type", name="UI")
    public void  findFlights() {
        findFlightsUISteps.findFlights();
    }
}