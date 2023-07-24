
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        zamanHesapla("LinkedList", linkedlist);
        zamanHesapla("ArrayList", arraylist);
    }

    public static void zamanHesapla(String veri_tipi, List<Integer> list) {

        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {

            list.add(0, i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi + "ekleme süresi : " + (bitis - baslangic) + " ms ");
        // Ekleme süresi bilgisayardan bilgisayara değişir.
        // Bizim listemiz altta yenibir bölme açıyor üstteki sayıyı bir alta kaydırıyor yeni sayıyı en üste ekliyor bunu sürekli yaptığından performans kaybına ugruyor.
        // linkedlist referanslarla bağıntılı olarak çalıştıgından daha hızlı oluyor sadece ilk iki elemanını kopartıp bağlanıtlarını değiştiriyor.
    }
}
