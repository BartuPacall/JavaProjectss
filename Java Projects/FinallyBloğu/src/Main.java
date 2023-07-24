
public class Main {
    public static void main(String[] args) {
        
        /*try {
            String s =null;
            
            System.out.println(s.hashCode());
        } 
        catch (NullPointerException e) {
            System.out.println("Null referans hatası !");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor");
        }*/
        try {
            //String s ="Mustafa"; 
            // System.out.println(s.hashCode());
            // hata oluşmadı
            
            
            int a = 30/0; // exception yakalamadı ama genede finally bloğu çalıştı
            
        } 
        catch(ArithmeticException e){ // burayı sonradan yazdık ilk finallydeki
            System.out.println("Bir sayı sıfıra bölünemez");
        }
        catch (NullPointerException e) {
            System.out.println("Null referans hatası !");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor");
        }
        System.out.println("Burası çalışıyor"); //ArithmeticException yokken finally çalışacak ama ,burası çalışmıyor
    }
}
