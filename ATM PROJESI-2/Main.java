import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ahmet", "123", 2000);
        atm.calis(hesap);
        }
    }









         /*
        Account account1 = new Account("Mustafa", "ssas@gmaill.com", "22323");
        Account account2 = account1;

        Account account3 = new Account();
        if (account1 == account3){
            System.out.println("Ayni obje");
        }
        else{
            System.out.println("Ayni degil");
        }
        */

//  new Account("asdasd", "dfdf", "23232").bilgileriGoster();

        /*
            Account account = new Account();
            System.out.println(account.getEmail());
            Account account1 = new Account("Ahmet C.", "ac@gmail.com", "312 34 56 76");
            System.out.println(account1.getEmail());
            System.out.println(account1.getBakiye());

            account.bilgileriGoster();
            System.out.println("---------------------");
            account1.bilgileriGoster();
        */
        /*
            public static int[] addAge(int[] ages, int age) {
            ages = Arrays.copyOf(ages, ages.length + 1);
            ages[ages.length - 1] = age;
            return ages;
            }
        */


// Video-64 de KALDIM. !!!!