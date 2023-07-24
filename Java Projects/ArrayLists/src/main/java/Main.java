import java.util.ArrayList; //ctrl shift I

public class Main {
    public static void yazdir(ArrayList<String> a){
        
        for ( int i = 0 ; i < a.size() ; i++ ){
            
            System.out.println("Element " +(i+1) + ": " + a.get(i));
            
        }
    }
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList <String>();
        
        arraylist.add("Metallica");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Guns'n Roses");
        arraylist.add("Metallica");

        
        // System.out.println(arraylist.get(3));
        // System.out.println(arraylist.get(2));
        // System.out.println(arraylist.get(0));
        // System.out.println(arraylist.size());
        
        // arraylist.remove(1);
        // arraylist.remove("Metallica");
        
        // System.out.println(arraylist.indexOf("Metallica")); // hem sona hem başa metallica koyarsak gene 0 verir peki sondakini nasıl alıcaz
        // System.out.println(arraylist.lastIndexOf("Metallica")); // sondaki metallicayıda bu şekilde elde etmiş oluruz.
        // System.out.println(arraylist.lastIndexOf("Antallci")); // -1 döndürür
        
        /*for ( int i = 0 ; i < arraylist.size() ; i++ ){
            System.out.println(arraylist.get(i));
        }*/
        
        arraylist.set(4,"Megadeth"); // bununla 4. indexi güncelliyoruz artık megadeth oldu
        
        yazdir(arraylist);
        
    }
    
}
