public class Yazılımcı extends Calisan{
    private String diller;

    public Yazılımcı(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi){

        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
        
        
    }
    //insert code -> override code diyoruz sonra seç generate et.
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Yazılımcının Bildiği Diller : " + diller);
        
    }
    
    
    
}
