/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Voiture {
    String modele;
    String marque;
    int nbPlaces;
    Personne proprietaire;
    public Voiture(String modele, String marque,int nbPlaces){
        modele=modele;
        marque=marque;
        nbPlaces = nbPlaces;
        proprietaire=null;    
    }
    
    @Override
public String toString () {
    return modele+""+marque;
}

       
    }


