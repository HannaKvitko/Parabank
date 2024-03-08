package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class TC_702Page extends CommonMethods {

    @FindBy (xpath = "//input[@name='username']")
    public WebElement  userNameForLogIn;

    @FindBy (xpath = "(//input[@name='password'])[1]")
    public WebElement passwordForLogIn      ;

    @FindBy (xpath = "//input[@value='Log In']")
    public WebElement logInButton     ;

   @FindBy (xpath = "(//h1[normalize-space()='Accounts Overview'])[1]")
   public  WebElement accountOverviewIsDisplayed;

  @FindBy (xpath = "//a[normalize-space()='Log Out']")
  public WebElement logOutButton;
}
