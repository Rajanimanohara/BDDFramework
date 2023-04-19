#Author: Rajani
#Feature: Login
 

Feature: Login Feature

  
  Scenario: Login To Vtiger application using valid credentials
    Given I want to launch the browser
    And I want to load the URL
    When Login page is displayd enter valid credentials
    And Click on login
    Then Validate if home page is displayed

