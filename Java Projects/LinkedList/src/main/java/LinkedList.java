import java.util.ArrayList;


public class LinkedList {

    public static void main(String[] args) {
        
        ArrayList <String> diller= new ArrayList<String>();
        
        diller.add("Java");
        diller.add("Python");
        diller.add("Php");
        diller.add("Kotlin");
        
        for(String s : diller){
            System.out.println(s);
        }
        diller.add(1,"c++");
        //Bellekte daha fazla yer kaplıyor , eğer bellek sıkıntısı varsa linkedlist yerine array list kullanmak daha avantajlı oluyor.
        // Bir objenin hem değerini hem de farklı bir referansını taşıyor.
        
    }
}
