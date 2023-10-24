/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;
import armes.*;
import Personnages.*;
import java.util.ArrayList;
/**
 *
 * @author louis
 */
public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        System.out.print(Excalibur);
        System.out.print(Durandal);
        System.out.print(Chene);
        System.out.print(Charme);
        
        ArrayList<Arme> TabAarme= new ArrayList<>();
        TabAarme.add(Excalibur);
        TabAarme.add(Durandal);
        TabAarme.add(Chene);
        TabAarme.add(Charme);
        
        Magicien magicien= new Magicien("Gandalf",65,true);
        
        Guerrier guerrier= new Guerrier("Conan",78, false);
       
        
        /*ArrayList<Personnage> personnage=new ArrayList<>();
        personnage.add(magicien);
        personnage.add(guerrier);
       */
        guerrier.ajouterArme(Excalibur);
        guerrier.ajouterArme(Durandal);
        guerrier.ajouterArme(Chene);
        
        guerrier.equipementArme("Excalibure");
        
         magicien.ajouterArme(Excalibur);
        magicien.ajouterArme(Durandal);
        magicien.ajouterArme(Chene);
        
        System.out.println(guerrier);
        System.out.println(magicien);
        
        }  
    public static int nombreArmePref(Personnage personnage, Class<?> typeArme){
        int count =0;
        for (Arme arme : personnage.getInventaire()){
            if (typeArme.isInstance(arme)){
                count++;
            }
        }
            return count;
        }
        
    
    
    
}
