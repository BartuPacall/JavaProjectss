
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("YKS LGS Birinci Bulma Programı... ");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                        + "1.Eşit Ağırlık Öğrencileri Birincisi\n"
                        + "2.Sayısal Öğrencileri Birincisi\n"
                        + "Çıkış için q ya basınız...";
        
        System.out.println("**********************************************");
        System.out.println(islemler);
        System.out.println("**********************************************");
        
        while(true){
                System.out.println("İşlemi Giriniz :");
                String islem = scanner.nextLine();
                 
                 System.out.println("Birinci öğrenci ismi : ");
                 String isim = scanner.nextLine();
                 System.out.println("Dersler ( Türkçe Matematik Edebiyat Fizik ): ");
                 int Türkçe = scanner.nextInt();
                 int Mat = scanner.nextInt();
                 int Edebiyat = scanner.nextInt();
                 int Fizik = scanner.nextInt();
                 scanner.nextLine();
                 
                 System.out.println("İkinci öğrenci ismi : ");
                 String isim1 = scanner.nextLine();
                 System.out.println("Dersler ( Türkçe Matematik Edebiyat Fizik ): ");
                 int Türkçe2 = scanner.nextInt();
                 int Mat2 = scanner.nextInt();
                 int Edebiyat2 = scanner.nextInt();
                 int Fizik2 = scanner.nextInt();
                 scanner.nextLine();
                 
                 System.out.println("Üçüncü öğrenci ismi : ");
                 String isim2 = scanner.nextLine();
                 System.out.println("Dersler ( Türkçe Matematik Edebiyat Fizik ): ");
                 int Türkçe3 = scanner.nextInt();
                 int Mat3 = scanner.nextInt();
                 int Edebiyat3 = scanner.nextInt();
                 int Fizik3 = scanner.nextInt();
                 scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Sistemden çıkılıyor lütfen bekleyiniz...");
                Thread.sleep(2000);
            }
            else if(islem.equals("1")){
                EsitAgirlik ogrenci1 = new EsitAgirlik(Türkçe, Mat, Fizik, Edebiyat, isim);
                EsitAgirlik ogrenci2 = new EsitAgirlik(Türkçe2, Mat2, Fizik2, Edebiyat2, isim1);
                EsitAgirlik ogrenci3 = new EsitAgirlik(Türkçe3, Mat3, Fizik3, Edebiyat3, isim2);
                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Eşit ağırlık birinci öğrencisi : " + birinci.getIsim() + "puanı : " + birinci.puanhesapla());
            }
            else if(islem.equals("2")){
                Sayisal ogrenci4 = new Sayisal(Türkçe, Mat, Fizik, Edebiyat, isim);
                Sayisal ogrenci5 = new Sayisal(Türkçe2, Mat2, Fizik2, Edebiyat2, isim1);
                Sayisal ogrenci6 = new Sayisal(Türkçe3, Mat3, Fizik3, Edebiyat3, isim2);
                Sayisal birinci1 = birinci(ogrenci4, ogrenci5, ogrenci6);
                System.out.println("Eşit ağırlık birinci öğrencisi : " + birinci1.getIsim() + " puanı : " + birinci1.puanhesapla());
            }
            else{
                System.out.println("Lütfen bekleyiniz...");
                Thread.sleep(2000);
                System.out.println("Geçersiz işlem seçildi tekrar deneyiniz...");
                
            }
            
        }

    }
    
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        // puanhesaplada sorun çıkarıyor biz sadece adayı extends edenleri göndermek için böyle yazdık.
        
        if(e1.puanhesapla() > e2.puanhesapla() && e1.puanhesapla() > e3.puanhesapla()){
            return e1;
        }
        else if(e2.puanhesapla() > e1.puanhesapla() && e2.puanhesapla() >e3.puanhesapla()){
            return e2;
        }
        else if(e3.puanhesapla() > e1.puanhesapla() && e3.puanhesapla() > e2.puanhesapla()){
            return e3;
        }
        else{
            return e1;
        }
    
    
}
    
    /*
    public static <E> void yazdir(E[] dizi){
        for( E e : dizi ) {
            
            System.out.println(e);
            
        }
       
    }*/ 
}
