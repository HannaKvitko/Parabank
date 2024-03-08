package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class TC_704Page extends CommonMethods {

    @FindBy(xpath = "//a[normalize-space()='Open New Account']")
    public WebElement openNewAccountLink    ;

 //   @FindBy (xpath = "(//select[@id='type'])[1]")
  //  public  WebElement textBoxType ;

    @FindBy (xpath = "//select[@id='type']//option[@value='0']")
    public WebElement checkingType;

    @FindBy (xpath = "(//input[@value='Open New Account'])[1]")
    public WebElement openNewAccountButton;

    @FindBy (xpath = "//select[@id='type']//option[@value='1']")
    public WebElement savingType;


    @FindBy (xpath = " //h1[text()='Account Opened!']")
    public WebElement messageOpenedAccountIsDisplayed;


@FindBy (xpath = "//select[@id='type']")
public WebElement dropDownMenu ;



}
