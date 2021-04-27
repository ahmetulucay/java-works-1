import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login log = new Login();
        System.out.println("<<< -- ATM BANKA HOSGELDINIZ -- >>>");
        System.out.println("************************");
        if (log.login(hesap)) {
            while (true){
                System.out.println("ATM islemleri=\n" +
                        "1 = Bakiye Goruntuleme\n" +
                        "2 = ParaCekme\n" +
                        "3 = ParaYatirma\n" +
                        "4 = Cikis");

                Scanner scanner = new Scanner(System.in);
                String girisKod = scanner.nextLine();

                if (girisKod.equals("1")) {
                    System.out.println("Bakiyeniz= " + hesap.getBakiye());
                    System.out.println("************************");
                }
                if (girisKod.equals("2")) {
                    System.out.println("Cekilecek tutari giriniz= ");
                    int tutar = Integer.valueOf(scanner.nextLine());
                    hesap.paraCek(tutar);
                    System.out.println("************************");
                }
                if (girisKod.equals("3")) {
                    System.out.println("Yatirilacak tutari giriniz= ");
                    int tutar = Integer.valueOf(scanner.nextLine());
                    hesap.paraYatir(tutar);
                    System.out.println("************************");
                }
                if (girisKod.equals("4")){
                    System.out.println("Programdan cikiliyor...");
                    break;
                }
            }
        }
        else {
            System.out.println("Yanlis Kullanici adi veya Parola girdiniz...");
        }
    }
}
