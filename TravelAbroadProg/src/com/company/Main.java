package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz");
        String sartlar = "Yurt disi cikis kurallari= \n"+
                "15 TL harc ucreti yatirmaniz gerekiyor.\n"+
                "Gideceginiz ulkeye vizenizin olmasi gerekiyor.\n"+
                "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor";
        String message = "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor.";

        while (true){
            System.out.println("*******************************");
            System.out.println(sartlar);
            System.out.println("*******************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor.");
            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor.");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false ){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor.");
            Thread.sleep(3000);
            if (yolcu.vizeDurumuKontrol() == false ){
                System.out.println(message);
                continue;
            }

            System.out.println("Islemleriniz tamam, yurtdisina cikabilirsiniz.");
            break;
        }
    }
}
