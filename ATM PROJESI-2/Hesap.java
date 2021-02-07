public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
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

    public void paraYatir(int tutar){
        this.bakiye +=tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public void paraCek(int tutar){
        if((bakiye-tutar)<0){
            System.out.println("Yetersiz bakiye");
        }else{
            bakiye -=tutar;
            System.out.println("Yeni bakiyeniz= "+bakiye);
        }
    }
}
