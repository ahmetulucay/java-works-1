/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11.pkg1_while.pkgdo;

import java.util.Scanner;

/**
 *
 * @author Eier
 */
public class Ders111_WHILEDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //1234
       
       Scanner scan =new Scanner(System.in);
       
       int sayi = scan.nextInt();
       int toplam = 0;
       
       do {
            toplam += sayi%10;
            sayi = sayi/10 ;
            System.out.println("Toplam= "+toplam+" sayi= "+sayi);
           
           
           
       }
       while (sayi>0);
       
        System.out.println("Toplam= "+toplam);
        
    }
    
}
