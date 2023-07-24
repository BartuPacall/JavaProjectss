
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
          
            
           
           Ogrenci ogrenci = (Ogrenci)in.readObject();
           
            System.out.println(ogrenci);
            System.out.println("Öğrenci Sayısı: " + Ogrenci.getOgrenci_sayisi());
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        }  
        catch (IOException ex) {
            System.out.println("IOException Oluştu...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
/*
Java'da Serialization, bir nesnenin verilerini bir dosyaya veya ağa göndermek gibi bir işlem yapılabilmesi için kodlama ve kod çözme işlemlerini yapar. Serileştirme işlemi, nesnenin tüm durumunu, yani tüm sınıf değişkenlerini veya özelliklerini kaydeder.

Java'da, serileştirme sırasında nesnenin sadece non-static, non-transient (geçici olmayan) değişkenleri kaydedilir. Static değişkenler, sınıfın durumunu temsil ettiğinden, nesnenin durumunu temsil etmezler. Bunun yerine, sınıfın kendisi tarafından tutulurlar.

Transient değişkenler ise, serileştirme işleminden önce değeri alınan ancak serileştirme sırasında kaydedilmeyen değişkenlerdir. Bu tür değişkenler, bir nesnenin belirli bir durumunu temsil etmediğinden ve bu nedenle serileştirme sırasında kaydedilmesine gerek yoktur.

Bu nedenlerden dolayı, static değişkenler ve transient değişkenler, serileştirme işlemi sırasında kaydedilmezler. Ancak, static ve transient değişkenlerin serileştirme işlemine dahil edilmesi gereken özel durumlar da olabilir. Bu durumda, değişkenlerin serileştirilebilir hale getirilmesi için özel kodlama işlemleri yapılması gerekebilir.
*/