$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authetification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m authentifier",
  "id": "authetification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 10686029600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authetification - OrangeHRM",
  "description": "",
  "id": "authetification---orangehrm;authetification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "je ouvre l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "je saisie username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clique sur le boutton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "redirection vers la page home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2465289600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieUsername()"
});
formatter.result({
  "duration": 223215400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieLeMotDePasse()"
});
formatter.result({
  "duration": 207857900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.cliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 2785079200,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 84700100,
  "status": "passed"
});
formatter.after({
  "duration": 2241069100,
  "status": "passed"
});
});