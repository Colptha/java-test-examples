Feature: Pass list to given

  Scenario: Passing a list

    Given I have a list of items:
      | first |
      | second |
    When I execute the statement
    Then I should expect all items to be present