package armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Epee extends Arme {
   
    int finesse;

    public Epee(String nom, int niveauAttaque, int Finesse) {
        super(nom, niveauAttaque);
        finesse=Finesse;
    }
           @Override
public String toString () {
    String chaine;
    chaine= Nom+""+NiveauAttaque;
    return chaine;
}
}
