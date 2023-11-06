@smoke
Feature: Testing plans section feature
  Background:
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    When click on plans page

    @US_9
    Scenario: plans row validation
    Then validate 4 row of data is present

    @US_10
    Scenario:validating created and expired date
      Then validate created date is today
      Then validate expired date is tomorrow
