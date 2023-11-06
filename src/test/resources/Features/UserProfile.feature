@Regression
Feature:Testing profile section
  Background:
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
  @US_7
  Scenario:validate profile side drawer
    When click on profile button
    Then validate profile side drawer title should be "Profile"
    Then validate profile side drawer name should be "Name"
    Then validate profile side drawer nameValue should be "Supervisor"
    Then validate profile side drawer Username should be "Username"
    Then validate profile side drawer UsernameValue should be "supervisor"
    Then validate profile side drawer authorities should be "Authorities"
    Then validate profile side drawer authoritiesValue should be "admin"
    Then validate profile side drawer Logout should be "Logout"
  @US_8
  Scenario:
    When click on profile button
    Then click on profile side drawer Logout
    Then validate user is in "TEK Insurance App" homepage
