Feature: Actor search

  Scenario: I want to look up ED CHASE
    Given ED CHASE is in the database
    When I search for ED CHASE
    Then ED CHASE 's entry should be displayed

  Scenario: I want to look up ED CHOOSE
    Given ED CHOOSE is not in the library
    When I search for ED CHOOSE
    Then I should be told ED CHOOSE is not available