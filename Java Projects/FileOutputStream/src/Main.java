
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        // File file = new File("dosya.txt"); // bunun gibi
        try {
            // fos = new FileOutputStream("dosya.txt"); Dosya oluşturma
            fos = new FileOutputStream("dosya.txt",true); // true yazdık çünkü dosyamız varsa içeriğini silmemiş oluyor sona ekliyor , dosyamız boşsa yazıyor
// açmak istediğimiz dosyanın adını böyle yazarakta yapabiliriz yada üsteki gibi
            // fos.write(65);
            // fos.write(69); 
            byte[] array={101,65,73,84,55}; // byte array deki elemanlarıda karakter olarak yazmmış olduk altta
            fos.write(array);
            
            String s="Mustafa Murat";
            byte[] s_array=s.getBytes(); // stringdeki charakterleri byte arrayıne atamış olduk
            fos.write(s_array); // bir dosyaya bir tane veri yazmak istiyorsak mutlaka byte arrayine dönüştürmek zorundayız ve bizim Streamlerimiz 1 ile 0 dan oluşan byteslardan oluşuyordu
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception oluştu !");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu... ");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapanırken bir hata alındı ! ");
            }
        }
        
        
    }
}
