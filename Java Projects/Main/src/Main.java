
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException {
    // Ramazan Pidesi Uygulaması
    // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya çalışacak.
    
    /*
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer");       
    */
    
        System.out.println("... Ramazan Pidesi Uygulaması ...");
        
        Queue<String> pide_kuyrugu = new LinkedList<>();
        Random random = new Random();
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer"); 
        
        int pide_sayisi = 1 + random.nextInt(10);
        
        System.out.println("Pideler Çıkartılıyor : " + pide_sayisi);
        Thread.sleep(3000);
        
        while (pide_sayisi!=0) {

            System.out.println(pide_kuyrugu.poll() + " pideyi aldı");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        System.out.println("... Pide kalmadı ... Hayırlı Ramazanlar ...");
        
        
    }
    
}
