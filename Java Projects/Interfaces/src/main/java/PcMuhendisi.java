public class PcMuhendisi implements IMuhendis{
    // implements ekleyince hata oluyor alttakini yap
    // sağ tıkla insert code -> Implement Method 
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    @Override
    public void askerlik_sorgula() {
        if(askerlik){
            System.out.println("Askerlik tamamlandı...");
        }
        else{
            System.out.println("Askerlik yapılmadı...");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydı var...");
        }
        else{
            System.out.println("Herhangi bir adli sicil kaydı bulunamadı...");
        }
    }

    @Override
    public void is_tecrübesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerde Çalıştım...");
        
        for( int i = 0 ; i < array.length ;i++ ){
            System.out.println(array[i]);
        }
    }
    
    
}
