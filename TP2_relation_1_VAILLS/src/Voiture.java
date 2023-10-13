
import tp2_relation_1_vaills.Personne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String unModele, String uneMarque,int unePuissanceCV){
        Modele=unModele;
        Marque=uneMarque;
        PuissanceCV=unePuissanceCV;
        Proprietaire=null;    
    }
    
    @Override
public String toString () {
    return Modele+" "+Marque+" "+PuissanceCV;
}

       
    }


