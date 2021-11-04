@buzztest
Feature: Poster un message
  ETQ'utilisateur je souhaite publier un statut, uploader une image ou partager un vidéo sur la section buzz.

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le nom d'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @buzztxt
  Scenario: Poster un statut dans la section buzz
    When Je clique sur le menu Buzz
    And Je clique sur le bouton Update Status
    When Je saisie un message dans la case Post-Content "Hello Dear Friends!"
    And Je clique sur le bouton Post-Submit
    Then Je vérifie que le message a été soumis "Hello Dear Friends!"

  @buzzphoto
  Scenario: Poster une image dans la section buzz
    When Je clique sur le menu Buzz
    And Je clique sur l'onglet upload images
    When Je saisie un message dans la case Photo-Text "Hello World!"
    And Je telecharge l'image en cliquant sur le boutton Upload Images "C:\Users\imene\eclipse-workspace\FirstProjectFrameworkSeleniumBDD\FirstProjectFrameworkSeleniumBDD\src\test\resources\images\good-morning.jpg"
    And Je clique sur le bouton Post
    Then Je vérifie que l'image est importer et que le message a été soumis "Hello World!"

  @buzzvideo
  Scenario: Partager un video dans la section buzz
    When Je clique sur le menu Buzz
    And Je clique sur l'onglet share video
    When Je saisie l'url dans createVideo_content  "https://youtu.be/LUri5A2CGQ0"
    And Je clique sur le bouton save video
    Then Je vérifie que le video a été partagé "https://youtu.be/LUri5A2CGQ0"
