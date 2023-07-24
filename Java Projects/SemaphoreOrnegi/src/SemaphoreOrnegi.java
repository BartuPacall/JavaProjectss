
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreOrnegi {
    
    private Semaphore semaphore = new Semaphore(3); 
// 3 yazdığımız yer aynı anda kaç thread girebiliyor izin veriliyor anlamına geliyor
    
    public void threadFonksiyonu(int id){
        
        try {
            semaphore.acquire(); // bu değer sıfırsa alta geçemicez 0 değilse buraya giriyor değiken değeri 1 azalıcak
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread Başlıyor.... ID : " + id);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread çıkıyor.... ID : " + id);
        
        semaphore.release(); // bizim semaphoreumuzun değeri 0 sa bunun değerini 1 artırıyor...
    }
    
}
