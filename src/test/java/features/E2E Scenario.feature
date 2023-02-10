@REGISTER
Feature: Register a new account and Login with this account

  Scenario: User Register a new account
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

  Scenario: User Login with this account
    Given User clicks on login link
    When  user enters email for login
    And user enters password for login
    And user clicks on login button
    Then user registration should be logged in