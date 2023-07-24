
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        ArrayList<String> list = new ArrayList<String>();
        
        // synchronized anahtar kelimesi vectorlerde farlı threadlerimiz bir arraylistte uğraşıyorsa ve üzerinde uğraştıgı method synchronized değilse karışıklığa sebep olabiliyor,synchronized kullanırsak 1 thread 1 methodu çalıştırıcak o methoda başka hiçbir thread giremeyecek.
        
        vector.add("Java");
        vector.add("C++");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        
        /*for(String s : vector ){
            
            System.out.println(s);
        }*/
        
       /* ListIterator<String> iterator = vector.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator);
        }*/
        
        /*Enumeration<String> enumaration = vector.elements();
        
        while(enumaration.hasMoreElements()){
            System.out.println(enumaration);
        }*/
        
        // System.out.println("İlk eleman :" + vector.firstElement());
        // System.out.println("Son eleman : " + vector.lastElement());
        
        Stack<String> stack = new Stack<String>();
       
        System.out.println(stack.empty());// stack boş olduğu için true

         
        stack.add("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        
        /*for(String s : stack){
            
            System.out.println(s);
        }*/
        
        // System.out.println(stack.peek()); // son giren elemanı alır , son elemanı çıkartmıyor
        /*Enumeration<String> enumeration = stack.elements();
        
        while(enumeration.hasMoreElements()){
            
            System.out.println(enumeration.nextElement());
        }*/
        
        /*
        System.out.println("Son eleman çıkartılıyor : "+ stack.pop()); // son elemanı alır ve son elemanı çıkartır
        for(String s : stack){
            
            System.out.println(s);
        }
        System.out.println(stack.empty());// stack boş olmadığı için false
    */
        while(!stack.empty()){
            System.out.println("Eleman çıkarılıyor : " + stack.pop());
        }
        System.out.println(stack.pop()); // hata verdi senin stack in boş diye EmptyStackException
    
    }
    
    
    
}
