Feature: Login

  Scenario: Successful Login with Valid credentials
    Given User Launch Chrome Browser
    When user open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enter username as "Admin" Password as "admin123"
    Then Click on Login
    And close browser
