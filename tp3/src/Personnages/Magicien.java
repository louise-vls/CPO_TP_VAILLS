/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author louis
 */
public class Magicien extends Personnage {
       boolean confirme ;

    public Magicien (String Nom, int NiveauVie, boolean Confirme) {
        super(Nom, NiveauVie);
        this.confirme=Confirme;
    }
    public void setConfirme(boolean confirme){
        this.confirme=confirme;
    
    }
               @Override
public String toString () {
    String chaine;
    chaine= nom+" "+niveauVie;
    return chaine;
}


}
