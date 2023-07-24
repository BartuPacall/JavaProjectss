
import java.util.HashMap;
import java.util.Map;


public class HashMapMain {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(20,"Php");
        hashMap.put(50, "Java");
        hashMap.put(50, "Java"); // 1 key bir defa kullanılıyor
        hashMap.put(50, "Javascript"); // 50'e karşılık gelen değeri silicek yerine bunu yazacak
        System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(20));
        System.out.println(hashMap.get(60)); // 60 a karsılık gelen bir deger olmadıgı icin null degerini veriyor
        
       
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            
            System.out.println("Anahtar : " + entry.getKey() + "\tValue : " + entry.getValue());
            
        }
        
    }   
    
}
