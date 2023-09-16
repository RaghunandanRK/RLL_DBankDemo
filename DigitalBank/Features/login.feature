Feature: Login to the application

  Scenario: Login credentials scenario 
    Given I am on the login page
    When I enter username and password 
    And I click the login button
    Then I get logged in successfully
