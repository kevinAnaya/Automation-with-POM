Feature: login
  As a user login success

  Scenario Outline: login success
    Given the user enter the page
    When the user enter the <email> as email
    And the user enter the <password> as password
    Then the user looks at the home page

    Examples:
      | email | password  |
      | kevin | kev123456 |



