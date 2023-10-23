/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author louis
 */
public abstract class Personnage {
    String nom;
    int niveauVie=100;
  
       
   
    
    public Personnage( String Nom, int NiveauVie){
        this.nom=Nom;
        this.niveauVie=NiveauVie;
        
                }
    public String getNom(){
        return nom;
       
    }
    public int getniveauVie(){
        return niveauVie;
    }

           @Override
public String toString () {
    String chaine;
    chaine= nom+""+niveauVie;
    return chaine;
}
    
}
