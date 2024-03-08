package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.TC_706Page;
import utilities.ReusableMethods;

import java.util.List;

public class TC_706StepDefination {
    TC_706Page pages = new TC_706Page();
 public  List<String> checking;
 public List<String> saving;
    public List<String> listCreditTransfer;

    @Then("I click Accounts Overview link")
    public void iClickAccountsOverviewLink() {
        pages.clickElement(pages.accountOverViewLink);
      int accountCount = pages.listOfAccounts.size();
       for(int i = 0; i<accountCount;i++) {
           pages.clickMethod(pages.listOfAccounts.get(i));
           pages.waitUntilVisible(pages.accountNumber);
           if (pages.accountNumber.getText().equals("13788")) {
               ReusableMethods.wait(1);
               pages.clickMethod(pages.fundsTransferReceived);
               pages.isWebElementDisplayed(pages.transactionId);
               // checking.add(pages.accountNumber.getText());
           } else {
               pages.clickElement(pages.accountOverViewLink);
               //   saving.add(pages.accountNumber.getText());
           }
           System.out.println(pages.transactionId.getText());
           //  pages.clickJSExecutor(pages.accountOverViewLink);
       }

    }
    @Then("I click the Transfer Funds link")
    public void iClickTheTransferFundsLink() {

   pages.clickElement(pages.transferFundsLink);
   ReusableMethods.wait(1);

    }

    @And("I enter the amount of money which I want to send")
    public void iEnterTheAmountOfMoneyWhichIWantToSend() {
        pages.sendKeys(pages.amountTextBox,"200");
        ReusableMethods.wait(1);
    }

    @And("I choose account for transfer money")
    public void iChooseAccountForTransferMoney() {
pages.clickElement(pages.dropDownMainAccountNumber);
ReusableMethods.wait(1);
pages.clickMethod(pages.transferFromMainAccountNumber);
pages.clickElement(pages.dropDownMenuTransferTO);
ReusableMethods.wait(1);
pages.clickMethod(pages.transferToAnotherAccount);
    }

    @Then("I click Transfer Button")
    public void iClickTransferButton() {
        pages.clickElement(pages.transferButton);

    }

    @And("I should see the confirmation message money has been transferred from account  # to account #")
    public void iShouldSeeTheConfirmationMessageMoneyHasBeenTransferredFromAccountToAccount() {
Assert.assertTrue(pages.isWebElementDisplayed(pages.confirmationMessageAboutTransfer));
        System.out.println(" Money has has been transferred to account " + pages.confirmationMessageAboutTransfer.getText());
    }



}
