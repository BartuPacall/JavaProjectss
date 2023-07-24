
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        FileInputStream fis =null;
        
        try {
            
            fis=new FileInputStream("dosya.txt");
            
            int deger ;
            String s = "";
            int say=0;
            fis.skip(5);
            
            while((deger = fis.read()) != -1){
            
                s+=(char)deger;
                say++;
                if(say==11){
                    break;
                }
                
            }
            System.out.println("Dosyada 5. yerden okunan 11 karakter içeriği : " + s);
            
            
            /*
            while((deger = fis.read()) != -1){
                
                s +=(char) deger;
                
                
            }
            System.out.println("Dosya içeriği : " + s );*/
            /*
            System.out.println("Okunan 1.karakter : " + (char)(fis.read())); // birinci karakter
            System.out.println("Okunan 2.karakter : " + (char)(fis.read())); // ikinci karakter
            System.out.println("Okunan 3.karakter : " + (char)(fis.read())); // üçüncü karakter
            */
            
            // fis.skip(5); // 5. karakterden sonra okumaya başlaması için yazıldı
            // System.out.println("Okunan karakter : " + (char)(fis.read())); // P karakteri geldi
            // System.out.println("Okunan karakter : " + (char)(fis.read()));
            
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı ...");
            
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu ...");
        }
        finally {
            try {
                if(fis!= null){ // buradaki if kısmını yazmasaydık nullpointexception alıcaktık
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu ...");
            }
        }
        
    }
}
