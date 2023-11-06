/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celluleLumineuse;
import java.util.Scanner;
/**
 *
 * @author louis
 */
public class Partie {
     GrilleDeJeu grid;
        int nbCoups;
        Niveau niveau;
        
        
        public Partie(Niveau niv){
            grid = new GrilleDeJeu(3,5);
            nbCoups = 0;
            niveau = niv;        
        }
        
        public void initialiserPartie(){
            grid.eteindreToutesLesCellules();
            grid.melangerMatriceAleatoirement(10);
        }
        public void lancerPartie(){
           initialiserPartie();
           
           System.out.println("Bienvenue dans le jeu lightOff! ");
           System.out.println("Etat initial de la grille: ");
           System.out.println(grid);
           
           while (!grid.cellulesToutesEteintes()){
               nbCoups++;
               Scanner scanner =new Scanner(System.in);
            
            while(!grid.cellulesToutesEteintes()){
             System.out.println("grille actuelle ");
            System.out.println(grid);   
            
            System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
            String coup = scanner.nextLine();
            
               if (coup.equals("ligne")){
                grid. activerLigneColonneOuDiagonaleAleatoire();
            }else if (coup.equals("colonne")){
                grid. activerLigneColonneOuDiagonaleAleatoire();
                }else if (coup.equals("diagonale")){
                grid. activerLigneColonneOuDiagonaleAleatoire();
                }else{
                    System.out.println("Coup invalide");
                }
               System.out.println("Coups #" +nbCoups);
               System.out.println(grid);
            }
           System.out.println("Bravo vous avez eteint toutes les celules en : "+ nbCoups+ " coups.");
        }
}}

         
        
        

