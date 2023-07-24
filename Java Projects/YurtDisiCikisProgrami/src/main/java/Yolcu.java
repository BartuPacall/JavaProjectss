
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu?");
        
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else{
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizeniz bulunuyor mu ? (evet ya da hayır) ");
        
        String cevap2 = scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu = true ;
        }
        else{
            this.vizeDurumu = false;
        }
        
    }
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if(this.harc < 15 ){
            System.out.println("Lütfen yurtdışına çıkış harcını tam yatırınız...");
            return false;
        }
        else{
            System.out.println("Yurt dışı harç işlemi tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasak() {
        if(this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız var.Yurt dışına gidemezsiniz...");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam!");
            return true;
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkede bulunmamaktadır...");
            return false;
        }
    }
    
}
