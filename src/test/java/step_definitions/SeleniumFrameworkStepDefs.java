package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumFrameworkStepDefs {

    private WebDriver webDriver;

    public SeleniumFrameworkStepDefs() {
        this.webDriver = Hooks.driver;
    }

    @When("^I open seleniumframework website$")
    public void i_open_selenium_website() {
        webDriver.get("http://www.seleniumframework.com");
    }

    @Then("^I validate the title and url$")
    public void i_validate_title_and_url() {
        assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.", webDriver.getTitle());
        assertEquals("http://www.seleniumframework.com/", webDriver.getCurrentUrl());
    }
}
