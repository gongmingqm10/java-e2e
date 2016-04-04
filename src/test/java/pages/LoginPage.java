package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    @FindBy(how = How.ID, using = "email")
    public static WebElement email;
    @FindBy(how = How.ID, using = "password")
    public static WebElement password;
    @FindBy(how = How.ID, using = "submit")
    public static WebElement submitBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
