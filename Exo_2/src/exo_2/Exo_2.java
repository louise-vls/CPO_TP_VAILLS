/*
*louise
*TDA
*TP0 Exercice 1
*25 Septembre
*/
package exo_2;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Exo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        
       int ind;// indice
      
       int result=0;
       
       //additionner des nb premiers entiers
       ind=1;
       while (ind<=nb) {
           result=result+ind;
           ind=ind+1;
       }
       //affichage de resultat
       System.out.println();
       System.out.println("somme des "+ nb + "entiers est: "+result);

       }
    }
    

