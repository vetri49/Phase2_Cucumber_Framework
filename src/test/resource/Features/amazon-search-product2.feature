#Author: xxx@gmail.com
@AmazonSearchTest2 @SmokeTest
Feature: Search product on amazon
  User wants to search multiple products on amazon

  @AmazonSearchTest2 @SmokeTest
  Scenario Outline: Search feature button with number of products on amazon
    Given Launch amazon application on chrome
    # And Maximize browser window size
    When Enter  search product "<name>"
    Then Submit product search
    And Verify page title "<title>"

    Examples: 
      | name              | title                         |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
