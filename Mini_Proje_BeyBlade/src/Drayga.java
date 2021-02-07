public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya cikiriyor.");
        System.out.println(getBeybladeci() + " in saldirisi = Kaplan Pencesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar adi= " + kutsalCanavar);
    }
}
