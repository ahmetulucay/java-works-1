/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9.pkg3;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Ders93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scan = new Scanner(System.in);
     
     int bakiye = 1000;
     int islem;
     
     System.out.println("NETBEANS BANKA HOSGELDINIZ.");
     System.out.println("1: Bakiye Goruntule");
     System.out.println("2: Para Yatirma");
     System.out.println("3: Para Cekme");
     System.out.println("4: Sistemden Cikis");

     islem = scan.nextInt();
     
     switch(islem){
        case 1:
            System.out.println("Bakiyeniz: "+bakiye+ "TL dir.");
            break;

        case 2:
            System.out.println("Ne kadar yatiracaksiniz ?");
            int miktar = scan.nextInt();            
            bakiye = bakiye + miktar;
            System.out.println("Yeni Bakiyeniz: "+bakiye+ "TL dir.");
            break;

        case 3:
            System.out.println("Ne kadar para cekeceksiniz ?");
            miktar = scan.nextInt();
            bakiye = bakiye - miktar;
            System.out.println("Yeni Bakiyeniz: "+bakiye+ "TL dir.");
            break;
            
        case 4:
            System.out.println("Sistemden cikiliyor. Iyi gunler.");
            break;
            
        default:
            System.out.println("GECERSIZ ISLEM");
            break;
        }     
       
    }
    
}