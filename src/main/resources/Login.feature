Feature: Login Feature
  this feature is to test the login page

  @Test
  Scenario: verify user able to login and navigate to dashboard
    Given Open the application
    Then I login into the application
    Then I verify dashboard is displayed
    Then Open menu bar
    Then I click "ORDERS" menu
    Then I verify order page is displayed
