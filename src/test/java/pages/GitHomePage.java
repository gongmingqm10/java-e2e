package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHomePage extends BasePage {

    public GitHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "user[login]")
    public static WebElement usernameInput;

    @FindBy(how = How.NAME, using = "user[email]")
    public static WebElement emailInput;

    @FindBy(how = How.NAME, using = "user[password]")
    public static WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//button[text()='Sign up for GitHub']")
    public static WebElement signupBtn;

}
