package tp2_relation_1_vaills;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[]liste_voitures;
    public Personne(String nom, String prenom){
        nom=nom;
        prenom=prenom;
        nbVoitures=0;
        liste_voitures = new Voiture [3] ;
        
                    
    }
     @Override
public String toString () {
return prenom +""+nom;
}
    public boolean ajouterVoiture(Voiture voiture){
    if (voiture.Proprietaire != null){
        return false;
    }
    
    if (nbVoitures >=3){
        
        System.out.println("3 voitures ont été selectionnées: on ne peut pas ajouter de voitures");
    }
    
       liste_voitures[nbVoitures]=voiture;
       nbVoitures++;
       voiture.Proprietaire=this;
       return true;
       System.out.println( voiture.Marque  + " " + voiture.Modele + "sont ajoutées à la liste de: " + prenom + " " + nom + ". ");
    
    
    }
}
