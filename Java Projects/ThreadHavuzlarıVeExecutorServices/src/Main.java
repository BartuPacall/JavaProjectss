
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        //Thread Havuzu oluşturucaz
        
        ExecutorService executor = Executors.newFixedThreadPool(3); // kaçarlı iş verilecekse o rakam yazılır
        
        for(int i = 1 ; i <=6 ; i++){
            
            executor.submit(new Worker(String.valueOf(i), i));
            
        }
        executor.shutdown(); // başka hiçbir iş kabul etmiyorum diyoruz belli bir iş atamasından sonra kendini kapatıcak.
        // tüm threadlerin işi bittikten sonra bunnu yazmalıyız yoksa çalışmaya devam eder
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
            // max 1 gün bekliyoruz  sonra kapatıyor zamanı ne kadar ayarlarsak o kadar beklicek bitmezse kapanır biterse kapanır
            
             } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Bütün işler bitti...");
            
            /*
            Thread thread1 = new Thread(new Worker("1", 1));
            Thread thread2 = new Thread(new Worker("2", 2));
            Thread thread3 = new Thread(new Worker("3", 3));
            Thread thread4 = new Thread(new Worker("4", 4));
            Thread thread5 = new Thread(new Worker("5", 5));
            Thread thread6 = new Thread(new Worker("6", 6));
            
            System.out.println("Bütün işler teslim edildi...");
            thread1.start();
            thread2.start();
            
            
            try {
            
            thread1.join();
            thread2.join();
            
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            thread3.start();
            thread4.start();
            
            try {
            thread3.join();
            thread4.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            thread5.start();
            thread6.start();
            
            try {
            thread5.join();
            thread6.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Bütün işler tamamlandı...");
            */
       
    }
}
