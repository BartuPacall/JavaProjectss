
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        // buffered reader da bu şekilde kullanılıyor iç içe yazılarak
        /*try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){ // konsoldan okumayacağız dosyamızdan okuyacağımızı belirttik
        while(scanner.hasNextLine()){
            String ogrenci_bilgisi = scanner.nextLine();
            
            String[] array = ogrenci_bilgisi.split(",");
            
            if(array[1].equals("Bilgisayar Mühendisliği")){
                System.out.println("Öğrenci Bİlgisi : " + ogrenci_bilgisi);
            }
            
        }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }*/
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
            writer.write("Ali Ozan ,İnşaat Mühendisliği\n"); // dosyamızın sonuna tekrar yazdırmış olduk
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }
    }
}

// File reader git gel yaparak buffered readera göre daha çok erişim sağlar ve yavaş çalışır 
// Buffered Reader ise tek seferde \n görene kadar 