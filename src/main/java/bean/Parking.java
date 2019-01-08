package bean;

import java.util.ArrayList;
import java.util.List;

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
    public List<Voiture> list = new ArrayList<Voiture>();
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
    public boolean AjouteVoitureAuParking(Voiture v){
        list.add(v);
        return true;
    }
}
