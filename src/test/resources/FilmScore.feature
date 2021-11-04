Scenario: I want to review the film
  Given I have watched The Shining
  When I review The Shining 1 star
  Then the review is saved

  Given I have not watched The Shining
  When I review The Shining 1 star
  Then the review is not saved.