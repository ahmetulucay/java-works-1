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
    String sys_kul_adi = "yazilimbilimi";
    String parola = "12345";
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Kullanici Adi: ");    
    String kullanici_adi = scan.nextLine();
    
    System.out.println("Parola: ");    
    String kul_parola = scan.nextLine();
    
    if (!(sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))){
        
        System.out.println("Kullanici Adi ve Parola Yanlis");
              
    }
    
    else if ((sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))){

        System.out.println("Parola Yanlis");

    }
    
    else if (!(sys_kul_adi.equals(kullanici_adi)) && (parola.equals(kul_parola))){
            
        System.out.println("Kullanici Adi Yanlis");

    }
    
    else {
            
        System.out.println("Giris Basarili...");

    }
}