import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************\n" +
                            "<<< IDMAN PROGRAMINA HOSGELDINIZ >>>\n" +
                            "************************************");
        String idmanlar =   ">> Gecerli Idmanlar= \n"
                            +"1.Burpee\n"
                            +"2.Pushup\n"
                            +"3.Situp\n"
                            +"4.Squat\n"
                            +"*********************";

        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun.");
        System.out.print("Burpee Sayisi: ");
        int burpee_sayi = scanner.nextInt();
        System.out.print("Pushup Sayisi: ");
        int pushup_sayi = scanner.nextInt();
        System.out.print("Situp Sayisi: ");
        int situp_sayi = scanner.nextInt();
        System.out.print("Squat Sayisi: ");
        int squat_sayi = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee_sayi, pushup_sayi, situp_sayi,squat_sayi);

        System.out.println("Idmaniniz Basliyor...");

        while (idman.idmanBittiMi() == false){
            System.out.print("Hareket Turu(burpee, pushup, situp, squat): ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
        }

        System.out.println("Idmaniniz Bitti... Tesekkurler...");
    }
}