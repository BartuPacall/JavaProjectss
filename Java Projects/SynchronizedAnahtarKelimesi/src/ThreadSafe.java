
public class ThreadSafe {
    private int count = 0 ;
    
    public void threadleriCalistir(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=5000 ; i++){
                    count++;
                }
            }
        });
        
         Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=5000 ; i++){
                    count++;
                }
            }
        });
         
         thread1.start();
         thread2.start();
         
         System.out.println("Count değişkeninin değeri : " + count);
        
        
    }
    public static void main(String[] args) {
        ThreadSafe threadsafe = new ThreadSafe();
       
        threadsafe.threadleriCalistir();
        
        
    }
}
