package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_704Page;
import utilities.ReusableMethods;


public class TC_70401StepDefination {
    TC_704Page pages = new TC_704Page();

    @When("I click on the Open New Account link")
    public void iClickOnTheOpenNewAccountLink() {
       pages.clickElement(pages.openNewAccountLink);
    }

    @Then("I choose Checking type of account")
    public void iChooseCheckingTypeOfAccount() {
        pages.clickElement(pages.checkingType);
    }

    @And("I click on the Open New Account Button")
    public void iClickOnTheOpenNewAccountButton() {
        ReusableMethods.wait(1);
        pages.clickElement(pages.openNewAccountButton);
    }


    @And("I click on drop down menu an choose saving account")
    public void iClickOnDropDownMenuAnChooseSavingAccount() {
        pages.clickElement(pages.dropDownMenu);
        ReusableMethods.wait(4);
        pages.clickMethod(pages.savingType);
    }

    @And("I see the message that Account opened")
    public void iSeeTheMessageThat(){
        ReusableMethods.wait(2);
        pages.isWebElementDisplayed(pages.messageOpenedAccountIsDisplayed);


    }

    //  @Then("I choose Savings type of account")
  //  public void iChooseSavingsTypeOfAccount() {
     //   pages.clickMethod(pages.savingType);

   // }


}
