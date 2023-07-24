
import java.util.Scanner;


public class Main {
    public static void mekan_kontrol(int yas) throws InvalidAgeException{
        
        if(yas < 18 ) {
            throw new InvalidAgeException("Invalid Age");
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
        
    }
    
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Yaşınızı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int yas = scanner.nextInt();
        
        mekan_kontrol(yas); // API olarak kullanacak olanlar varsa kendileri eklemeleri gerekiyor.
        
        /*try{ //IOException için
        mekan_kontrol(yas);
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
        }*/
        
        /*try{ // aritmetic exception için
        mekan_kontrol(yas);

        }
      catch(InvalidAgeException e){
           e.printStackTrace(); // Bu bir invalidage hatasıdır... 
          // System.out.println(e); // InvalidAgeException: Invalid Age
      }
        */
        
        // yakalamassak Exception in thread "main" InvalidAgeException: Invalid Age hatasını verior
    }
    
}
