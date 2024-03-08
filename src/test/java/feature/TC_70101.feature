Feature:

  Scenario:
    Given I visit the parabank websit
    And I click the Register link on the main page
    And I fill the area with data

    |Lidiya|
    |Piers |
    |Peach Ave|
    |Boston|
    |Massachusetts|
    |25987|
    |17823556325|
    |12-3359-384|
    |LidiyaPiers|
    |Zas758974@|
    |Zas758974@|

    And I click Confirm button
    Then I should confirm that message  about registration is Displayed



