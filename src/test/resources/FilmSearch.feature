Feature: Film Title Search

  Scenario: I want to look up The Shining
    Given The Shining is in the database
    When I search for The Shining
    Then I should be told The Shining is available

    Scenario: I want to look up ACADEMY DOG
      Given ACADEMY DOG is not in the library
      When I search for ACADEMY DOG
      Then I should be told "ACADEMY DOG" is not available



