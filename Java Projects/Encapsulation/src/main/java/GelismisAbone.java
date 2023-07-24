public class GelismisAbone {
    private String isim;
    private int bakiye =120;
    private String sehir;

    public GelismisAbone(String isim,int bakiye ,String sehir) {
        this.isim = isim;
        this.sehir = sehir;
         
        
        if(bakiye >= 0 && bakiye <=120){
            this.bakiye = bakiye;
        }
        
    }
    public void Dogalgaz_Kullan(int miktar) {
        if((this.bakiye - miktar) < 0){
            System.out.println("Yeterli Bakiye Yok.");
        }
        else{
            this.bakiye-=miktar;
        }
        if(this.bakiye <= 0 ){
            System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın bakiye doldurma merkezine gidiniz." +
                    "Maksimum kredi Limiti = 120 TL ");
            
     
        }
        else{
            System.out.println("Yeni bakiye = " + bakiye);
        }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiye = " + bakiye);
    }
    
    
    
}
