package main;

/**
 * Décrivez votre classe Voiture ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Voiture
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String typeEssence;
    private int niveauEssence;
    private Parking parking;
    
    /**
     * Constructeur d'objets de classe Voiture
     */
    public Voiture()
    {
        // initialisation des variables d'instance
        niveauEssence = 0;
        typeEssence = "diesel";
    }

    /**
     * get sur la variable typeEssence
     *
     * @return  l'attribut de notre classe contenant le type d'essence de cette voiture
     */
    public String getTypeEssence()
    {
        // Insérez votre code ici
        return this.typeEssence;
    }
    public void setTypeEssence(String typeEssence)
    {
    this.typeEssence = typeEssence;
     }


    /**
     * get sur la variable typeEssence
     *
     * @return  l'attribut de notre classe contenant la quantite d'essence dans la voiture
     */
    public int getNiveauEssence()
    {
        // Insérez votre code ici
        return this.niveauEssence;
    }
       public void setNiveauEssence(int jaugeEssence)
    {
        this.niveauEssence = jaugeEssence;
    }
 
    /**
     * Permet de faire le plein a votre voiture
     */
    public void faireLePlein()
    {
        this.niveauEssence = 40;
    }
    
    /**
     * Affiche le carburant restant et sa quantité et vous donne un conseil
     */
    public void autonomie()
    {
        String var = "";
        if (niveauEssence <= 5)
            var = "allez vite faire le plein";
        else
            var = "vous pouvez encore rouler";
    }

}
