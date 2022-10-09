
@Login
Feature: Login to the application

  @Login_01
  Scenario: Login to the application with valid credentials
    Given Launch the browser
    When Login with username "deepak123" and password "Deepak123$"
    Then Verify the login is successful


