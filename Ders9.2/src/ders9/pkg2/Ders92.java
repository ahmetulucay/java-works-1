/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9.pkg2;

/**
 *
 * @author Eier
 */
import java.util.Scanner;
        
public class Ders92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan = new Scanner(System.in);
     
     int sayi = scan.nextInt();
        
     switch(sayi){
         case 1:
             System.out.println("Bir");
             break;
         case 2:
             System.out.println("Iki");
             break;
         case 3:
             System.out.println("Uc");
             break;
         case 4:
             System.out.println("Dort");
             break;
         default:
             System.out.println("Gecersiz Islem");
             break;
     }
    }
    
}
