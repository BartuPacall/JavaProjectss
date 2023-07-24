
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"+
                "15 TL harç bedelini yatırmanız gerekiyor...\n"+
                "Gideceğiniz ülkeye vizenizin olması gerekiyor...";
        
        System.out.println("*************************************");
        System.out.println(sartlar);
        System.out.println("*************************************");
            
        String Message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor...";
        
        while(true){
            
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.yurtDisiHarciKontrol();
            } 
            catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000); // programı 3 saniye bekletiyoruzzzzz....
            try {
                yolcu.siyasiYasak();
            } 
            catch (SiyasiException ex) {
                    ex.printStackTrace(); 
                    continue; // başa tekrardan döndürür
            }
           
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;
            
        }
        
        
    }
    
}
