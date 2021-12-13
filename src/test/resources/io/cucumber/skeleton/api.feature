@Api
Feature: Api

  Scenario: make an api call
    Given I make a request to a public api
    Then I should get a 200 response
