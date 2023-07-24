import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {
    public static void main(String[] args) {
        
        // ArrayList<String> arraylist = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        // List objesinin ArrayList sınıfındaki özellikleri de miras almasını istiyoruz kendimiz override etmek durumunda.
        
        // İki tarafta belirtmene gerek yok, Java'nın ilerleyen sürümleriyle beraber artık şu şekilde de yazabiliriz.
        // List<String> list = new ArrayList<>();
        
        // Eleman ekleme
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Kotlin");
        list.add("Ruby");

        // Elemana erişme 
        // System.out.println(list.get(0));
        // System.out.println(list.get(7));
        
        
        // for döngüsü ile döndürme
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
        
        // listeden eleman kaldırma
        list.remove(0);
        list.remove("Python");
        System.out.println("***********************************************");
        
        // for each ile döndürme
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("***********************************************");
        
        
    }
}
