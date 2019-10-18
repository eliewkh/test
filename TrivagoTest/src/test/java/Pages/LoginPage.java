package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    //*********Web Elements by using Page Factory*********
    @FindBy(how = How.ID, using = "email")
    public WebElement UserNameTxt;

    @FindBy(how = How.ID, using = "pass")
    public WebElement PasswordTxt;

    @FindBy(how = How.CSS, using = "input[data-testid='royal_login_button']")
    public WebElement LoginBtn;

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }




 /*   @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[1]/div/div")
    public WebElement errorMessageUsername;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[2]/div/div")
    public WebElement errorMessagePassword;


*/




    //*********Page Methods*********
  /*  public void loginToN11 (String pusername, String ppassword){
        //Enter Username(Email)
        WriteText(username,pusername);
        //Enter Password
        WriteText(password, ppassword);
        //Click Login Button
        Click(loginButton);
    }
*/
  /*  //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(ReadText(errorMessageUsername), expectedText);
    }

    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(ReadText(errorMessagePassword), expectedText);
    }*/
}