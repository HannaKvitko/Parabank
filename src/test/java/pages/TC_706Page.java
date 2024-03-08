package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

import java.util.List;

public class TC_706Page extends CommonMethods {

    @FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
    public WebElement transferFundsLink;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTextBox;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement dropDownMainAccountNumber;

    @FindBy(xpath = "//select[@id='fromAccountId']//option[1]")
    public WebElement transferFromMainAccountNumber;


    @FindBy(xpath = "//select[@id='toAccountId'] ")
    public WebElement dropDownMenuTransferTO;

    @FindBy(xpath = "//select[@id='toAccountId']//option[2]")
    public WebElement transferToAnotherAccount;

    @FindBy(xpath = "//a[normalize-space()='Accounts Overview']")
    public WebElement accountOverViewLink;


    @FindBy(xpath = "//tr[@class='ng-scope']//a")
    public List<WebElement> listOfAccounts ;

    @FindBy(xpath = "//input[@value='Transfer']")
    public WebElement transferButton;

    @FindBy(xpath = "//td[@id='accountType']")
    public WebElement accountType;


    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;

    @FindBy(xpath = "//div[@id='rightPanel']//span[@id='toAccountId']")
    public WebElement confirmationMessageAboutTransfer;

    //td[@class='ng-binding ng-scope']

    @FindBy(xpath = "//td[@class='ng-binding ng-scope']")
    public List<WebElement> listCreditMoney;

    @FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Funds Transfer Received'])[2]")
    public WebElement fundsTransferReceived;

    @FindBy(xpath = "//b[normalize-space()='Transaction ID:']")
    public WebElement transactionId;
}
