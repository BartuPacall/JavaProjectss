
public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int fizik, int edebiyat,String isim) {
        super(turkce, matematik, fizik, edebiyat,isim);
    }

    // implements method ile ekledik 
    @Override
    public int puanhesapla() {
        return getTurkce() * 5 + getMatematik() * 5 +getFizik() * 5 + getEdebiyat() * 2;
    }
    
    
}
