package stepdefinations;

import Utilities.ReusableMethod;
import Utilities.ThreadSafeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ParentPage;
import pages.SetUpPage;

import java.sql.SQLOutput;

public class US_703_PayingBillsStep extends ParentPage {

    US_703_PayingBillsStep Step = new US_703_PayingBillsStep();

    @Given("The user successfully logins to the ParaBank website.")
    public void the_user_successfully_logins_to_the_para_bank_website() {
        ReusableMethod.wait(1);
        // Navigate to Campus
        ThreadSafeDriver.getDriver().get
                ("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        ReusableMethod.wait(1);
        SetUpPage.usernameTextBox.sendKeys("JohnWoit");
        ReusableMethod.wait(1);
        SetUpPage.passwordTextBox.sendKeys("Qwerty123");
        ReusableMethod.wait(1);
        SetUpPage.loginButton.click();

    }


    @When("The user clicks the \"\"Bill Pay\"\" option from the menu on the website.")
    public void the_user_clicks_the_bill_pay_option_from_the_menu_on_the_website() {
        ReusableMethod.wait(1);
        SetUpPage.clickElement(SetUpPage.payBillButton);

    }
    @When("The user is directed to the invoice payment page.")
    public void the_user_is_directed_to_the_invoice_payment_page() {
        ReusableMethod.wait(1);
        Assert.assertTrue(SetUpPage.billPaymentService.isDisplayed());

    }
    //@When("The user also enters the type of invoice \\(electricity) he wants to pay into the recipient name \\(payee name) \\(for example, \"\"Enerjisa Electricity Bill\"\").")
    // public void the_user_also_enters_the_type_of_invoice_electricity_he_wants_to_pay_into_the_recipient_name_payee_name_for_example_enerjisa_electricity_bill() {

    // }
    @When("The user fills the invoice information in the customer datas with random values.")
    public void the_user_fills_the_invoice_information_in_the_customer_datas_with_random_values() {
        ReusableMethod.wait(1);
        SetUpPage.payeenameTextBox.sendKeys("John Woit");
        ReusableMethod.wait(1);
        SetUpPage.adressTextBox.sendKeys("101 New street");
        ReusableMethod.wait(1);
        SetUpPage.cityTextBox.sendKeys("Hollywood");
        ReusableMethod.wait(1);
        SetUpPage.stateTextBox.sendKeys("FL");
        ReusableMethod.wait(1);
        SetUpPage.zipcodeTextBox.sendKeys("33000");
        ReusableMethod.wait(1);
        SetUpPage.phoneTextBox.sendKeys("7894561230");
        ReusableMethod.wait(1);
        SetUpPage.accountTextBox.sendKeys("13344");
        ReusableMethod.wait(1);
        SetUpPage.verifyAccountTextBox.sendKeys("13344");
        ReusableMethod.wait(1);

    }
    @When("The user enters the amount to be paid .")
    public void the_user_enters_the_amount_to_be_paid() {
        SetUpPage.amountTextBox.sendKeys("85");
        ReusableMethod.wait(1);

    }
    @When("The user selects the account to pay.")
    public void the_user_selects_the_account_to_pay() {
        SetUpPage.fromAccountTextBox.sendKeys("1234");
        ReusableMethod.wait(1);

    }
    @When("The user clicks the \"\"Payment\"\" button to confirm the payment process.")
    public void the_user_clicks_the_payment_button_to_confirm_the_payment_process() {
        SetUpPage.sendPaymentButton.click();

    }
    @When("The user confirms that the payment is successfully completed, the payment amount and the payment account number.")
    public void the_user_confirms_that_the_payment_is_successfully_completed_the_payment_amount_and_the_payment_account_number() {
        ReusableMethod.wait(1);
        Assert.assertTrue(SetUpPage.billPaymentCompleteImage.isDisplayed());
    }
    @When("The user clicks on the link \"\"Accounts OverView\"\".")
    public void the_user_clicks_on_the_link_accounts_over_view() {
        ReusableMethod.wait(1);
        SetUpPage.accountOverWiew.click();

    }

    @When("User, click on the payment account number")
    public void user_click_on_the_payment_account_number() {
        ReusableMethod.wait(1);
        SetUpPage.accountNumber.click();


    }
    @Then("The user confirms the payment date in the list, the payment name and the payment amount in the list.\"")
    public void the_user_confirms_the_payment_date_in_the_list_the_payment_name_and_the_payment_amount_in_the_list() {
        ReusableMethod.wait(1);
        Assert.assertTrue(SetUpPage.paymentConfirmation.isDisplayed());
    }


}
