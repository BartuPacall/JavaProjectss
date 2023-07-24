import java.util.Scanner;

public class Main {
    // Basit Matematik ve Fizik Problemler
    // Daire Alan - Matematik 
    // Üçgen Çevresi - Matematik
    // 3 Boyutlu Vektorlerin Çarpımı - Fizik
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");
        
        String islemler = "İşlemler...\n" + 
                  "1.Daire Alanı Hesaplama\n"
                + "2.Üçgen Çevresi Hesaplama\n"
                + "3.İki Vektörün İç Çarpımını Hesaplama\n"
                + "4.Çıkış İçin q Ya Basınız";
        
        
        while(true) {
            System.out.println(islemler);
            System.out.print("İşlem türünü seçiniz(1,2,3 ya da q olarak) : ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("3 saniye içinde sistemden çıkılıyor...");
                Thread.sleep(3000);
                break;
            }
            else if(islem.equals("1")) {
                
                System.out.print("Dairenin yarıçapını giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                System.out.print("İşleminiz yapılıyor lütfen bekleyiniz...");
                Thread.sleep(2000);
                Problem.Matematik.daireAlan(yaricap);
                
            }
            else if(islem.equals("2")) {
                System.out.print("Üçgenin 1.kenarını giriniz : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Üçgenin 2.kenarını giriniz : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Üçgenin 3.kenarını giriniz : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("İşleminiz yapılıyor lütfen bekleyiniz...");
                Thread.sleep(2000);
                Problem.Matematik.UcgenCevresi(kenar1, kenar2, kenar3);    
            }
            else if(islem.equals("3")){ 
                Vec vec1 = new Vec("Vector1");
                Vec vec2 = new Vec("Vector2");
                System.out.println("İşleminiz yapılıyor lütfen bekleyiniz...");
                Thread.sleep(2000);
                Problem.Fizik.ic_Carpim(vec1,vec2);
            }
            else{
                System.out.println("Geçersiz işlem seçtiniz tekrar deneyiniz ...");
            }
            
            
            
        }
    }
    
}
