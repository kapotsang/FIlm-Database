Feature: Display all films

  Scenario: I want to view all films
    Given I am logged in as a member
    When ask to see all films
    Then all films should be shown

  Scenario: I want to view all films
    Given I am not logged in as a member
    When ask to see all films
    Then nothing should be shown