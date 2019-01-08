@featureTest
@voiture
Feature: US003 - Affichage d'un conseil conseil à l'utilisateur

    @Scenario
	Scenario: Retourne une chaîne de caractère qui contient un conseil pour le client



	Given le client demande un conseil
    When le systeme conseil le client
    Then le client est conseille