@print-data
Feature: Print Data - Text Box
  as a user i want to print my data

  @print
  Scenario Outline: Print Data - Text Box
    Given I open application Text Box
    When I want to pritn fullname "<fullName>"
    And si want to print email "<email>"

    Examples: 
      | name   | email            |
      | Achref | Achref@gmail.com |
      | Meryem | Meryem@gmail.com |
