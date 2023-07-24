
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadSafe {
    private int count = 0;
    
    public synchronized void artir(){ 
// bu method ile her seferinde count işlemini yapmış olacağız
// syncronize ettiğimizden dolayı artık 10000 değerini görüyoruz her seferinde         
        
        count ++;
    }
    public void threadleriCalistir(){
        Thread thread1;
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0 ; i < 5000 ;i++){
                    artir();
                }}
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0 ; i < 5000 ;i++){
                    artir();
                }}
        });
        
        thread1.start();
        thread2.start();
        // threadler çalışması senkronize olmadığından her seferinde farklı değer alıyoruz
        // syncronized kullanrak biz bunu çözüyoruz şöyleki ilk hangi thread girerse diğer thread counta dokunamasın diyoruz ve böylece senktronize sorunu çözülmüş oluyor
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Count değişkeniniin değeri : " + count);
    }
    public static void main(String[] args) {
        
        ThreadSafe threadsafe = new ThreadSafe();
        
        threadsafe.threadleriCalistir();
        
        
    }
}
