Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button



  Scenario: Negative #1
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button



  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button



  Scenario: Negative #3
    Given I am on the main page
    When I enter over the limits characters
    And I click the submit button


    Scenario: Negative #4
      Given I am on the main page
      When I click on Read More Button
      And I click the submit button


  Scenario: Negative #5
    Given I am on the main page
    When I click on Read More Virtual Page
    And I click the submit button

  Scenario: Negative #6
    Given I am on the main page
    When I click on Read More Learn The Fundamentals

  Scenario: Negative #7
    Given I am on the main page
    When I click on Read More Learn Selenium





