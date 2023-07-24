
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String harfnotuHesapla(String isim,int vize1 ,int vize2,int finalnot){
        
        String cikti ="";
        double toplam_not = (vize1 * 3 / 10.0) + (vize2 * 3 /10.0) + (finalnot * 4 /10.0);
        
        if(toplam_not >=90){
            cikti = "Bu dersten AA aldınız...";
        }
        else if(toplam_not >=85){
            cikti="Bu dersten BA aldınız...";
        }
        else if(toplam_not >=80){
            cikti="Bu dersten BB aldınız...";
        }
        else if(toplam_not >=70){
            cikti="Bu dersten CB aldınız...";
        }
        else if(toplam_not >=60){
            cikti="Bu dersten CC aldınız...";
        }
        else if(toplam_not >=50){
            cikti="Bu dersten DC aldınız...";
        }
        else if(toplam_not >=35){
            cikti="Bu dersten DD aldınız...";
        }
        else{
            cikti="Bu dersten FF aldınız...";
        }
        return cikti;
    }
    
    public static void main(String[] args) {
        
       try(Scanner scanner = new Scanner (new FileReader("dosya.txt"));
         FileWriter writer = new FileWriter("harfnotları.txt")){
             
             while(scanner.hasNextLine()){
                 String ogrenciBilgileri = scanner.nextLine();
                 
                 String[] ogrenciArray = ogrenciBilgileri.split(",");
                 int vize1=Integer.valueOf(ogrenciArray[1]);
                 int vize2=Integer.valueOf(ogrenciArray[2]);
                 int finalnot=Integer.valueOf(ogrenciArray[3]);
                 
                 
                 String cikti = harfnotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                 writer.write(cikti + "\n");
                 
             }
           
       } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
