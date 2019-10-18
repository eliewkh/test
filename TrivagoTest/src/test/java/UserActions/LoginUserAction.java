package UserActions;


import Objects.UserAccount;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginUserAction extends UserActions {
    private LoginPage _LoginPage;
    private UserAccount _userAccount ;
    private WebDriver _driver;
    public LoginUserAction(WebDriver driver){
        _driver =driver;

    }

   @Override
   public void Initialize(){
       _LoginPage =new LoginPage(_driver);
   }

   @Override
   public void SetParameters(Object object){
    if(object instanceof UserAccount )
        _userAccount=(UserAccount)object;
    else{
        //logger that the object is not instance of user account
    }

   }

    @Override
   public void PreVerification(){
       //Check if we are at the login page


   }

    @Override
    public void PostVerification(){

    }

    @Override
    public void Execute(){
        Initialize();
        PreVerification();
        Login();
        PostVerification();
    }



    private void Login(){
        _LoginPage.UserNameTxt.sendKeys(_userAccount.getUsername());
        _LoginPage.PasswordTxt.sendKeys(_userAccount.getPassword());
        _LoginPage.LoginBtn.click();
    }



}