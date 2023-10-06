/*
*louise
*TDA
*TP2 EXO 1
*04 Octobre
 */
package tp2;

/**
 *
 * @author louis
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBière uneBiere = new BouteilleBière("Cuvée des trolls", 
    7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    System.out.println(uneBiere) ;
    uneBiere.Décapsuler();
    System.out.println(uneBiere) ;
    
    BouteilleBière deuxBiere = new BouteilleBière("Leffe", 
    6.6 ,"Abbaye de Leffe") ;
    deuxBiere.lireEtiquette();
    System.out.println(deuxBiere) ;
    deuxBiere.Décapsuler();
    System.out.println(deuxBiere) ;

    BouteilleBière troisBiere = new BouteilleBière("Corona", 
    7.8 ,"Let's goooo!") ;
    troisBiere.lireEtiquette();
    System.out.println(troisBiere) ;
    troisBiere.Décapsuler();
    System.out.println(troisBiere) ;
    
    BouteilleBière quatreBiere = new BouteilleBière("COCORICOOOOOO", 
    7.2 ,"Pablo") ;
    quatreBiere.lireEtiquette();
    System.out.println(quatreBiere) ;
    quatreBiere.Décapsuler();
    System.out.println(quatreBiere) ;
    
    BouteilleBière cinqBiere = new BouteilleBière("No No Jose", 
    7.1 ,"Josianne et Jaqueline") ;
    cinqBiere.lireEtiquette();
    System.out.println(cinqBiere) ;
    cinqBiere.Décapsuler();
    System.out.println(cinqBiere) ;


    }
    
}
