Feature: Film Title Search

  Scenario: I want to look up ACADEMY DINOSAUR
    Given ACADEMY DINOSAUR is in the library
    When I search for ACADEMY DINOSAUR
    Then I should be told "ACADEMY DINOSAUR" is available

    Scenario: I want to look up ACADEMY DOG
      Given ACADEMY DOG is not in the library
      When I search for ACADEMY DOG
      Then I should be told "ACADEMY DOG" is not available



