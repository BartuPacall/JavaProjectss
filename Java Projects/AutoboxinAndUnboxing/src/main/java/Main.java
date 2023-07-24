
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         /*
        Wrapper Class
        boolean -----> Boolean
        char    -----> Character
        byte    -----> Byte
        short   -----> Short
        int     -----> Integer
        long    -----> Long
        float   -----> Float
        double  -----> Double
        */
         
         ArrayList<String> arraylist = new ArrayList<String>();
         // int a=5; // ilkel veri olduğundan dolayı a. da herhangibir şey çıkmıyor
         // Integer a=5; // integer ın wrapper class ı şeklinde yazarsak a. da methodları çıkar 
         ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
         
         /*
         for( int i = 0 ; i < 10 ; i++ ){
             arrayList2.add(Integer.valueOf(i*4)); // bu kısım autoboxing oluyor yani biz primitive olan i veri tipini kutuya alıyoruz ve wrapper class cinsinde array'e atıyoruz
         }
         for( int i = 0 ; i < arrayList2.size() ; i++ ){
             System.out.println(arrayList2.get(i).intValue()); //unboxing 
         }
*/
         for( int i = 0 ; i < 10 ; i++ ){
             arrayList2.add(/*Integer.valueOf*/(i*4)); // bu kısım autoboxing oluyor yani biz primitive olan i veri tipini kutuya alıyoruz ve wrapper class cinsinde array'e atıyoruz
         }
         for( int i = 0 ; i < arrayList2.size() ; i++ ){
             System.out.println(arrayList2.get(i)/*.intValue()*/); //unboxing 
             // yorum satırına alınan kısımları java zaten kendi tamamlıyor bundan dolayı gerek kalmıyor yapmamıza
         }
         
         
    }
    
}
