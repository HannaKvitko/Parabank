package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TC_702Page;

import java.util.List;


public class TC_702StepDefination {

    TC_702Page tc702Page = new TC_702Page();

    @When("I enter the valid user information on the main page to log in my account")
    public void iEnterTheValidUserInformationOnTheMainPageToLogInMyAccount(DataTable dataTable) {
       List<String> logInList = dataTable.asList();
       tc702Page.sendKeys(tc702Page.userNameForLogIn,logInList.get(0));
       tc702Page.sendKeys(tc702Page.passwordForLogIn,logInList.get(1));
    }

    @Then("I click on the Log In button")
    public void iClickOnTheLogInButton() {
        tc702Page.clickElement(tc702Page.logInButton);
    }

    @And("I should confirm that I entered to my account")
    public void iShouldConfirmThatIEnteredToMyAccount() {
      tc702Page.isWebElementDisplayed(tc702Page.accountOverviewIsDisplayed);
    }

    @Then("I should Log Out from my account")
    public void iShouldLogOutFromMyAccount() {
        tc702Page.clickElement(tc702Page.logOutButton);
    }
}
