
import java.util.Scanner;


public class Main {
    
    // Geometrik Şekil Hesaplama
    
        public static void main(String[] args) throws InterruptedException {
            
            Scanner scanner = new Scanner(System.in);
            
            String islemler = "İşlemler...\n" 
                    + "1.Karenin Alanını Hesaplamak İçin 1'e\n" 
                    + "2.Üçgenin Alanını Hesaplamak İçin 2'e\n"
                    + "3.Dairenin Alanını Hesaplamak İçin 3'e\n"
                    + "Çıkış : Çıkış için q ya basınız\n";
            
        while(true) {
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istersiniz?");
            String Sekil_tipi = scanner.nextLine();
            Sekil sekil=null;
            
            if(Sekil_tipi.equals("q")){
                System.out.println("3 saniye içinde programdan çıkılıyor...");
                Thread.sleep(3000);
                System.out.println("İşlem başarılı!");
                break;
            }
            else  if(Sekil_tipi.equals("1")) {
                System.out.println("Karenin kenarını giriniz :");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar); // biz burda birnevi polymorphism yapıyoruz
                System.out.println("Alan hesaplanıyor...");
                Thread.sleep(3000);
                sekil.alan_Hesaplama();
                System.out.println("İşlem başarılı!");
            }
            
            else if(Sekil_tipi.equals("2")){
                
                System.out.println("1.kenarı giriniz : ");
                int kenar1 = scanner.nextInt();
                System.out.println("2.kenarı giriniz :");
                int kenar2 = scanner.nextInt();                
                System.out.println("3.kenarı giriniz :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen("Üçgen1", kenar1, kenar2, kenar3);
                System.out.println("Alan Hesaplanıyor...");
                Thread.sleep(3000);
                sekil.alan_Hesaplama(); 
                System.out.println("İşlem başarılı!");
            }
            else if(Sekil_tipi.equals("3")){
                
                System.out.println("Yarıçap Değerini Giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire("Daire1",yaricap);
                System.out.println("Alan Hesaplanıyor...");
                Thread.sleep(3000);
                sekil.alan_Hesaplama();
                System.out.println("İşlem başarılı!");
            }
            else{
                System.out.println("Hatalı işlem girdiniz...");
            }
        }
        
    }
        
        
}
