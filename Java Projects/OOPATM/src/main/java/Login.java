import java.util.Scanner;
public class Login {
    public boolean login(Hesap hesap){
//2 kez hesap ilki class 2.si obje yazdık hesap objesi göndermiş olduk.Hesap classından bir nesne göndericem
        Scanner scanner = new Scanner(System.in);
        String kullanici_Adı;
        String parola;
        System.out.println("Kullanıcı Adı: ");
        kullanici_Adı = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();
        if(hesap.getKullanici().equals(kullanici_Adı) && hesap.getParola().equals(parola)){
            return true;
        }
        else
        {
        return false;
        }
    }
}
