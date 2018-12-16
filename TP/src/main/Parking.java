package main;

/**
 * Décrivez votre classe toutTerrain ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Parking
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    private Voiture voiture;

    /**
     * Constructeur d'objets de classe toutTerrain
     */
    public Parking()
    {
        this.voiture = new Voiture();
    }

    public int passerALaPompe()
    {
       this.voiture.faireLePlein();
       return this.voiture.getNiveauEssence();
    }

}
