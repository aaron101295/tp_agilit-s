import bean.Parking;
import bean.Voiture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Classe-test VoitureTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class VoitureTest {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private Parking parking1;

    /**
     * Constructeur de la classe-test VoitureTest
     */
    public VoitureTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        parking1 = new Parking();
        parking1.passerALaPompe();
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void faireLePleinTest() {
        Voiture voiture1 = new Voiture();
        voiture1.faireLePlein();
        assertEquals(40, voiture1.getNiveauEssence());
    }

    @Test
    public void fixtureTest() {
        parking1 = new Parking();
        parking1.passerALaPompe();
        assertEquals(40, parking1.passerALaPompe());
    }

    @Test
    public void voitureConstructorTest() {
        Voiture voiture1 = new Voiture();
        voiture1 = new Voiture();
        assertThat("Diesel", is("Diesel"));
        assertThat(40, is(40));
    }

    @Test
    public void getterSetterTypeEssenceTest() {
        final String typeEssence = "Diesel";
        final Voiture voiture = new Voiture();
        voiture.setTypeEssence("Diesel");
        Assert.assertEquals(voiture.getTypeEssence(), typeEssence);
    }

    @Test
    public void getterSetterNiveauEssenceTest() {
        final int niveauEssence = 40;
        final Voiture voiture = new Voiture();
        voiture.setNiveauEssence(40);
        Assert.assertEquals(voiture.getNiveauEssence(), niveauEssence);
    }
}
