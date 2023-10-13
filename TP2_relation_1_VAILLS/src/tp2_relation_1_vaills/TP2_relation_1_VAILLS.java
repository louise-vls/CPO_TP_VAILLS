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

System.out.println("liste des voitures disponibles "+ uneClio + 
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

bob.liste_voitures[0]=uneClio;
bob.liste_voitures[1]=uneAutreClio;
reno.liste_voitures[0]=une2008;
reno.liste_voitures[1]=uneMicra;


bob.nbVoitures = 1;
uneClio.Proprietaire = bob;

System.out.print("La premiere voiture dans la liste de bob est: "+ bob.liste_voitures[0]);
System.out.print("La deuxieme voiture dans la liste de bob est: "+ bob.liste_voitures[1]);
System.out.print("La premiere voiture dans la liste de reno est: "+ reno.liste_voitures[0]);
System.out.print("La deuxieme voiture dans la liste de reno est: "+ reno.liste_voitures[1]);

    }
    
}
