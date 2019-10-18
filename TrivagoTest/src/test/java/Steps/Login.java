package Steps;

import Objects.UserAccount;
import UserActions.LoginUserAction;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class Login extends BaseTest{
    private UserAccount _userAccount = new UserAccount();
    private LoginUserAction _LoginUserAction;

    @Before("@LO.01")
    public void CheckJseonFileTemplateToTest(){
        OpenBrowser();
        _LoginUserAction = new LoginUserAction(driver);
    }
    @When("^I click on the burger menu on the top left$")
    public void iClickOnTheBurgerMenuOnTheTopLeft() {
       // vendorLoginPage.UserNameTxt.sendKeys("test");
        _userAccount.setUsername("test");
        _userAccount.setPassword("test");
        _LoginUserAction.SetParameters(_userAccount);
        _LoginUserAction.Execute();
    }
}
