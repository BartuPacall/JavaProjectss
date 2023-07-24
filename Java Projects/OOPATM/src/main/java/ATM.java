import java.util.Scanner;
public class ATM {
    public void calis(Hesap hesap){
        Login login =new Login();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("******************************");
        int giris_hakki = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı..!");
                break;
            }
            else{
                System.out.println("Giris başarısız");
                giris_hakki--;
                System.out.println("Kalan giris hakkı : " + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giris hakkınız bitti...");
            

                return; //Metodu o an durdurmak için
            }
        }
        System.out.println("****************************************");
        String islemler = " 1.Bakiye Görüntüle\n " 
                + "2. Para Yatırma" 
                + "3.Para Çekme" 
                + "Çıkış için q ya basınız...";
        System.out.println(islemler);
        System.out.println("*****************************************");
        while (true) {            
            System.out.println("İşlemi seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz :" + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Ne kadar yatırmak istersiniz :");
                int miktar =scanner.nextInt();
                hesap.paraYatır(miktar);
               
            }
            else if(islem.equals("3")){
                System.out.println("Ne kadar para çekmek istersiniz :");
                int miktar=scanner.nextInt();
                hesap.paraÇekme(miktar);
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
                
        
        
        
        
        
    }
    
}
