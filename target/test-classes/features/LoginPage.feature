@loginPage
  Feature: Login Feature

    Background:
      Given: I am on home page
@login
      Scenario Outline: Verify invalid loginfor multiple users
        When I enter <username> into username text fields on home screen
        And  I enter <password> into password text fields on home screen
        And  I click on login button on home screen
        Then I verify that invalid credentials



        Examples:

        | username | password |
        | ayla@gmail.com | test123  |
        | ayse@gmail.com | test456  |
        | ali@gmail.com  | test789  |
