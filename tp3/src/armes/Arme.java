package armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Arme {
    String Nom;
    int NiveauAttaque=100;
    
    public Arme(String nom, int niveauAttaque){
        Nom=nom;
        NiveauAttaque=niveauAttaque;
       
        
    }
    public String getNom(){
        return Nom;
    }
    
        @Override
public String toString () {
    String chaine;
    chaine= Nom+""+NiveauAttaque;
    return chaine;
}

    
}
