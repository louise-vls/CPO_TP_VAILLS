/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo4;

/**
 *
 * @author louis
 */
public class Exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int face[]=new int[6];

    Scanner sc = new Scanner(System.in);

    int m;

    System.out.println("Entrez le nombre de lancer que vous voulez faire");

    m=sc.nextInt();

   

    for (int i=0; i<m ; i++){

        Random alea = new Random();

        int lancer = alea.nextInt(6);

        System.out.println(lancer);

        if (lancer==0){

            face[0]+=1;

        } else if(lancer==1){

            face[1]+=1;

        } else if(lancer==2){

            face[2]+=1;

        } else if(lancer==3){

            face[3]+=1;

        } else if(lancer==4){

            face[4]+=1;

        } else if(lancer==5){

            face[5]+=1;

        }

    }

    for(int i=0; i<6; i++){

        double pourcent = 0;

        pourcent= face[i]*100/m;

        System.out.println("Le pourcentage de face "+ (i+1) +" obtenue est: "+pourcent+"%");

    }

    }

   

}
