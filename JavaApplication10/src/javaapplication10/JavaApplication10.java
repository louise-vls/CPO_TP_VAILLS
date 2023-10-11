/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur Objet1= new Convertisseur();
        Objet1.CelciusVersKelvin(45);
        Objet1.KelvinVersCelcius(57);
        Objet1.FarenheitVersCelcius(95);
        System.out.println("conversion effectuee : "+Objet1.nbConversions);
        
        Convertisseur Objet2= new Convertisseur();
        Objet2.KelvinVersFarenheit(56);
        Objet2.CelciusVersFarenheit(54);
        Objet2.FarenheitVersKelvin(76);
        System.out.println("conversion effectuee : "+Objet2.nbConversions);
        
        Scanner sc = new Scanner(System.in);
       System.out.println("\n Bonjour, saisissez une valeur : "); 
       double  var1= sc.nextDouble();
       System.out.println("\n Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin ");
          int var2= sc.nextInt();
       
        if (var2==1){
        double a=Objet1.CelciusVersKelvin(var1);
       System.out.println(a);
        }
       if (var2==2){
        double  b=Objet1.KelvinVersCelcius(var1);
       System.out.println(b);
       }
       if (var2==3){
        double  c= Objet1.FarenheitVersCelcius(var1);
        System.out.println(c);
       }
       
       if (var2==4){
        double d= Objet2.CelciusVersFarenheit(var1);
       System.out.println(d);
       }
       if (var2==5){
        double e=   Objet2.KelvinVersFarenheit(var1);
       System.out.println(e);
       }
       if (var2==6) {
          double f=Objet2.FarenheitVersKelvin(var1);
       System.out.println(f);
       }
    }
    
}
