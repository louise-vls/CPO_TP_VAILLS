/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author louis
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
    nbConversions = 0 ;
}
    
    public double CelciusVersKelvin(double tCelcius) {
      nbConversions++;  
      double tKelvin =  tCelcius+ 273.15;
      return tKelvin;
    }
     public double KelvinVersCelcius(double tKelvin) {
         nbConversions++; 
      double tCelcius =  tKelvin- 273.15;
      return tCelcius;
     }
    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++; 
      double tCelcius =  (tFarenheit- 32)/1.8;
      return tCelcius;
    }
    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++; 
      double tFarenheit =  (tCelcius*1.8)+32;
      return tFarenheit;
    }
     public double KelvinVersFarenheit(double tKelvin) {
         nbConversions++; 
      double tFarenheit =  ((tKelvin- 273.15)*1.8)+32;
      return tFarenheit;
    }
    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++; 
      double tKelvin =  (tFarenheit-32)/1.8+273.15;
      return tKelvin;
    }
    
    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}
 

}
    
    

