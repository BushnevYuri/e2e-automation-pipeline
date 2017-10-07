package steps.ui;

import pages.HomePage;
import net.thucydides.core.annotations.Step;

public class FindFlightsUISteps {
    public HomePage homePage;

    @Step
    public void findFlights() {
        homePage.findFlights();
    }
}