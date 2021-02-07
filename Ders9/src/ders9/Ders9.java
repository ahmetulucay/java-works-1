/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Ders9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        int sayi = scan.nextInt();
        
        if (sayi == 1) {
            System.out.println("Sayi: Bir");
                    
        }
        
        else if (sayi == 2){
            System.out.println("Sayi: Iki");
        
        }
        
        else if (sayi == 3){
            System.out.println("Sayi: Uc");
        
        }

        else if (sayi == 4){
            System.out.println("Sayi: Dort");
       
        }

        else {
            System.out.println("Gecersiz Sayi");
       
        }
    }
    
}