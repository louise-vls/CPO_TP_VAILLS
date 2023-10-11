/*
 * Louise vaills
*TP2 exo 4
*11/10/2023
 */
package tp2_relation_1_vaills;

/**
 *
 * @author louis
 */
public class TP2_relation_1_VAILLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");

bob.ajouterVoiture(uneClio);
bob.ajouterVoiture(uneAutreClio);
reno.ajouterVoiture(une2008);
reno.ajouterVoiture(uneMicra);


System.out.println("liste des voitures disponibles "+ uneClio + 
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

System.out.print("Listes des voitures de bob: "+ bob.liste_voitures);
System.out.print("Listes des voitures de reno: "+ reno.liste_voitures);


    }
    
}
