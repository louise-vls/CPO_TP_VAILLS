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
        
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        System.out.println("Cellule 1: "+ cellule1);
        
        cellule1.activerCellule();
        System.out.println("Cellule 1: "+ cellule1);
        
        cellule1.eteindre();
        System.out.println("Cellule 1 �teinte? : "+ cellule1);
    }
    
}
