/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celluleLumineuse;

/**
 *
 * @author louis
 */
public class CelluleLumineuse {
    boolean allumer;
    
    /**
     * On initialise une nouvelle cellule qui est eteinte
     */
    public CelluleLumineuse(){
        this.allumer=false;
  
    }

    /**
     * Allume la cellule
     */
    public void allumer(){
        allumer=true;
    }
    
    /**
     * eteint la cellule
     */
    public void eteindre(){
        allumer=false;
    }
    
    /**
     * verifie si la cellule lumineuse est allumee
     * @return la cellule allume dans le cas ou elle est eteinte il retourne false
     */
    public boolean estAllumee(){
        return allumer;
    }
    @Override
public String toString () {
    return allumer ? "allumée" : "eteint";
    
}
}
