import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {

    public static void main (String[] args){

        // Polymorphism kullanilarak Beyblade Programi.......
        System.out.println("Beyblade PROGRAMI");
        System.out.println("Cikis icin Q ya basiniz");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi Beyblade ureteceksiniz ?");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null){
                    System.out.println("Lutfen gecerli bir Beyblade ismi girin");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }




            }

        }

    }
    
}
