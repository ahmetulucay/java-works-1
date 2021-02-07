/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Ders6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Notunuzu girin: ");
        
        int note = scan.nextInt();
        
        if (note > 70){
            
            System.out.println("Dersten gectiniz...");
        
        }
        else{
            
             System.out.println("Dersten kaldiniz...");
       }
    }   
    
    
}
