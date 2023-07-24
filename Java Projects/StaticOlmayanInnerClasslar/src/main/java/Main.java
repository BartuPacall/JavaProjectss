
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        
        1- Static olmayan Inner Classlar 
        2- Static Inner Classlar
        3- Lokal(Yerel) Inner Classlar
        4- Anonymous(Anonim) Inner Classlar
        
        */
        
        Matematik.Factorial factorial = new Matematik().new Factorial(); // Inner classların direk obje oluşturması böyle oluyor
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan.DaireAlan alan = new Matematik().new Alan().new DaireAlan();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        
        if(asal.asal_mi(sayi)) {
            System.out.println("Bu sayı Asaldır.");
        }
        else{
            System.out.println("Bu sayı Asal değildir!");
        }
        factorial.faktorial();
       // alan.daire_alan(5);
       alan.daire_alan(5);
        
    }   
        
    
}
