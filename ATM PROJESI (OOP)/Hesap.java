public class Hesap {

      private String kullanici_adi;
      private String parola ;
      private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye){
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir (int tutar){
        bakiye += tutar;
        System.out.println(("Yeni bakiye: " + bakiye));
    }

    public void paraCek (int tutar){
        if ((bakiye - tutar)< 0){
            System.out.println("Bakiyeniz yetersiz.");
        }else{
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);
        }
    }
}
