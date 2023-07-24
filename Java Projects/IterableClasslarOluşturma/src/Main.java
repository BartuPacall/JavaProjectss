
import java.util.Iterator;


public class Main {
    
    public static void main(String[] args) {
        
        String[] kanallar = {"Radyo Viva","Radyo Fenomen","Radyo Hacettepe","Radyo FM"};
        
        Radyo radyo = new Radyo(kanallar);
        
        /*
        // Iterable olduğu için for each döngüsü direkt ile bastıramıyoruz ! o yüzden radyo.java da iteratorı implemente ettik 
        for(String s : radyo) {
            System.out.println(s);
        }
        */
        
        Iterator<String> iterator = radyo.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            
        }
    }
    
}
