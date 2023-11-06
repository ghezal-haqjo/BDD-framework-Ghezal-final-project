@smoke
Feature: login page testing

  @US_5
  Scenario: Validate login page with valid username and password
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    Then validate title "Customer Service Portal"


  @US_6
  Scenario Outline: Validate login page with invalid username and password
    When click on login button
    When enter username "<username>"
    When enter password "<password>"
    When click on sign in button
    Then validate error message "<error message>"
    Examples:
      | username      | password       | error message                |
      | WrongUsername | tek_supervisor | User wrongUsername not found |
      | supervisor    | wrongPassword  | Password not matched         |

