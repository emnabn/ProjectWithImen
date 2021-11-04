Feature: Recherche d'un employé
   ETQ admin je souhaite chercher un employé par username

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le nom d'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @search
  Scenario: Recherche d'un employé par username
    When Je clique sur le menu Admin
    And Je clique sur le menu User Management
    When Je saisie Username "Alice.Duval"
    And Je clique sur le bouton search
    Then Je trouve un seul employé "Alice.Duval"
    And Je me déconnecte du compte
