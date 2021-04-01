import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ahmet", "123", 2000);
        atm.calis(hesap);
    }
}
