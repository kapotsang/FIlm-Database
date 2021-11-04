Feature: Add film to database

  Scenario: I want to add ACADEMY DONUT to the database
    Given ACADEMY DONUT is not in the database
    When I add ACADEMY DONUT
    Then ACADEMY DONUT should be added to the database

  Scenario: I want to add ACADEMY DINOSAUR to the database
    Given ACADEMY DINOSAUR is already in the library
    When I add ACADEMY DINOSAUR
    Then the entry will not be duplicated