@connexion
Feature: Authetification - OrangeHRM
  En tant que utilisateur je souhaite m authentifier

  @cnx
  Scenario: Authetification - OrangeHRM
    Given je ouvre l application OrangeHRM
    When je saisie username
    And je saisie le mot de passe
    And clique sur le boutton login
    Then redirection vers la page home
