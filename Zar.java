/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zar;


import java.util.Random;
import java.math.BigDecimal;



/**
 *
 * @author özkan
 */
public class Zar {
     static int zar1;
   static int zar2;
   static int zar3;
   static int zar4;
   static String player;
   static String computer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        zarAt();
    
    }
    
    public static void zarAt(){
        int min=1;
        int max=6;
        
        Random random=new Random();
      zar1= random.nextInt(max)+min;
       zar2= random.nextInt(max)+min;
        zar3= random.nextInt(max)+min;
         zar4= random.nextInt(max)+min;
         if(zar1+zar2>zar3+zar4){
             System.out.println(zar1+" e "+zar2);
             System.out.println("Oyuncu kazandı");
             System.out.println("Bilgisayar :"+zar3+" e "+zar4);
         }
         else if(zar3+zar4>zar1+zar2){
             System.out.println(zar3+" e "+zar4);
             System.out.println("Bilgisayar kazandı");
             System.out.println("Oyuncu :"+zar1+" e "+zar2);
         }
         else{
                 System.out.println(zar3+" e "+zar4);
                 System.out.println("Oyun berabere");
                 System.out.println("Oyuncu :"+zar1+" e "+zar2);
                 }

        

    }
    
}
