Feature:
 Background:
    Given I visit the parabank websit
    When I enter the valid user information on the main page to log in my account
      |LidiyaPiers|
      |Zas758974@|
    Then I click on the Log In button

  Scenario: Checking account

    When I click on the Open New Account link
    Then I choose Checking type of account
    And I click on the Open New Account Button
    Then I should Log Out from my account

  Scenario: Saving account

    Then I click on the Open New Account link
    And I click on drop down menu an choose saving account
    And I click on the Open New Account Button
    And I see the message that Account opened


