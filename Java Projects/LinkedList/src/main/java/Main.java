import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void listeyi_Bastir(LinkedList<String> gidilecek_yerler){
        /*
        for(String s : gidilecek_yerler){
            System.out.println(s);
        }
        */
        // Bazen javada linkedlistin yaptığı gibi işlemler yapmak isteyebiliriz yani kendimiz müdahale edebiliriz ve
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()){
            
            System.out.println(iterator.next()); // bu sefer for each ile değil iterator ile yaptık
        }
    }
    public static void sıralı_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator <String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(yeni);
            // compareto CompareTo () , iki dizgeyi sözlük bilimsel olarak karşılaştırmak için kullanılır. Her iki dizenin her karakteri bir Unicode değerine dönüştürülür. 
            //Bununla birlikte, her iki dizge de eşitse, bu yöntem 0 döndürür, aksi takdirde yalnızca negatif veya pozitif değerle sonuçlanır.

            // iterator ın değeriyle yeninin değeri eşitse karsilastir 0 oluyor
            // iterator ın değeri yeniden küçükse -1 çıkıyor
            // iterator ın değeri yeniden büyükse 0 dan büyük çıkıyor
            
            if(karsilastir == 0){
                System.out.println("Listenizde bu eleman zaten var....");
                
                return;
            }
            else if( karsilastir < 0 ){
                
            }
            else if( karsilastir > 0 ){
                iterator.previous();
                iterator.add(yeni);
                
                return;
            }
            
        }
        iterator.add(yeni); // Bu kısımda karsilastır 0 dan kücük ise sona ekleniyor yani yeni iteratorden  büyükse
    }
    public static void main(String[] args) {
        
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        
        
        sıralı_ekle(gidilecek_yerler, "Posthane");
        sıralı_ekle(gidilecek_yerler, "Hastane");
        sıralı_ekle(gidilecek_yerler, "Ev");
        sıralı_ekle(gidilecek_yerler, "Spor Salonu");
        sıralı_ekle(gidilecek_yerler, "Feshane");
        
        listeyi_Bastir(gidilecek_yerler);
        
        /*gidilecek_yerler.add("Posthane");
        
        gidilecek_yerler.add("Market");
        
        gidilecek_yerler.add("Okul");
        
        gidilecek_yerler.add("Ev");
        
        gidilecek_yerler.add("Spor Salonu");
        
        gidilecek_yerler.add("Kütüphane");
*/        
       // listeyi_Bastir(gidilecek_yerler);
        
       // System.out.println("--------------------------------------------------");
        
        // gidilecek_yerler.add(4,"Alışveriş Merkezi");
        // gidilecek_yerler.remove(3);
        // listeyi_Bastir(gidilecek_yerler);
    }
    
}
