
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapMain {
    public static void mapYazdir(Map<Integer , String> map){
        
        map.put(10, "C++");
        map.put(32, "Java");
        map.put(67, "Js");
        map.put(41, "Python");
        map.put(54, "Go");
        
        /*for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue() );
        }*/
        
        // Yazdırma işlemi üsteki gibi ama söylede yapilabilir
        
        // System.out.println(map.keySet());
        
        /*
        for(Integer key : map.keySet()){
            System.out.println("Key : " + key + "\tValue : " + map.get(key));
        }
        */
        
        Collection<String> values = map.values();
        
        for(String s : values){
            System.out.println( "Değer : " + s );
        }
        
    }
    public static void main(String[] args) {
        
        Map<Integer,String> hashmap = new HashMap<Integer,String>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treemap = new TreeMap<Integer,String>();
        
        System.out.println("******************* HashMap **********************");
        
        mapYazdir(hashmap);
        
        System.out.println("********************* LinkedHashMap ************************");
        
        mapYazdir(linkedhashmap);
        
        System.out.println("******************  TreeMap  *******************************");
        
        mapYazdir(treemap);
        
        System.out.println("************************************************************");
    }
    
}
