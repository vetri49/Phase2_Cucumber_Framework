@SmokeTest @Ignore
Feature: Facebook login feature
  User wants to verify whether it is successful or unsuccessful login

  @SmokeTest @Ignore
  Scenario Outline: Unsuccessful login functionality
    Given I should be on login page
    And I enters email address "<username>"
    And I enters password "<password>"
    And I clicks on login button
    Then Error message should be displayed with wrong credentials
    And I return backs on login page

    Examples: 
      | username | password |
      | abc      | nvunirg  |
      | pqr      | cmeooevo |
      | lmn      | voefpfnc |
