@smoke
Feature: Navigate to Customer Service Portal with valid CSR
  credentials and navigate to Accounts verify 5 row /page is default
  Background:
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    When click on account button

  @US_11
  Scenario: Validate accounts rows is default
    Then validate accounts 5 rows is default
  @US_12
  Scenario Outline: validate Account change show per pages values
    When click on change show button
    When select 10 show
    Then validate <expected> values are correct
    When click on change show button
    When select 25 show
    Then validate <expected1> show values
    When click on change show button
    When select 50 show
    Then validate <expected2> values
    Examples:
      | expected | expected1 | expected2 |
      | 10       | 25        | 50        |



