Feature: Is it Friday yet?

  Scenario Outline: Today is or is not Friday

    Given today is "<day>"
    When I ask whether it's Friday
    Then I should be told "<answer>"

    Examples:
    | day | answer |
    | Sunday | No  |
    | Monday | No  |
    | Tuesday | No |
    | Wednesday | No |
    | Thursday  | No |
    | Friday    | Yes |
    | Saturday  | No  |
