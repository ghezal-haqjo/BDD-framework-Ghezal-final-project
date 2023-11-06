@smoke
Feature: Testing create account feature
  Background: setup test
    When click on create primary account button
  @US_2
  Scenario: validate create account should be Create Primary Account Holder
    When click on create primary account button
    Then validate create account title should be "Create Primary Account Holder"
  @US_3
  Scenario: Fill up Create account holder form and validate Sign up and email address
    When enter Email Address
    When enter Firstname as "Ghezal"
    When Select Gender "Female"
    When enter Employment Status "Student"
    When select Title or Prefix "Ms."
    When enter Lastname "barakzai"
    When select Marital Status "Married"
    When enter Date Of Birth "07-06-1999"
    When click on Create Account button
    Then validate user is on "Sign up your account" page
    Then validate email address
    @US_4
    Scenario: Create account with existing email address and validate error message as expected
      When enter Email Address as "ghezal@gmail.com"
      When enter Firstname as "Ghezal"
      When Select Gender "Female"
      When enter Employment Status "Student"
      When select Title or Prefix "Ms."
      When enter Lastname "barakzai"
      When select Marital Status "Married"
      When enter Date Of Birth "07-06-1999"
      When click on Create Account button
      Then validate error message as "ERROR"









