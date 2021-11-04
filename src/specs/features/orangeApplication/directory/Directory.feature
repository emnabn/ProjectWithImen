Feature: Directory - Orange HRM
  ETQ admin je souhaite chercher des employés par name

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le nom d'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    
     @searchDirectory
  Scenario: recherche d'un employé
    When je clique sur le menu Directory 
    And je saisie Name "Alice Duval"
    And je clique sur search
    Then l'employé sera affiché "Alice Duval"