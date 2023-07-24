
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileWriter writer = null; // Finally de writerı kullanamayız eğer null vermeseydik, finallyde try bloğunun içinde close u koyamazdık
        try {
            writer = new FileWriter("dosya.txt",true); // içeriğinin silinmeden yeazılması için true koyduk
            writer.write("Nesne Yönelimli Programlama\n");
            writer.write("Bilgisayar Mühendisliği");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        finally{
            if(writer!=null){
                try {
                   writer.close();
                } catch (Exception e) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
            }
        }
    }
}
