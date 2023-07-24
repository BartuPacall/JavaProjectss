
public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int fizik, int edebiyat,String isim) {
        super(turkce, matematik, fizik, edebiyat,isim);
    }

    @Override
    public int puanhesapla() {
        
        return getTurkce() * 5 + getMatematik() * 5 +getFizik() * 2 + getEdebiyat() * 5;
    }
    
    
}
