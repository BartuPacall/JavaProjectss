import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman programına hoşgeldiniz...");
        String idmanlar = "Geçerli hareketler\n" + 
                            "burpet\n" + "pushup \n" + "situp\n"
                             + "squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        System.out.println("Burpet sayisi : ") ;
        int burpet =scanner.nextInt();
        System.out.println("Pushup sayisi :");
        int pushup =scanner.nextInt();
        System.out.println("Squat sayisi :");
        int squat =scanner.nextInt();
        System.out.println("Situp sayisi :");
        int situp =scanner.nextInt();
        
        scanner.nextLine();
        
        Idman idman = new Idman(pushup,situp,burpet,squat);
        
        System.out.println("Idmanımız başlıyor...");
        
        while(idman.idmanBittimi()== false)
        {
            System.out.println("Hareket Türü(Burpet,Squat,Situp,Pushup)");
            String tür =scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız: ");
            int sayi = scanner.nextInt(); 
/*a = scanner.nextInt(); dedikten sonra siz sout demeden yada scanner.nextLine() kullanmadan yeni bir satıra geçemiyor.Yani sonucu konsoldan input aldığı satırda değil bir alt satırda bastırması için.*/
            scanner.nextLine();
            idman.hareketYap(tür, sayi);
        }
        System.out.println("İdmanın başarıyla sona erdirdin...!");
    }
}
/*
nextLine() metodu input bufferı /n karakterini görene kadar okur.
/n karakterine gelince son olarak bu karakteri de okur ve okunan karakterleri return eder.
nextInt() metodu da aynı şekilde okur fakat tek farkı /n karakterini okumaz. Bufferda bırakır.
Bu yüzden nextInt() uyguladıktan sonra bufferda bir /n karakteri kalır ve nextLine() ile sıradaki satırı okumak istediğinde direk bufferdaki /n karakteri görülür ve okuma yapılmaz.
Örnek:
Buffer: burak/n123/n
İlk nextLine(), burak/n okur.
Buffer: 123/n kalır
sonra nextInt(), 123 okur.
Buffer: /n kalır.
Bufferda karakter olduğu için program input beklemez, buffer okumaya devam eder.
İkinci nextLine() sonda kalan /n karakterini okur.
Son olarak 2. nextInt()'e geldiğinde buffer boş olduğu program için input bekler.
Bu sorunu çözmek için, sayı okunduktan sonra bufferda kalan /n karakterini silmen gerekir. Bunun için de her nextInt() metodundan sonra nextLine() uygulayarak /n karakterini bufferdan okutup silebilirsin.
System.out.println("Şifreniz");
pass = input.nextInt();
input.nextLine(); // Ekle
Veya daha doğru bir çözüm yolu şöyle olur; bütün inputlarını nextLine() ile oku, daha sonra ihtiyacın olan yerlerde integer, veya double neye çevireceksen çevirebilirsin.
Bu arada ikinci bir Scanner objesine (input2) ihtiyacın yok.*/