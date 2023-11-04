/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celluleLumineuse;

/**
 *
 * @author louis
 */
public class Niveau {
    int nbLignes;
    int nbColonnes;
    int Maxcoups;
    
    public Niveau(int nblignes, int nbcolonnes, int MaxCoups){
        nbLignes= nblignes;
        nbColonnes=nbcolonnes;
        Maxcoups=MaxCoups;
    }
    public int getnbLingnes(){
        return nbLignes;
    }
    public int getnbColonnes(){
        return nbColonnes;
    }
      public int getMaxcoups(){
        return Maxcoups;
    }
    
}
