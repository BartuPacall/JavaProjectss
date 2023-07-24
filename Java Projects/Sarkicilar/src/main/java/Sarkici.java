
import java.util.ArrayList;

public class Sarkici {
    private ArrayList<String> sarkici_list = new ArrayList<String>();
    
    public void sarkicilari_bastir(){
        
        System.out.println("Sarkici listenizde " + sarkici_list.size() +  " kadar şarkıcı var.");
        
        for(int i = 0 ; i < sarkici_list.size() ; i++){
            System.out.println((i+1) + ".Şarkıcı :" + sarkici_list.get(i));
        }
        
    }
    public void sarkici_ekle(String isim){
        sarkici_list.add(isim);
        System.out.println("Sarkici listesi güncellendi...");
    }
    public void sarkici_guncelle(String yeni_isim , int pozisyon){
        
        sarkici_list.set(pozisyon, yeni_isim);
        System.out.println("Sarkici listesi güncellendi...");
        
    }
    public void sarkici_sil(int pozisyon){
        String isim = sarkici_list.get(pozisyon);
        sarkici_list.remove(pozisyon);
        System.out.println(isim + " isimli sarkici " + (pozisyon+1) +".sıradan silindi...");
        
    }
    public void sarkici_ara(int pozisyon){
        String isim = sarkici_list.get(pozisyon);
        if(pozisyon>=0){
        sarkici_list.indexOf(pozisyon);
        System.out.println((pozisyon-1) + ".sırada " + isim + "isimli şarkıcı bulunuyor...");
        }
        else{
            System.out.println("Şarkıcı liste dışında bulunamadı...");
            }
        }

    
}
