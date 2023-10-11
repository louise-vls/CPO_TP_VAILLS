/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_nom1;

/**
 *
 * @author louis
 */
public class TP2_manip_NOM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tartiflette assiette1 = new Tartiflette(500) ;
       Tartiflette assiette2 = new Tartiflette(600) ;
       Tartiflette assiette3 = assiette2 ; 
       /*Moussaka assiette666 = assiette1 ;*/
       
            Moussaka[] tableauxMoussaka=new Moussaka[10];
for (int i = 0; i< tableauxMoussaka.length;i++){
    tableauxMoussaka[i] = new Moussaka();
}

System.out.println("nb de calories de Assiette 2 : " + 
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + 
assiette3.nbCalories) ;
if (assiette3 == assiette2){
    System.out.println("assiette 2 et assiette 3 referent au meme objet");
}else{
System.out.println("assiette 2 et assiette 3 referent au meme objet");
    }
Tartiflette temp = assiette1;
assiette1= assiette2;
assiette2=temp;
 

    }
    
}
