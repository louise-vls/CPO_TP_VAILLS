/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_vaills_version_console;
import celluleLumineuse.*;
/**
 *
 * @author louis
 */
public class LightOff_VAILLS_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Niveau simple = new Niveau (4,4,11);
         Niveau moyen = new Niveau (7,7,16);
         Niveau difficile = new Niveau (10,10,2);
         
         Niveau nivPartie= difficile;
         
        Partie jeu = new Partie(nivPartie);
        jeu.lancerPartie();
        
        
        
       /* CelluleLumineuse cellule1 = new CelluleLumineuse();
        System.out.println("Cellule 1: "+ cellule1);
        
        cellule1.activerCellule();
        System.out.println("Cellule 1: "+ cellule1);
        
        cellule1.eteindre();
        System.out.println("Cellule 1 éteinte? : "+ cellule1);
        
        GrilleDeJeu grid= new GrilleDeJeu(5,5);
             System.out.println("Grille initial lorsque toutes les cellules sont etenites : ");
                  System.out.println(grid);
            
            grid.activerLigneDeCellules(3);
            System.out.println("grille apres l'activation de la ligne 3");
            System.out.println(grid);
            
            grid.activerColonneDeCellules(4);
            System.out.println("grille apres l'activation de la colonne 4");
            System.out.println(grid);
            
            grid. activerDiagonaleDescendante();
            System.out.println("grille apres l'activation de la diagonale descendente ");
            System.out.println(grid);
            
            
            grid.activerDiagonaleMontante();
            System.out.println("grille apres l'activation de la diagonale montante ");
            System.out.println(grid);
            
            
            grid. activerLigneColonneOuDiagonaleAleatoire();
            System.out.println("grille apres l'activation de ligne et colonne diagonales aleatoirement ");
            System.out.println(grid);
            
            
            grid.melangerMatriceAleatoirement(7);
            System.out.println("grille apres le melande au bout de 7 tours ");
            System.out.println(grid);
            
       */
            
        }
    }
    

