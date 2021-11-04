Feature: Logout - Orange HRM
  ETQ admin je souhaite déconnecter de mon compte Orange HRM

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le nom d'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @logout
  Scenario: Déconnecter de mon compte Orange HRM
    When je clique sur le boutton welcome
    And je clique sur le boutton logout
    Then je me trouve dans la page de connexion "LOGIN Panel"
