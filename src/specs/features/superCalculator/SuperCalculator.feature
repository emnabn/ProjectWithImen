@superCalculator
Feature: Tester les fonctions de la calculatrice ~superCalculator~
  ETQ utilisateur, je veux tester les fonctionnalités de la calculatrice ~superCalculator~

  Background: 
    Given Je me connecte sur l'application superCalculator
    And Je saisie le premier numéro "8"
    And Je saisie le deuxiéme numéro "7"

  @addition
  Scenario: Effectuer une fonction d'addition
    When Je selecte la fonction addition "ADDITION"
    And Je clique sur le boutton Go
    Then Le résultat d'addition s'affiche "15"

  @soustraction
  Scenario: Effectuer une fonction de soustraction
    When Je selecte la fonction soustraction "SUBTRACTION"
    And Je clique sur le boutton Go
    Then Le résultat de soustraction s'affiche "1"

  @multiplication
  Scenario: Effectuer une fonction de multiplication 
    When Je selecte la fonction multiplication "MULTIPLICATION"
    And Je clique sur le boutton Go
    Then Le résultat de multiplication s'affiche "56"

  @division
  Scenario: Effectuer une fonction de division 
    When Je selecte la fonction division "DIVISION"
    And Je clique sur le boutton Go
    Then Le résultat de division s'affiche "1.1"

  @modulo
  Scenario: Effectuer une fonction de modulo 
    When Je selecte la fonction modulo "MODULO"
    And Je clique sur le boutton Go
    Then Le résultat de modulo s'affiche "1"
