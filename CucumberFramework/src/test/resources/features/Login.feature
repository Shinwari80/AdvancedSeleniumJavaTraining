Feature: User Login

  Scenario: user is able to login with valid credentials

    Given user enters valid username in the email field
    And user enters valid password in the password field
    When user clicks on the login button
    Then user is logged in successfully

    Scenario Outline: user is not able to login with invalid credentials

      Given user enters invalid <email> in the email field
      And user enters invalid <password> in the password field
      When user clicks on the login button
      Then error <message> is displayed

Examples:
      |email             | password       | message                                             |
      |pateb@gmail.com | 123456         |Warning: No match for E-Mail Address and/or Password.|
      |testing@gmail.com | test@123234    |Warning: No match for E-Mail Address and/or Password.|
      |test1@gmail.com   | test123434     |Warning: No match for E-Mail Address and/or Password.|

