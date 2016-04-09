package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;
import pages.GitHomePage;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitRegisterStepDefs extends BaseStep {

    public GitRegisterStepDefs() {
        super();
        PageFactory.initElements(webDriver, GitHomePage.class);
    }

    @And("^I sign up with the following info$")
    public void enterSignupInfo(DataTable userInfoMaps) {
        List<Map<String, String>> userInfos = userInfoMaps.asMaps(String.class, String.class);
        String username = userInfos.get(0).get("username") + getRandomExtras();
        String email = getRandomExtras() + userInfos.get(0).get("email");
        String password = userInfos.get(0).get("password");

        GitHomePage.usernameInput.sendKeys(username);
        GitHomePage.emailInput.sendKeys(email);
        GitHomePage.passwordInput.sendKeys(password);

        GitHomePage.signupBtn.click();
    }

    private String getRandomExtras() {
        //this is hacked for github username and email not unique
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
