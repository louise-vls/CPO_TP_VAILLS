/*
*louise
*TDA
*TP1
*26 Septembre
*/
package tp1_manipnombresint_vaills;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_manipNombresint_VAILLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("\n Saisissez deux entiers"); 
       int entier1 = sc.nextInt();
       int entier2 = sc.nextInt();
       int somme=entier1+entier2;
       int difference=entier1-entier2;
       int produit=entier1*entier2;
       System.out.println("\n entier 1: "+entier1+ "\n entier 2: "+entier2+ "\n la somme est: "+somme+"\n la difference est: "+difference+ "\n le produit est: "+produit);
       int quotient=entier1/entier2;
       int module=entier1%entier2;
       System.out.println("\n le quotient est "+quotient+"\n le reste est "+module); 
    }
    
}
