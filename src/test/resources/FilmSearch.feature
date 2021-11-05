Feature: Film Title Search

  Scenario: I want to look up ACADEMY DINOSAUR
    Given ACADEMY DINOSAUR is in the database
    When I search for ACADEMY DINOSAUR
    Then I should be told ACADEMY DINOSAUR is available

  #  Scenario: I want to look up The Shining
  #    Given The Shining is not in the database
  #    When I search for The Shining
  #    Then I should be told "The Shining" is not available



