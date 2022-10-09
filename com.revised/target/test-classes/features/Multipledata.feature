@tag121
Feature: Title of your feature1
@invalidlogin
  Scenario Outline: User is  not able login1 with the invalid credentials
    Given User launched the login1 page
    When User logged1 into the application with username <username> and password <password>
    Then Home page1 is not displayed
    
     Examples: 
      | username  | password |
      | Deepak |   Male |
    | Hanmanth |    Male |
     | Shivu |    Male |
     | Akshata |    Female |
     | Divya |    Female | 