
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci[] ogrenci_array = (Ogrenci[]) in.readObject(); 
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>) in.readObject();
            
            
            System.out.println("---------------------------------------------");
            
            for(Ogrenci o : ogrenci_array){
                System.out.println(o);
                System.out.println("******************************************");
            }
            System.out.println("---------------------------------------------");
            for(Ogrenci o : ogrenci_list ){
                System.out.println(o);
                System.out.println("-------------------------------------------");
            }
            System.out.println("*******************************************");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı...");
            
        }
        
    }
}
