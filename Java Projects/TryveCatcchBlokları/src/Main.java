
public class Main {
    public static void main(String[] args) {
         /*
        try {
            // Exception Oluşturabilecek Kodlar
        }
        
        catch(Exception_Türü e) {
            // Exception Durumunda Yapılacak İşlemler
        }
        */
         
         // int a = 30/0; // Unchecked Exception
         // Exception in thread "main" java.lang.ArithmeticException: / by zero <--- hata bu ve açıklıyor yan kısmında
         // System.out.println("Burası çalışıyor"); // hatayı yakalamadığımız için burasıda basılmadı
        
        // int[] a={1,2,3,4};
        // System.out.println(a[6]); // Unchecked Exception
         // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6  <-- hata bu
         
        /*
        try {
            int a = 30/0; // AritmeticException fırlatıyordu
             
        } 
        catch(ArithmeticException e){
            System.out.println("Bir sayi 0 a bölünemez!");
        }
        */ 
        /*
        try {
            int a = 30/0; // AritmeticException fırlatıyordu
             
        } 
        catch(Exception e){ // super classımız olduğundan gene çalışır.Exception,aritmeticExceptionın üst sınıfı olduğundan çalışıyor
            System.out.println("Bir sayi 0 a bölünemez!");
        }
        */ 
        /*
        try {
            // int a = 30/0; // AritmeticException fırlatıyordu
            int[] a = {1,2,3,4,5};
             System.out.println(a[6]);
            
        } 
        catch(ArrayIndexOutOfBoundsException e){ // IndexOutOfBoundsException bunuda yazsak gene çalışır alt sınıfı
            System.out.println("Arrayin boyunu aştınız!");
        }
        System.out.println("Burası Çalışıyor..."); */
  // Exception  RuntimeException  IndexOutOfBoundsException  ArrayIndexOutOfBoundsException sırayla birbirini extends ediyorlar
    
  /*
        try {
            // int a = 30/0; 
            int[] a = {1,2,3,4,5};
             System.out.println(a[6]);
            
        } 
        catch(RuntimeException e){
            e.printStackTrace(); // hatanın java tarafındaki mesajını bize söylemiş oluyor
            // java.lang.ArrayIndexOutOfBoundsException: 6
        }
        System.out.println("Burası Çalışıyor...");*/
  
  
         try {
            int b=30/0;
            // int a = 30/0; 
            int[] a = {1,2,3,4,5};
             System.out.println(a[6]);  
        }
         catch(ArithmeticException e){
             System.out.println("Bir sayı 0'a bölünemez !");
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Arrayin boyunu aştınız !");
         }
         catch(Exception e){
             System.out.println("Bir hata oluştu !");
             e.printStackTrace();// eğer bu catch bloğunu en üste koyarsak error vericek bunlar yeniden yakalanmayacak diyecek
             
         }
        System.out.println("Burası Çalışıyor..."); 
        
        // birden fazla hatayı catch bloğuyla özelden genele doğru yazılır
    }
    
}
