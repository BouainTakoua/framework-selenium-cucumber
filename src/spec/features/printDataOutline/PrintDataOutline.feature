@print-data
Feature: Print Data - Text Box
  as a user i want to print my data

  @print
  Scenario Outline: Print Data - Text Box
    Given I open application Text Box
    When I want to print fullname "<fullName>" 
    And I want to print email "<email>" 

    Examples: 
      | fullName   | email            |
      | Achref | achref@gmail.com |
      | Meryem | meryem@gmail.com |
