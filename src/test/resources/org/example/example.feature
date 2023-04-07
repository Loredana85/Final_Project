Feature: An example

  Scenario: Positive email field test #1
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then a success pop-up appears

  Scenario: Positive email field test #2
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then a success pop-up appears

  Scenario: Negative #3
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button

  Scenario: Negative #4
    Given I am on the main page
    When I enter over the limits characters
    And I click the submit button

  Scenario: Positive #5
    Given I am on the main page
    When I click on Read More Button for Hybrid
    Then the "Hybrid" page loads

  Scenario: Positive #6
    Given I am on the main page
    When I click on Read More Virtual Page
    Then the "Virtual" page loads

  Scenario: Positive #7
    Given I am on the main page
    When I click on Read More In Person Page
    Then the "In Person" page loads

  Scenario: Positive #8
    Given I am on the main page
    When I click on Read More Learn The Fundamentals
    Then the "Fundamentals" page loads

  Scenario: Positive #9
    Given I am on the main page
    When I click the Questions button
    Then the page goes down to the FAQ sections


  Scenario: Positive #10
    Given I am on the main page
    When I click the What You'll Learn button
    Then the page goes down to the Learn The Fundamentals

  Scenario: Positive #11
    Given I am on the main page
    When I click the Instructors button
    Then the page goes down to the Our Instructors


  Scenario: Positive #12 + Bug
    Given I am on the main page
    When I click on Read More Learn Selenium
    Then the "Learn Selenium" loads return

