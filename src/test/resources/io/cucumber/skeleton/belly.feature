Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 7 hour
    Then my belly should growl

  Scenario: a lot cukes
    Given I have 22 cukes in my belly
    When I wait 5 hour
    Then my belly should growl
