
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        /*try(FileWriter writer1 = new FileWriter("dosya.txt");FileWriter writer2 = new FileWriter("dosya2.txt")){
            writer1.write("Deneme");
            writer2.write();
            
        }*/
        try(FileWriter writer1 = new FileWriter("diller.txt")){
            Scanner scanner = new Scanner(System.in);
            
            while(true){
                System.out.println("Bir dil giriniz : ");
                String dil =scanner.nextLine();
                
                
                if(dil.equals("-1")){
                    System.out.println("Programdan çıkılıyor...");
                    System.out.println("Dosyayı kontrol ediniz...");
                    break;
                }
                writer1.write(dil + "\n"); // if in altına yazdık çünkü -1 bastırmamak lazım
            }
            
        }
        catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata oluştu...");     
        }
    }
    
}
