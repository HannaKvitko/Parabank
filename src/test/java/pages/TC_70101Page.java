package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class TC_70101Page extends CommonMethods {

    @FindBy(xpath = "(//a[normalize-space()='Register'])[1]")
    public WebElement registrationButton;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstNameTextBox;
    @FindBy(xpath = " //input[@id='customer.lastName']")
    public WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement addressTextBox ;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement cityTextBox;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement stateTextBox;
    @FindBy(xpath = "(//input[@id='customer.address.zipCode'])[1]")
    public WebElement zipCodeTextBox ;

    @FindBy(xpath = "(//input[@id='customer.phoneNumber'])[1]")
    public WebElement phoneNumberTextBox;
    @FindBy(xpath = "(//input[@id='customer.ssn'])[1]")
    public WebElement ssnTextBox ;

    @FindBy(xpath = "(//input[@id='customer.username'])[1]")
    public WebElement userNameTextBox ;

    @FindBy(xpath = "(//input[@id='customer.password'])[1]")
    public WebElement passwordTextBox ;

    @FindBy(xpath = "(//input[@id='repeatedPassword'])[1]")
    public WebElement confirmPasswordTextBox ;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement confirmButton ;

   // public WebElement registerExistMessage(String registerName){
     //   return (WebElement) DriverClass.getDriver().
         //       findElements(By.xpath(
          //              "//div[normalize-space()='Welcome with Name \"" + registerName + " \" already exists.']"));



        @FindBy(xpath = "(//p[contains(text(),'Your account was created successfully. You are now')])[1]")
        public WebElement confirmMessageIsDisplayed ;
    }



