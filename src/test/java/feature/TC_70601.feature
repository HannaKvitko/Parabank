Feature:
  Background:
    Given I visit the parabank websit
    When I enter the valid user information on the main page to log in my account
      |LidiyaPiers|
      |Zas758974@|
    Then I click on the Log In button

  Scenario: Money transfer between my accounts

    Then I click the Transfer Funds link
    And I enter the amount of money which I want to send
    And I choose account for transfer money
    Then I click Transfer Button
    And I should see the confirmation message money has been transferred from account  # to account #
    Then I click Accounts Overview link



