import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanici adi= ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Parola= ");
        parola = scanner.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            return true;
        }else{
            //System.out.println("Yanlis Kullanici Adi veya Parola girdiniz.");
            return false;
        }

    }
}
