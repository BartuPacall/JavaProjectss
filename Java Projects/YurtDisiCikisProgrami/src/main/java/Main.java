
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"+
                "15 TL harç bedelini yatırmanız gerekiyor...\n"+
                "Gideceğiniz ülkeye vizenizin olması gerekiyor...";
        
        System.out.println("*************************************");
        System.out.println(sartlar);
        System.out.println("*************************************");
            
        String Message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor...";
        
        while(true){
            
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            // burayı aynı işlemlerdeki gibi 3 sn bekletmek için aşşadaki fonk. kullan
            Thread.sleep(3000); // main . javamız 3 sn bekliyecek hata veriyor yanda bas üstüne add yap
            
            if( yolcu.yurtDisiHarciKontrol() == false ) {
                System.out.println(Message);
                continue; // döngünün başına gitmeyi sağlıyor ...
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000); // programı 3 saniye bekletiyoruzzzzz....
            
            if (yolcu.siyasiYasak() == false){
                System.out.println(Message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.vizeDurumuKontrol() == false) {
                System.out.println(Message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;
            
        }
        
        
    }
    
}
