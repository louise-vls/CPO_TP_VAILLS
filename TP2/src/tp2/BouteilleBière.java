/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author louis
 */
public class BouteilleBière {
String nom;
double degreAlcool;
String brasserie;
boolean ouverte;

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
}
void Décapsuler(){
    if (ouverte==true){
   System.out.println( "Erreur votre biere est ouverte" ) ; 
}else{
    ouverte=true;
    System.out.println(ouverte ) ;  
}
   
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ; 
return chaine_a_retourner ;
}

 public BouteilleBière(String unNom, double unDegre, String 
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
}
