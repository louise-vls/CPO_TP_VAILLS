/*
*louise
*TDA
*TP1 EXO 3
*26 Septembre
 */
package tp1_guessmynumber_vaills;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_guessMyNumber_VAILLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("\n Quel niveau de difficulté? \n 1)facile \n 2)normal \n 3)difficle");

        int n = generateurAleat.nextInt(100);
        System.out.println("Choisir le niveau de difficulte ");
        int mod = sc.nextInt();
        int nombreTent = 1;

        if (mod == 1) {
            System.out.println("Saisi un nmbre entre 0 et 100 ");

            int var1 = sc.nextInt();
            while (n != var1) {
                if (n + 15 > var1) {
                    System.out.println("beaucoup trop petit ");
                    var1 = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n > var1 && var1 > n - 14) {
                    System.out.println("trop petit ");
                    var1 = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n - 15 < var1) {
                    System.out.println("beaucoup trop grand ");
                    var1 = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }
                if (n < var1 && var1 < n + 14) {
                    System.out.println("trop grand ");
                    var1 = sc.nextInt();
                    nombreTent = nombreTent + 1;
                }

                System.out.println("gagne ");
                System.out.println("nombre de tentatives " +nombreTent);
            }
        }

            if (mod == 2) {

                System.out.println("Saisi un nmbre entre 0 et 100 ");
                int var3 = sc.nextInt();
                while (n != var3) {
                    if (n > var3) {
                        System.out.println("trop petit ");
                        var3 = sc.nextInt();
                        nombreTent = nombreTent + 1;
                    }
                    if (n < var3) {
                        System.out.println("trop grand ");
                        var3 = sc.nextInt();
                        nombreTent = nombreTent + 1;
                    }
                }
                System.out.println("gagne ");
                System.out.println("tentatives" + nombreTent);
            }
    

            if (mod == 3) {
                int n2 = generateurAleat.nextInt(200);
                System.out.println("Saisi un nmbre entre 0 et 200 ");
                int var2 = sc.nextInt();
                while (n != var2) {

                    if (n2 > var2) {
                        System.out.println("trop petit ");
                        var2 = sc.nextInt();
                        nombreTent = nombreTent + 1;
                    }
                    if (n2 < var2) {
                        System.out.println("trop grand ");
                        var2 = sc.nextInt();
                        nombreTent = nombreTent + 1;
                    }
                    if (n2==var2){
                    System.out.println("gagne ");
                    System.out.println(nombreTent);
                    }
                    if (nombreTent == 5) {
                    System.out.println("perdu ");
                    break;
                    }
                }
            }
    }
}

            
        
    

