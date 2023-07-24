
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Main {

    public static void main(String[] args) {
        
        // Callable ve Future interfacelerini kullanarak bu threadlerin işini bitirdikten  sonra değer almasını ve döndürmesini sağlayabiliriz. 
    
        ExecutorService executor = Executors.newFixedThreadPool(1);
        // Aynı anda kaç thread çalışabilir onu yazdık içine 
        
        /*executor.submit(new Runnable() {
            @Override
            public void run() {

                Random random = new Random();
                
                System.out.println("Thread çalışıyor ...");
                
                int sure = random.nextInt(1000) + 2000 ;
                
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread çıkıyor...");
                
               
            }
            
        });*/
        
        // future ı türden bağımsız kullanmak için soru işareti kullanabiliriz
        // karşısındaki neyse o da o olacak ıntegersa ınteger stringse string
        Future<?> future = executor.submit(new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                 Random random = new Random();
                
                System.out.println("Thread çalışıyor ...");
                
                int sure = random.nextInt(1000) + 2000 ;
                
              /*  if(sure > 2500) {
                    throw new IOException("Thread çok uzun süre uyudu...");
                }
                */
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread çıkıyor...");
                return sure;
            } 
        });
        executor.shutdown();
        try {
            System.out.println("Dönen değer : " + future.get()); // dönen değeri future.get() ile alıyoruz
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            // ex.printStackTrace();
            System.out.println(ex);
        }
    }
    
}
