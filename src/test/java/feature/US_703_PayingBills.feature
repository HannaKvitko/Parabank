Feature: Paying Bills


  Scenario:

    Given  The user successfully logins to the ParaBank website.
    When The user clicks the ""Bill Pay"" option from the menu on the website.
    And The user is directed to the invoice payment page.
    And The user fills the invoice information in the customer datas with random values.
    And The user enters the amount to be paid .
    And The user selects the account to pay.
    And The user clicks the ""Payment"" button to confirm the payment process.
    And The user confirms that the payment is successfully completed, the payment amount and the payment account number.
    And The user clicks on the link ""Accounts OverView"".
    And User, click on the payment account number
    Then The user confirms the payment date in the list, the payment name and the payment amount in the list."