/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author louis
 */
public class Guerrier extends Personnage {
       boolean aCheval ;

    public Guerrier (String Nom, int NiveauVie, boolean ACheval) {
        super(Nom, NiveauVie);
        this.aCheval=ACheval;
    }
    
    public void setACheval(boolean ACheval){
        this.aCheval=ACheval;
    }
               @Override
public String toString () {
    String chaine;
    chaine= nom+""+niveauVie;
    return chaine;
}
}
