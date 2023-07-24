import java.util.Scanner;
public class Main {
    // kullanmamız gereken bir obje yazmamız lazım bu obje şarkıcılar class ından olcak bu sefer bu objeyi main metoda yazmıcaz çünkü main
    //metoda yazarsak diğer fonksiyonlarımızda biz bu objeye erişemeyeceğiz o yüzden bizim bunu özellik olarak yazmamız gerekiyor.
    // kullanıcıdan bilgi alacağımız içinde scanner ı aktif etmeliyiz.
    private static Sarkici sarkicilar = new Sarkici();
    private static Scanner scanner = new Scanner(System.in);
    
    public static  void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcı Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil ");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle() {
        System.out.println("Eklemek istediğiniz şarkıcının adı : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
    }
    
    public static void sarkici_guncelle() {
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3) : ");
        
        int pozisyon = scanner.nextInt(); // enter ı biz input olarak algılamamasını istiyoruz.
        scanner.nextLine();
        System.out.println("Şarkıcı adı giriniz : ");
        String yeni_isim = scanner.nextLine();
        
        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon - 1);
        
    }
    public static void sarkici_sil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3) :");
        
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void sarkici_Ara() {
        System.out.println("Aramak istenilen şarkıcı :");
        
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_ara(pozisyon);
        
    }
    public static void main(String[] args) {
        
        System.out.println("   Sarkıcı Uygulamamıza Hoşgeldiniz...");
        islemleri_bastir();
        
        boolean cikis=false;
        int islem;
        while(cikis == false){
            System.out.println("Bir işlem seciniz: ");
            
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch (islem) {
                
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sarkici_sil();
                    break;
                case 5:
                    sarkici_Ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
                default:
                    System.out.println("Hatalı işlem numarası...");
                    break;
                  
            }
             
        }

    }
}
