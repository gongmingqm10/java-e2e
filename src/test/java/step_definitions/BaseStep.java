package step_definitions;

import org.openqa.selenium.WebDriver;

public class BaseStep {
    public WebDriver webDriver;

    public BaseStep() {
        this.webDriver = Hooks.driver;
    }
}
