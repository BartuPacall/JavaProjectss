
import java.io.Serializable;



public class Ogrenci implements Serializable{
    private static final long serialVersionUID = 2000; // 1000 lik ile yazıp ogrenci classı değiştirirsek uıdyide değiştirmemiz lazım sonradan okuttugumuzda hata alır IO exceotion olmasaydı bu hataayı almış olurduk
//Exception in thread "main" java.io.InvalidClassException: Ogrenci; local class incompatible: stream classdesc serialVersionUID = 1000, local class serialVersionUID = 2000
            
    private String isim;
    private int id;
    private  String bolum;
    private String dersler;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi : " + isim +
                           " \nÖğrenci Numarası : " + id +
                           " Öğrenci Bölümü : " + bolum;
        
        return bilgiler;
    }
    
    
    
}
