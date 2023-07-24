import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar programına hosgeldiniz.....");
        
        String islemler="İslemler...\n" +
                "1.Yazilimci İslemleri\n" +
                "2.Yönetici İslemleri\n" +
                "Çıkış icin q ya basiniz...";
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Sistemden çıkılıyor....");
                break;
            }
            else if(islem.equals("1"))
            {
                Yazılımcı yazılımcı = new Yazılımcı("Bartu", "Paçal", 1533, "Python ,Java ,C");
                String yazilimci_islem ="1.Format At\n" + "2.Bilgileri Göster\n" + "Çıkış için q'ya basınız";
                System.out.println(yazilimci_islem);
                
                while (true) {                    
                    System.out.println("İslemi Seciniz : ");    
                    String y_islem =scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazilim işlemlerinden çıkılıyor....");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("İşletim Sistemi : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazılımcı.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        yazılımcı.bilgileriGoster();
                    }
                    else{
                        System.out.println("Gecersiz yazilici islemi.....");
                    }
                }
            }
            else if(islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("Bartu","Paçal",137,13);
                String yonetici_islem ="1.Zam Yap\n" + "2.Bilgileri Göster\n" + "Çıkış için q'ya basınız";
                System.out.println(yonetici_islem);
                while (true) {                    
                    System.out.println("İslemi Seciniz:");
                    String y_islem = scanner.nextLine();
                     if(y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor....");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Zam Miktarı : ");
                        int zam_miktarı = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktarı);
                    }
                    else if(islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Gecersiz yönetici islemi.....");
                    }
                    
                }
            }
            else{
                System.out.println("Geçersiz İşlem Seçtiniz......");
            }
            
        }
    }
}

/*
Calisanlar Programi

Calisan Sınıfı şeklinde bir üst sınıf

Calısanlar sınıfından türeyen yazılımcı adında bir alt sınıf
Calısan sınıfından türeyen yönetici adında bir alt sınıf

*/
