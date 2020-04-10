Feature: Create a custom parameter

  Scenario: Beverage parameter

    Given coffee is specified
    When it reaches the step definition
    Then it should have a name of "COFFEE"

    Given tea is specified
    When it reaches the step definition
    Then it should have a name of "TEA"
