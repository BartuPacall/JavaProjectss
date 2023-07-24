public class Yonetici extends Calisan{ // ünleme bas ve add constructor a bas
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_isi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : " + sorumlu_kisi_sayisi);
    }
    public void zamYap(int zam){
        System.out.println(getAd() + " calisanlara " + zam + " tl zam yapıyor...");
    }
    
}
