Feature: loguin success
  As a user loguin success in the page

  Scenario Outline: loguin success
    Given the user enter the page
    When the user enter the <user> as user and <password> as password
    Then the user view the home page

    Examples:
      | user  | password  |
      | kevin | 123456789 |


