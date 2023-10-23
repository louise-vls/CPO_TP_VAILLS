package armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Baton extends Arme {
    int Age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        Age=age;
    }
           @Override
public String toString () {
    String chaine;
    chaine= Nom+""+NiveauAttaque+""+Age;
    return chaine;
}
}
