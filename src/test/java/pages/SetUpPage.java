package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utilities.ThreadSafeDriver;

public class SetUpPage extends ParentPage {

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement usernameTextBox;

    @FindBy (xpath = "//input[@name='password']")
    public static WebElement passwordTextBox;

    @FindBy (xpath = "//input[@class='button']")
    public static WebElement loginButton;

    @FindBy(xpath = "(//a[@href='/parabank/billpay.htm'][1])")
    public static WebElement payBillButton;

    @FindBy (xpath = "(//h1[@class='title'])[1]")
    public static WebElement billPaymentService;

    @FindBy(xpath = "//input[@class='input ng-pristine ng-valid ng-empty ng-touched']")
    public static WebElement payeenameTextBox;

    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[1]")
    public static WebElement adressTextBox;

    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[2]")
    public static WebElement cityTextBox;

    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[3]")
    public static WebElement stateTextBox;

    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[4]")
    public static WebElement zipcodeTextBox;

    @FindBy(xpath = "(//td[@align='right'])[6]//..")
    public static WebElement phoneTextBox;
    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[5]")
    public static WebElement accountTextBox;
    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[6]")
    public static WebElement verifyAccountTextBox;
    @FindBy(xpath = "(//input[@class='input ng-pristine ng-untouched ng-valid ng-empty'])[7]")
    public static WebElement amountTextBox;
    @FindBy(xpath = "//select[@name='fromAccountId']")
    public static WebElement fromAccountTextBox;

    @FindBy(xpath = "//input[@class='button']")
    public static WebElement sendPaymentButton;

    @FindBy (xpath = "(//p[normalize-space()='See Account Activity for more details.'])[1]")
    public static WebElement billPaymentCompleteImage;

    @FindBy(xpath = "(//a[normalize-space()='Accounts Overview'])[1]")
    public static WebElement accountOverWiew;

    @FindBy(xpath = "(//a[normalize-space()='13344'])[1]")
    public static WebElement accountNumber;
    @FindBy(xpath = "//body[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]")
    public static WebElement paymentConfirmation;


}
