Feature: Authentification avec plusieurs utilisateurs
  ETQ utilisateur je souhaite m'identifier avec plusieurs utilisateurs

  @cs
  Scenario Outline: Title of your scenario outline
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie username "<username>"
    When Je saisie password "<password>"
    And Je clique sur le bouton login
    Then Je me redirige vers la page Home "Welcome"

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Imen     | imen123  |
