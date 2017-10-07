package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {
    @FindBy(xpath= "//input[contains(@value,'Find Flights')]")
    public WebElement findFlightsButton;

    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public void findFlights(){
        findFlightsButton.click();
    }
}