@tag
Feature: Authentification - param - OrangeHRM
  as a user i want to authenticate
  
Background:

  @auth
  Scenario: Authentification - param - OrangeHRM
    Given je ouvre l application OrangeHRM
    When je saisie le nom d utilisateur "Admin"
    And je saisie le mot de passe "admin123"
    And clique sur le boutton login
    Then redirection vers la page Home

  @buzz
  Scenario: Clique - Buzz    
    When je clique le module Buzz

  @temps
  Scenario: Clique - Temps
    When je clique le module temps
