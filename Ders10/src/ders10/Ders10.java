/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Ders10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Sayiyi giriniz: ");
        
        int sayi = scan.nextInt();
        
        int sayi1 = sayi ;
        
        int faktoriyel = 1;
        
        while (sayi>=1){
        
            faktoriyel = faktoriyel *sayi ;
            
            System.out.println("Faktoriyel= "+faktoriyel+", Sayi= "+ sayi);
            
            sayi --;
        }    
        System.out.println(sayi1+ " sayisinin "+"Faktoriyeli= " + faktoriyel+"'dir.");
     
    }
    
}