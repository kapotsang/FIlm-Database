Feature: Film Title Search

  Scenario: I want to look up ACADEMY DINOSAUR
    Given ACADEMY DINOSAUR is in the library
    When I search for this film
    Then I should be told "This film exists"


