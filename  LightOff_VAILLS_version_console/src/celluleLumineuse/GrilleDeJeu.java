/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celluleLumineuse;

/**
 *
 * @author louis
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes){
        nbLignes= p_nbLignes;
        nbColonnes = p_nbColonnes;
        
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                matriceCellules[i][j]= new CelluleLumineuse();
            
            }
        }
    }
    public void  eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                matriceCellules[i][j].eteindre();
            
            }
        }
    }
    
    
    public void  activerLigneDeCellules(int idLigne){
         for (int j=0; j<idLigne; j++){
                matriceCellules[idLigne][j].activerCellule();
         }
    }
    public void activerColonneDeCellules(int idColonne){
         for (int i=0; i<idColonne; i++){
             matriceCellules[i][idColonne].activerCellule();
         }
    }
    public void activerDiagonaleDescendante(){
         for (int i=0; i<nbLignes && i<nbColonnes; i++){
                matriceCellules[i][i].activerCellule();
         }
    }
    public void activerDiagonaleMontante(){
         for (int i=0; i<nbLignes && i<nbColonnes; i++){
                matriceCellules[i][nbColonnes - i -1].activerCellule();
         }
    }
    public void activerLigneColonneOuDiagonaleAleatoire(){
        int random = (int)(Math.random()*3);
        switch (random){
            case 0:
                int ligneAleatoire =(int) (Math.random()*nbLignes);
                activerLigneDeCellules(ligneAleatoire);
                break;
            case 1:
                int colonneAleatoire =(int) (Math.random()*nbColonnes);
                activerLigneDeCellules(colonneAleatoire);
                break;
            case 2 :
                    if (Math.random()<0.5){
                        activerDiagonaleMontante();
                    } else {
                        activerDiagonaleDescendante();
                    }
                    break;
            default:
                break;
                
        }
    }
    public void melangerMatriceAleatoirement(int nbTours){
        for (int i =0; i<nbTours; i++){
             eteindreToutesLesCellules() ;
             activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    public boolean  cellulesToutesEteintes(){
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                if (!matriceCellules[i][j].estEteint()){
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
public String toString () {
    StringBuilder gridString = new StringBuilder();
    
    gridString.append("  |");
            for (int j=0; j<nbColonnes; j++){
                gridString.append(" ").append(j).append("  |");
            }
            gridString.append("\n");
   
            gridString.append("-");
            for (int j=0; j<nbColonnes; j++){
                gridString.append("-----");
            }
                gridString.append("\n");
            
   for (int i=0; i<nbLignes; i++){
                gridString.append("  |");
                
             for (int j=0; j<nbColonnes; j++){
                CelluleLumineuse cellule = matriceCellules[i][j];
                String etat = cellule.estEteint()? "0" : "X";
             gridString.append(" ").append(etat).append("  |");
               
                }
             
             gridString.append("\n");
             
             
             gridString.append("-");
            for (int j=0; j<nbColonnes; j++){
                gridString.append("-----");
            }
            gridString.append("\n");
}
   return gridString.toString();
    
}
}
