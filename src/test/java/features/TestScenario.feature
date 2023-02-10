@E2E
Feature: Register a new account and Login with this account and add book to cart and checkout
  Scenario: Register a new account and Login with this account and add book to cart and checkout
    Given User clicks on register link from home page
    When  User selects gender
    And user enters first name
    And user enters last name
    And user selects DateOfBirthDay
    And user selects DateOfBirthMonth
    And user selects DateOfBirthYear
    And user enters email
    And user enters company name
    And user enters password
    And user confirms password
    And user clicks on register button
    Then user registration should be completed successfully
    And User clicks on login link
    And  user enters email for login
    And user enters password for login
    And user clicks on login button
    Then user registration should be logged in
    And User clicks on Books section
    And User sorts by price low to high
    And User add to cart the second item in the results
    And User agrees to terms and conditions
    Then User clicks on checkout button to complete purchase