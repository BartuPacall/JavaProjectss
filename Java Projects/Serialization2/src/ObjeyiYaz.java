
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Bartu", 1042,"Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Yaren", 1453,"Diyetisyen");
        Ogrenci ogrenci3 = new Ogrenci("Murat", 123123,"Bilgisayar Mühendisliği");
        
        Ogrenci[] ogrenci_Array={ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_Array));
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            
          out.writeObject(ogrenci_Array);
          out.writeObject(ogrenci_list);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOexception oluştu...");
        }
        
    }
    
}
