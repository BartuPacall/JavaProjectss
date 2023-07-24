public class Abone {
    //Doğalgaz Abonesi
    public String isim;
    public int bakiye;
    public String sehir;
    
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
