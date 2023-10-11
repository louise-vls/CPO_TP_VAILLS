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
    public boolean ajouterVoiture(Voiture voiture){
    if (voiture.proprietaire != null){
        return false;
    }
    if (nbVoitures < liste_voitures.length){
       liste_voitures[nbVoitures]=voitures;
       nbVoitures++;
       voiture.proprietaire=this;
       return true;
    }
    return false;
    }
    
    @Override
public String toString () {
return prenom +""+nom;
}
}
