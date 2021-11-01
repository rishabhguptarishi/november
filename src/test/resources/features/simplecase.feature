Feature: Basic case

  @chrome
  Scenario: On Chrome Just open android app through automation
    Given user opens the android app in "chrome"
    When user clicks on the Media option
    Then validate custom view

  @chrome
  Scenario: On Chrome Just open snackmagic website
    Given user opens the snackmagic website in "chrome"
    When user clicks on the Media option
    Then validate custom view

  @firefox
  Scenario: On Firefox Just open android app through automation
    Given user opens the android app in "firefox"
    When user clicks on the Media option
    Then validate custom view

  @firefox
  Scenario: On Firefox Just open snackmagic website
    Given user opens the snackmagic website in "firefox"
    When user clicks on the Media option
    Then validate custom view
