
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    private Object lock = new Object(); // bunu yazarakta diğer this yazan şeylerin blocklanmasını önlüyoruz
    
    public void thread1Fonksiyonu() {
        
        synchronized (lock) {
            
            System.out.println("Thread1 Çalışıyor...");
            
            System.out.println("Thread1 Thread2'nin kendisini uyandırmasını bekliyor...");
            
            
            try {
                // this.wait(); yada
                // lock objesi oluşturduğumuz için artık lock.wait() oldu
                lock.wait(); // bu wait anahtarı teslim etmemiz gerektiğini söylüyor
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread1 uyandı .Devam ediyor...");
        }
        
    }
    
    
    public void thread2Fonksiyonu(){
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        synchronized (lock) {
            
            System.out.println("Thread2 çalışıyor...");
            System.out.println("Devam etmek için bir tuşa basınız ...");
            
            scanner.nextLine();
            
            // this.notify & lock.notify()
            lock.notify(); // eğer uyandırmassak sonsuz şekilde beklemede kalıyoruz
            
            System.out.println("Uyandırdım abi ben gidiyorum.Ama 2 sn bekle ...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
/*
1. Wait() Method
Bir thread icin wait() methodu çağrıldığı zaman, thread beklemeye zorlanır ta ki başka bir thread tarafında notify() yada notifyAll() methodları tetiklene kadar.

2. Notify() Method

Bir thread için notify() methodu çağrıldığı zaman, beklemekte olan thread harekete geçer. Birden fazla Thread için bekleme söz konusu ise hangi Thread in uyanacağı belli değildir. Tamamen implemantasyona bağlı olarak içlerinden bir tanesi alır.*/