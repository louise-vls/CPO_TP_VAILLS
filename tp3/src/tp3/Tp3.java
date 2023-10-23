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
        
        Magicien mag1= new Magicien("Gandalf",65,true);
        Magicien mag2= new Magicien("Garcimore",44,false);
        Guerrier g1= new Guerrier("Conan",78, false);
        Guerrier g2= new Guerrier("Lannister",45, true);
        
        ArrayList<Personnage> personnage=new ArrayList<>();
        personnage.add(mag1);
        personnage.add(mag2);
        personnage.add(g1);
        personnage.add(g2);
        
        for (int i=0;i<personnage.size();i++){
          System.out.println(Personnage.get(i));
        }
        
        
        
        
    }
    
    
}
