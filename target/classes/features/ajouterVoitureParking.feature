@featureTest
@voiture
Feature: US002 - Ajout de voitures dans le parking

    @Scenario
	Scenario: Nous voulons ajouter une voiture dans notre parking



	Given on verifie que le parking est bien vide
    When on ajoute une voiture au parking
    Then on verifie qu'il y a bien une voiture presnte dans le parking