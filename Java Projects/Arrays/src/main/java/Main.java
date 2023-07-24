
import java.util.Scanner;
import javafx.beans.binding.Bindings;

public class Main {
    public static  void arrayibastir(int[] array){
        for(int i=0 ; i < array.length ; i++){
            System.out.println( i+1 + ".Element : " + array[i] );
        }
        
    }
    public static double ortalamabul(int[] array) {
        int toplam = 0 ;
        for(int i=0 ; i < array.length ; i++){
            toplam += array[i];
        }
        return ((double)toplam / array.length);   
    }
    public static void main(String[] args) {
        
        // int a=5;
        // int[] a = new int[10]; //bellekte 10 tane integer depolanılacak yer açılıyor.
        // 0 1 2 3 4 eleman sırası bu şekilde devam ediyor. 
        /*
        a[5]=32;
        a[9]=50;
        */
        //double[] b; // double array cinsinden referansımız olmuş oluyor.
        
        /*int[] a = {10,30,50,70,90};
        System.out.println(a[2]);
        System.out.println(a[4]);
        System.out.println(a[9]); // hata verilecek bu kısımda*/
        int[] a = new int[5];
       
        /*
        for(int i=0 ; i < 5 ; i++){
            a[i]= i * 4 + 2;
        }
        */
        /*
        Scanner scanner = new Scanner(System.in);
        for(int i=0 ; i < 5 ; i++){
            System.out.println( i + ". elemanı giriniz : ");
            a[i] = scanner.nextInt();
        }
        System.out.println("\n");
        // (ctrl + shift + I) ile kütüphaneyi dahil ediyoruz!
        for(int i=0 ; i < 5 ; i++){
            System.out.println( i+1 + ". eleman = " + a[i]);
        }*/
        
        int[] b = {10,20,30,40,50,60};
        arrayibastir(b);
        System.out.println("B dizimizin uzunluğu : " + b.length); // dizinin boyutunu gösteriyor
        System.out.println("Ortalama : "+ ortalamabul(b));
    }
    
}
