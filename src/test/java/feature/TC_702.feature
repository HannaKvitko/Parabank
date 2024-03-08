Feature:
  Scenario:
    Given I visit the parabank websit
    When I enter the valid user information on the main page to log in my account
      |LidiyaPiers|
      |Zas758974@|
    Then I click on the Log In button
    And I should confirm that I entered to my account
    Then I should Log Out from my account
