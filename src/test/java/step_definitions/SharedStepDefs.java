package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SharedStepDefs extends BaseStep {

    public static final int PAGE_TIMEOUTS = 10;

    @When("^I navigate to (.*)$")
    public void navigateUrl(String url) {
        webDriver.get(url);
    }

    @And("^I wait until page loaded$")
    public void waitPageLoaded() {
        new WebDriverWait(webDriver, PAGE_TIMEOUTS).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        });
    }

    @Then("^I press button '(.*)'$")
    public void pressButtonWithText(String text) {
        String xpathExpress = "//button[text()='" + text + "']";
        webDriver.findElement(By.xpath(xpathExpress)).click();
    }

    @Then("^I should see '(.*)' in page$")
    public void pageContains(String text) {
        assertTrue(webDriver.getPageSource().contains(text));
    }

    @And("^I scroll down page$")
    public void scrollDownPage() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,250)", "");
    }

    @And("^I wait for (\\d+) seconds$")
    public void sleep(int time) {
        webDriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
