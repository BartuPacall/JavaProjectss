
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

// concurrentte bulunan classları threadlerde kullanıyoruz

public class ReentrantLockOrnegi {
    
    private int say =0 ;
    private Lock lock = new ReentrantLock(); // lock interface Reentrantlocta onu implemente eden bir classımız 
    private Condition condition = lock.newCondition(); 
// abstrack oldugu için conditionı private Condition condition = new Condition(); bunun yerine private Condition condition = lock.newCondition(); bunu yazıyoruz.
    
    
    public void artir(){
        for(int i = 0 ; i < 10000 ; i++){
        say++;
        }
    }
    public void thread1Fonksiyonu(){
        lock.lock(); // o anahtarı kitlemiş oluyoruz o anahtar bizde başka threadler giremior 
        System.out.println("Thread 1 Çalışıyor...");
        System.out.println("Thread 1 uyandırılmayı bekliyor....");
        
        try {
            condition.await(); // başka biri bunu uyandırana kadar bekleyecek
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");
        artir();
        
        lock.unlock();
       /* try{
            artir(); // burada bir exception olsa bile finally bloğumuz herzaman çalışacağı için unlocku teslim etmiş oluyoruz
        }
        finally{
        lock.unlock(); // başka bir thread girebilir kullanabilir  
        // herhangibir exception oldugunda bunu kesinlikle yapmalıyız lock.unlocku
        }*/
        
    }   
    
    
    public void thread2Fonksiyonu(){
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread 2 Çalışıyor....");
        
        artir();
        System.out.println("Devam etmek için bir tuşa basınız : ");
        scanner.nextLine(); 
        condition.signal();
        System.out.println("Thread 1 i uyandırdım ben gidiyorumm...");
        lock.unlock();
        
        
        /*try{
        artir();
        }
        finally{
        lock.unlock();
        }*/
    }
    
    public void threadOver(){
        System.out.println("Say değişkeninin değeri : " + say);
    }
    
}
