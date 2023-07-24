
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void mekan_kontrol (int yas) throws IOException{ // IOException fırlatır diyip ekliyoruz
        // throws checked exceptionlarda gerekiyor diğerlerinde olsada olur olmasada olur 
        if(yas < 18){
            // throw new ArithmeticException(); //unchecked exception
            throw new IOException(); // checked exception olduğu için üst kısıma throws ile IOExceptionı ekliyoruz
        }
        else{
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    public static void main(String[] args) throws IOException {
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        
        // unchecked exceptionda try-catch kısmını hatırlatmıyor yazılımcının yazması lazım ama checked exceptionda hatırlatıyor yazmamız gerekentiğini söyleyen bir uyarı çıkıor
        /*try {
            mekan_kontrol(yas);
        } catch (IOException ex) {
            System.out.println("IOException oluştu...");
        }*/
        
        mekan_kontrol(yas); // maine throws Exception ekleyip API yi kullanıcak kişiye yakalama işini bırakabiliriz ya da try catch bloğunu biz oluşturabiliriz
        
    }
}