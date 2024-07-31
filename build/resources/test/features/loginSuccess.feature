Feature: login
  As a user login success

  Scenario Outline: login success
    Given the user enter the page
    When the user enter the <email> as email
    And the user enter the <password> as password
    Then the user looks at the <message> as message

    Examples:
      | email | password  | message               |
      | test | test123 | Thank you for Loggin. |



