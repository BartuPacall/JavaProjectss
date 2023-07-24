public class MakineMuhendisi implements IMuhendis , ICalisma{
    // ekstra Interface ide bu kısımda ekledik
    //tekrar instert kod yap 2. interface eklerken unutma

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi Çalışıyor...");
    }
    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
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
        
        if(array.length == 0){
            System.out.println("Herhangi bir iş tecrübesi bulunmuyor...");
        }
        else{
            System.out.println("Makine Mühendisi Olarak Şu Şirketlerde Çalıştım...");
        
        for( int i = 0 ; i < array.length ;i++ ){
            System.out.println(array[i]);
        }
        }
    }
    public void referans_getir(String[] array){
        if( array.length == 0){
            System.out.println("Herhangi bir iş tecrübesi bulunmuyor...");
        }
        else{
            System.out.println("Referanslarım...");
            for( int i = 0 ; i < array.length ;i++ ){
            System.out.println(array[i]);
            }
        }
    }
    
    
}
