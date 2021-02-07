public class Main {

    public static void main (String[] args){
         // 62.VIDEO !!!!!
            /*
            Account account1 = new Account("Ahmet", "asadsad@gmail.com", "3232323" );
            Account account2 = account1;
            if (account1 == account2) {
                System.out.println("Ayni");
            }else {
                System.out.println("Ayni degil");
            }
            new Account2("Ahmet Can" , "Example@yahoo.com", "3434343").bilgilerigoster();
             */
            ATM atm = new ATM();

            Hesap hesap = new Hesap("Mustafa", "1232322", 2000);
            atm.calis(hesap);
            System.out.println("Programdan cikiliyor.");
     }
}
