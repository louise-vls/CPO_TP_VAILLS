/*
*louise
*TDA
*TP0 Exercice 1
*25 Septembre
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           Please enter your operator
                            1)add 
                            2)substract 
                            3)multiply 
                            4)divive 
                            5)modulo""");
        Scanner sc = new Scanner(System.in);
       System.out.println("\n Entrez le nombre!"); 
       int operateur = sc.nextInt();
       
       System.out.println("\n Entrez le deuxième nombre!"); 
       int operande1 = sc.nextInt();
       
       System.out.println("\n Entrez le troisième nombre!"); 
       int operande2 = sc.nextInt();
       
        int result=0;
       
       if (operateur == 1)
          result = operande1+operande2;
       if (operateur == 2)
          result = operande1-operande2;
       if (operateur == 3)
          result = operande1*operande2;
       if (operateur == 4)
          result = operande1/operande2;
       if (operateur == 5)
          result = operande1%operande2;
       System.out.println("Le resultat est " + result);
       if (operateur <= 1) 
       System.out.println("Il y a une erreur "); 
       if (operateur >= 5) 
       System.out.println("Il y a une erreur ");
      
    
    
       
    }
    
}
