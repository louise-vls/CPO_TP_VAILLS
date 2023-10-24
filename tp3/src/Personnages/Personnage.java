/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import armes.*;
import java.util.ArrayList;
/**
 *
 * @author louis
 */
public abstract class Personnage {
    static int nombrePersonnages=0;
    int nombreGuerriers=0;
    int nombreMagiciens=0;
            
    String nom;
    int niveauVie=100;
    ArrayList<Arme> inventaire;
    Arme armeEnMain;
    
       
   
    
    public Personnage( String Nom, int NiveauVie){
        this.nom=Nom;
        this.niveauVie=NiveauVie;
        this.inventaire= new ArrayList<>();
        this.armeEnMain=null;
        nombrePersonnages ++;
        
        
                }
    
    public void ajouterArme(Arme arme){
        if (inventaire.size()<5){
            inventaire.add(arme);
        }
    }
    
    public void equipementArme(String nomArme){
        for (Arme arme : inventaire){
            if (arme.getNom().equals(nomArme)){
                armeEnMain = arme;
                System.out.println(nom+ " est maintenant arme avec "+ arme.getNom());
                return;
            }
        }
        System.out.println("L'arme "+ nomArme+" n'est pas dans l'inentaire de "+ nom +". ");
    }
    public Arme getArmeEnMain(){
        return armeEnMain;
       
    }

    public ArrayList<Arme> getInventaire() {
        return inventaire;
    }
    
    
    
    

           @Override
public String toString () {
    String chaine= "Personnage : "+ nom;
    if (armeEnMain != null){
    chaine+= "\n Arme en main : "+ armeEnMain.toString();
    }
    return chaine;
}
public static int getNombrePersonnages(){
    return nombrePersonnages;
}
    
}
