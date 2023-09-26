/*
*louise
*TDA
*TP1 EXO 2
*26 Septembre
*/
package tp1_convertisseur_vaills;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_convertisseur_VAILLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("\n Bonjour, saisissez une valeur : "); 
       double  var1= sc.nextDouble();
       
       System.out.println("\n Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin ");
       double  var2= sc.nextDouble();
       double a=CelciusVersKelvin(var1);
       double b=KelvinVersCelcius(var1);
       double c=FarenheitVersCelcius(var1);
       double d=CelciusVersFarenheit(var1);
       double e=KelvinVersFarenheit(var1);
       double f=FarenheitVersKelvin(var1);
       if (var2==1)
       System.out.println(a);
       if (var2==2)
       System.out.println(b);
       if (var2==3)
       System.out.println(c);
       if (var2==4)
       System.out.println(d);
       if (var2==5)
       System.out.println(e);
       if (var2==6)
       System.out.println(f);
       
    }
    public static double CelciusVersKelvin(double tCelcius) {
      double tKelvin =  tCelcius+ 273.15;
      return tKelvin;
    }
     public static double KelvinVersCelcius(double tKelvin) {
      double tCelcius =  tKelvin- 273.15;
      return tCelcius;
     }
    public static double FarenheitVersCelcius(double tFarenheit) {
      double tCelcius =  (tFarenheit- 32)/1.8;
      return tCelcius;
    }
    public static double CelciusVersFarenheit(double tCelcius) {
      double tFarenheit =  (tCelcius*1.8)+32;
      return tFarenheit;
    }
     public static double KelvinVersFarenheit(double tKelvin) {
      double tFarenheit =  ((tKelvin- 273.15)*1.8)+32;
      return tFarenheit;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
      double tKelvin =  (tFarenheit-32)/1.8+273.15;
      return tKelvin;
    }
      
      
    }
    
    
    
    
   
    

