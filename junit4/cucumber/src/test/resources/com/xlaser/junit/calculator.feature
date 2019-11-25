Feature: Basic Arithmetic

  Background: Calculator
    Given Turn on calculator!

  Scenario: Add
    When I add 4 and 5
    Then the result is 9

  Scenario: Subtract
    When I subtract 7 to 2
    Then the result is 5

  Scenario: Multiply
    When I multiply 3 to 4
    Then the result is 12

  Scenario: Divide
    When I divide 9 to 3
    Then the result is 3
