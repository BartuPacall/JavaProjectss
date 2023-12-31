import java.io.File;
import  java.util.Scanner;
public class Main {
        private static Kart[][] kartlar = new Kart[4][4];
        public static void kayittanAl() {
            Scanner scanner = new Scanner(System.in); 
            File file = new File("kayit.bin");
            
            if(file.exists()){
                System.out.println("Kaydedilmiş bir oyununuz var. Kayıttan devam etmek ister misiniz ?");
                String cevap =scanner.nextLine();
                
                if(cevap.equals("yes")){
                    kartlar = OyunKayit.kayittanAl();
                    return; // bunun ile sonlandırmış olduk
                }
            }
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('D');
        kartlar[1][2] = new Kart('H');
        kartlar[1][3] = new Kart('F');
        kartlar[2][0] = new Kart('C');
        kartlar[2][1] = new Kart('D');
        kartlar[2][2] = new Kart('H');
        kartlar[2][3] = new Kart('E');
        kartlar[3][0] = new Kart('G');
        kartlar[3][1] = new Kart('B');
        kartlar[3][2] = new Kart('C');
        kartlar[3][3] = new Kart('A');
        
    }
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        kayittanAl();
        
        //oyunTahtasi();
        while( oyunBittiMi() == false ){
            
            oyunTahtasi();
            System.out.println("Çıkış için q ya basınız(yes or no)");
            String cikis = scanner.nextLine();
             
            if(cikis.equals("yes")){
                System.out.println("Oyunu kaydetmek ister misiniz? (yes or no)");
                String kayit = scanner.nextLine();
                
                if(kayit.equals("yes")){
                    OyunKayit.oyunKaydet(kartlar);
                }
                else{
                    System.out.println("Oyun kaydedilmedi");
                }
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            
            
            
            tahminEt();
        }
    }
    public static void tahminEt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinici Tahmin (i ve j değerlerini bir boşluklu giriniz) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        
        oyunTahtasi();
        
        System.out.print("İkinci Tahmin (i ve j değerlerini bir boşluklu giriniz) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
            if(kartlar[i1][j1].getDeğer() == kartlar[i2][j2].getDeğer()){
                System.out.println("Tebrikler doğru tahmin...");
                kartlar[i2][j2].setTahmin(true);
            }
            else{
                System.out.println("Üzgünüm yanlış tahmin....");
                kartlar[i2][j2].setTahmin(false);
                
            }
    }
    public static boolean oyunBittiMi(){
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                
                if(kartlar[i][j].isTahmin()== false){
                    return false;
                }
               
            }
    }
        return true;
    }
    public static void oyunTahtasi(){
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("___________________");
            for(int j = 0 ; j < 4 ; j++){
                
                if(kartlar[i][j].isTahmin()== true ){
                    System.out.print("|" + (char)kartlar[i][j].getDeğer() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("___________________");
    }
}
