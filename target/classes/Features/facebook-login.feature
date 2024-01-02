@SmokeTest @Ignore
Feature: Facebook login feature
  User wants to verify whether it is successful or unsuccessful login

  @SmokeTest @Ignore
  Scenario: Unsuccessful login functionality
    Given User should be on login page
    And User enters email address
    And User enters password
    And User clicks on login button
    Then Error message should be displayed with wrong credentials for user
    And User return backs on login page
