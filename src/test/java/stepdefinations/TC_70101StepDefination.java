package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TC_70101Page;
import utilities.DriverClass;
import utilities.ReusableMethods;

import java.util.List;

public class TC_70101StepDefination {
    TC_70101Page page = new TC_70101Page();


    @Given("I visit the parabank websit")
    public void iVisitTheParabankWebsit() {
        DriverClass.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @And("I click the Register link on the main page")
    public void iClickTkeLinkOnTheMainPage() {
        page.clickElement(page.registrationButton);
    }

    @And("I fill the area with data")
    public void iFillTheAreaWithData(DataTable dataTable) {
        List<String> registerList = dataTable.asList();
        page.sendKeys(page.firstNameTextBox,registerList.get(0) );
        ReusableMethods.wait(1);
        page.sendKeys(page.lastNameTextBox,registerList.get(1));
        ReusableMethods.wait(1);
        page.sendKeys(page.addressTextBox,registerList.get(2));
        ReusableMethods.wait(1);
        page.sendKeys(page.cityTextBox,registerList.get(3));
        ReusableMethods.wait(1);
        page.sendKeys(page.stateTextBox,registerList.get(4));
        ReusableMethods.wait(1);
        page.sendKeys(page.zipCodeTextBox,registerList.get(5));
        ReusableMethods.wait(1);
        page.sendKeys(page.phoneNumberTextBox,registerList.get(6));
        ReusableMethods.wait(1);
        page.sendKeys(page.ssnTextBox,registerList.get(7));
        ReusableMethods.wait(1);
        page.sendKeys(page.userNameTextBox,registerList.get(8));
        ReusableMethods.wait(1);
        page.sendKeys(page.passwordTextBox,registerList.get(9));
        ReusableMethods.wait(1);
        page.sendKeys(page.confirmPasswordTextBox,registerList.get(10));

    }

    @And("I click Confirm button")
    public void iClickConfirmButton() {
        page.waitUntilClickable(page.confirmButton);
        page.clickMethod(page.confirmButton);

    }

        @Then("I should confirm that message  about registration is Displayed")
        public void i_should_confirm_that_message_about_registration_is_displayed(){
            ReusableMethods.wait(2);

            page.isWebElementDisplayed(page.confirmMessageIsDisplayed);
          //  Assert.assertEquals(page.confirmMessageIsDisplayed.getText(),message);
        //    Assert.assertEquals(page.userNameTextBox,registerName);
        }
    }

