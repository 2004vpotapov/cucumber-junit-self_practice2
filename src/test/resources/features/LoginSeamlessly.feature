Feature: Login functionality test


  @validLogin
  Scenario: login with valid credential
    Given user is on the log in page
    When user enter valid username
    And user enter valid password
    And user click log in button
    Then user should be able to log in

  @validLoginWithParams
  Scenario: login with valid credential
    Given user is on the log in page
    When user enter valid username "Employee61"
    And user enter valid password "Employee123"
    And user click log in button
    Then user should be able to log in

  @validLoginWithParamsOutLine
  Scenario Outline: login with valid credential
    Given user is on the log in page
    When user enter valid username "<username>"
    And user enter valid password "<password>"
    And user click log in button
    Then user should not be able to log in
    Examples:
      | username      | password      |
      | Employee61    | WrongPassword |
   #   | WrongUsername | Employee123   |
   #   | WrongUsername | WrongPassword |
      | Empty         | Empty         |
