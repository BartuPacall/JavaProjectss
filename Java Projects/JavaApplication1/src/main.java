/*public class main{
       public static void main(String[] args) {
           System.out.print("Hello World.");
           System.out.println("This is my java world");
    }
} */
/*
print yazarak yanyana println ile alt alta yazılır.
public class main -> main yazan yer dosya adıyla aynı olmak zorundadır.
sout ile hızlı şekilde system.out.println yazabiliriz.
bir java dosyasının içinde birden fazla public class bulunamaz.
*/
/*
//Int
// Main class
public class main{
// Main driver method
    public static void main(String[] args) {
        int a=6;
        int b=12;
        int c=8;
        int toplam=a*b*c;
        // Print statement
        System.out.println("Toplam = "+ toplam);
    }
}
//Değişkenlerin isminin başına rakam konulmaz örn 1murat
//Hem türkçe hem ingilizce karakter kullanılabilir ama türkçe kullanmamaya özen göster
//"Yazılacak metin =" + işlem -> yazılacak metin = işlem
*/
/*
//Int byte short long
public class main{
    public static void main(String[] args){
        int a=4;
        //int veri tipi = en fazla -> 2 ^ 31 -1 & en düşük -> -2 ^ 31
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long b;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        short c;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        byte d;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        // Byte --> Short --> İnt --> Long
        byte i=100;
        byte k=(byte)(i / 2);
        System.out.println(k);
        
        byte z=100;
        short l = 600;
        int y = 200;
        long q = l + z + y;
        System.out.println(q);
    }
}*/
/*
//Float ve double
public class main{
    public static void main(String[] args){
        //otomatik dönüştürme:int -> float -> double
        //Double 64 bit -> 8 byte 
        //Float 32 bit -> 4 byte
        /*double a=5.25;
        double b=4.0;
        double c=4d;
        double d=4.23d;
        System.out.println(d);
        float f=(float)5.0;
        System.out.println(f);
        float g= 5f;
        System.out.println(g);
        float z=5.25f;
        System.out.println(z);
        int a = 22 / 7;
        float b = 22f / 7f ;
        double c = 22d/ 7d;
        System.out.println("Int a:" + a);
        System.out.println("Float b:" + b);
        System.out.println("Double c:" + c);
        double k=3.2124;
        float j=(float)k;
        System.out.println(j);
        double sayi1=5.34;
        double sayi2=6.12;
        double sayi3=3.15;
        System.out.println("Ortalama Double:" + (sayi1+sayi2+sayi3)/3 );
    }
}*/
/*
//char ve boolean
public class main{
    public static void main(String[] args){
        char a='S';
        char b='?';
        char c=2000;
        System.out.println(c);
        //unicode table ile karakterlerin numarasını bulabiliriz,örn arapça yazı yazmak için... 
        char d='\u0139';
        System.out.println(d);
        boolean ba=true;
        boolean ab=false;
        System.out.println(ab);
        System.out.println(ba);
    }
}*/

/*
//String veri tipi
public class main{
    public static void main(String[] args){
        String a="Merhaba ";
        System.out.println(a + "Hoşgeldiniz...");
        String b="I'm ";
        String c="Yagami ";
        String d="KİRA";
        
        String toplam= b + c + d;
        System.out.println(toplam);
        String q ="Light";
        char s ='?';
        int k = 9;
        
        String toplam1 = q + s + k;
        System.out.println(toplam1);
        // \t bir tab bboşluk bırakır \n yeni satıra geçer
        String y="Programlamaya\tGiriş\nDersi";
        System.out.println(y);
    }
}*/
/*
//operatörler
public class main{
    public static void main(String[] args){
        //+ -> toplama operatörü
        // - -> çıkarma operatörü
        // / -> bölme operatörü
        // % -> bölümünden kalan
        // * -> çarpma operatörü
            
        int a=1;
        a+=2; //a=a + 2;
        a*=4;// a = a * 4;
        int b=2;
        b-=1;
        b--;
        ++a;
        a++;
        System.out.println(++a);//bunda ise sayı 1 arttırılıp yazılır.
        System.out.println("int A:" + a + " int B:" + b);
        System.out.println(a++);// bunda sayı aynen kalır.
        System.out.println( (3f / 4) + (2 * 65));
        
    }
}*/

/*

public class main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);//scanf yerine bu değişkenle işlem yapıyoruz
        
        //System.out.println("Lütfen yasınızı giriniz:");
        //int yas= scanner.nextInt();
        //System.out.println("Lütfen metin giriniz:");
        //String metin=scanner.nextLine();
        //System.out.println("Girdiginiz metin: " + metin);
        System.out.println("Lütfen yasınızı giriniz:");
        if(scanner.hasNextInt()){
            int yas= scanner.nextInt();
            System.out.println("Girdiginiz yasiniz : " + yas);
            
        }
        else{
            System.out.println("Lutfen bir sayi giriniz...!");
        }
    }
}*/

/*
//Scanner sorunu
public class main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //eğer ilk önce stringi sonra yaşı vermiş olsaydık hata almadan diğer inputu alabilirdik örn:
        //String isim= scanner.nextLine();int yas = scanner.nextInt();
        int yas = scanner.nextInt();
        scanner.nextLine();//yeni bir input belirtiyoruz.Bu kısma dummy diyoruz.Salakça input alma deniliyor.bunu ekledik.
        String isim= scanner.nextLine();// bu inputu almadan diğer diğer program sona erdi
        
        System.out.println("yas: " + yas);
        System.out.println("Isim: " + isim);
        
    }
}
*/
/*
public class main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter yas1:");
        int yas1=scanner.nextInt();
        System.out.println("Enter yas2:");
        int yas2=scanner.nextInt();
        System.out.println("Enter yas3:");
        int yas3=scanner.nextInt();
        
        System.out.println("Yas1:" + yas1 + " Yas2:" + yas2 + " yas3:" + yas3 );
        
    }
}*/
/*
public class main{
    public static void main(String[] args){
        //Kullanıcıdan aldığınız kilo ve boy değerine göre vücut kitle endeksi hesaplayınız.
        // Beden Endeksi = Kilo / Boy * Boy
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your kilos:");// örn 78 kg //son kısmında ln i kaldırırsak yeni satıra geçmez yanında girilir değer
        int kilos = scanner.nextInt();
        System.out.print("Enter your lenght:"); //örn 1,75 m
        double lenght=scanner.nextDouble();
        
        double BKI=kilos/(lenght * lenght);
        
        System.out.println("Your BKI : " + BKI);
        
        
    }
}*/

/*public class main{
    public static void main(String[] args){
        //Bir aracın ne kadar yaktığı ve kaç km yol yaptığı bilgisini alın ve sürücünün toplam ne kadar ödemesi gerekli olduğunu bulunuz.
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter how much gasoline does your vehicle use?");
        double gasoline=scanner.nextDouble();
        System.out.println("Enter how many kilometers per hour does your vehicle travel?");
        double km=scanner.nextDouble();
        double total=km * gasoline * 5.78;
        System.out.println("Your cost : " + total + " $ (dollars)");
        
     // double float gibi tiplerded . yerine inputu , ile girmemiz gerekir yoksa hata alırız.   
    }
}*/

/*public class main{
    public static void main(String[] args){
        //iki sayının değerlerini değiştiriniz
        int num1;
        int num2;
        int temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1:");
        num1=scanner.nextInt();
        System.out.println("Enter num2:");
        num2 = scanner.nextInt();
        System.out.println("Before being replaced:");
        System.out.println("Num1:" + num1 + " Number2:" + num2 );
        
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("\nAfter being replaced:");
        System.out.println("Number1:" + num1 + " Number2:" + num2);
        
    }
}*/
/*
//Pythagoras
//a^2 + b^2 =c^2

public class main{
    public static void main(String[] args){
        int a,b;
        double c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        a=scanner.nextInt();
        System.out.println("Enter b:");
        b=scanner.nextInt();
        
        c=Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse: " + c);
    }
}*/
/*
public class main{
    public static void main(String[] args) {
        //== eşit mi
        // != eşit değil mi
        // > büyük mü
        // >= büyük eşit mi
        // < küçük mü
        // <=küçük eşit mi
        
        System.out.println(3==4);
        System.out.println(3!=4);
        System.out.println(2>1);
        System.out.println(2>=3);
        System.out.println(1<2);
        System.out.println(1<=2);
        System.out.println("mehmet"=="mehmet");
    }
}
*/
/*Mantıksal operatörler
&& --->(AND operator):Sonuçlaar içinde true ise genel sonuç true,en az biri false ise genel sonuç false  
|| --->(OR operator): En az biri true ise genel sonuç true,hepsi false ise genel sonuç false
! --->(NOT operator): Değili
*/
/*
public class main{
    public static void main(String[] args){
        System.out.println(3==3);
        System.out.println(3<2);
        System.out.println(3==3 && 4==4);
        System.out.println(3<4 && 3>5);
        System.out.println("murat"!="Murat" && (1>2) || !(3==2) );
    }
}
*/
// If- Else
/*
public class main{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age:");
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
        if(age>18)
        {
            System.out.println("you are of legal age");
        }
        else {
            System.out.println("you are underage");
        }
        
    }
}
*/
//If-Else-Elseif
/*
public class main{
    public static void main(String[] args){
        int point;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter point:");
        point=scanner.nextInt();
        if(point<=0)
        {
            System.out.println("10 TL");
        }
        else if(30 > point && point > 0 ){
            System.out.println("20 TL"); }
        else if(60 > point && point >30){
            System.out.println("30 TL");
        }
        else{
            System.out.println("100 TL");
        }
    }
}
*/
//Alt alta if olursa hepsine sırayla bakar ayrı ayrı çalışıp çalışmadığı kontrol edilir ama elseiflerde içindeki koşul dogruysa çalışır alta geçilmez yani yukardaki koşul sağlanırsa alta bakılmıyor...
/*
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Operation 1:");
                break;
            case 2:
                System.out.println("Operation 2:");
                break;
            case 3:
                System.out.println("Operation 3:");
                break;
            case 4:
                System.out.println("Operation 4:");
                break;
            default:
                System.out.println("None");
                break;
                
        }
        
    }
}
*/
/*https://www.geeksforgeeks.org/difference-between-system-out-println-and-system-err-println-in-java/ 
//System.out.println("Num3:"+ num3 +" max number"); -arasındaki fark- System.err.println("Num3:"+ num3 +" max number");
public class main{
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1:");
        num1=scanner.nextInt();
        System.out.println("Enter num2:");
        num2=scanner.nextInt();
        System.out.println("Enter num3:");
        num3=scanner.nextInt();
        
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Num1:"+ num1 +" max number");
        }
        if(num2 > num3 && num2 > num1)
        {
            System.out.println("Num2:"+ num2 +" max number");
        }
        if(num3 > num2 && num3 > num1)
        {
            
            System.out.println("Num3:"+ num3 +" max number");
        }
    }
}
*/

/*
//Eğer 18.5 altındaysa zayıf 18.5 ile 25 arasındaysa hafif kilolu 25-30 arası şişman 30 üstü obez bki sisitemi
public class main{ 
    public static void main(String[] args) {
        int weight;
        double lenght,BKI;
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter weight:");
        weight=scanner.nextInt();
        
        System.out.println("Enter lenght:");
        lenght=scanner.nextDouble();
        
        BKI = weight/(lenght*lenght);
        
        if(BKI <=18.5 )
        {
            System.out.println("Thin");
        }
        if(BKI <=25 && BKI>18.5){
            System.out.println("Light weight");
        }
        if(BKI>25 && 30>=BKI)
        {
            System.out.println("Fat");
        }
        if(30<BKI){
            System.out.println("Obese");
        }
    }
}*/

//Switch case kullanarak 4 işlem yapan hesap makinesi
/*
public class main{
    public static void main(String[] args) {
        String op;
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one operation(+ - / *):");
        op = scanner.nextLine();
        System.out.println("Enter num1:");
        num1 = scanner.nextInt();
        System.out.println("Enter num2:");
        num2 = scanner.nextInt();
        switch(op){
            case "+":
                System.out.println(num1+num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("NONE");
                break;
        }
        
    }
}*/
/*
public class main{
    public static void main(String[] args) {
        int num1,num2,op;
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiply\n4.Division");
        op = scanner.nextInt();
        System.out.println("Enter num1:");
        num1 = scanner.nextInt();
        System.out.println("Enter num2:");
        num2 = scanner.nextInt();
        switch(op){
            case 1:
                System.out.println("Operation result: " + (num1+num2));
                break;
            case 2:
                System.out.println("Operation result: " + (num1-num2));
                break;
            case 3:
                System.out.println("Operation result: " + (num1*num2));
                break;
            case 4:
                System.out.println("Operation result: " + (num1/num2));
                break;
            default:
                System.out.println("NONE");
                break;
        }
        
    }
}
*/
/*
//harf notu ve ortalama
public class main{
    public static void main(String[] args) {
        int vize1,vize2,final1;
        double ders,gano;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter vize1:");
        vize1=scanner.nextInt();
        System.out.println("Enter vize2:");
        vize2=scanner.nextInt();
        System.out.println("Enter final1:");
        final1=scanner.nextInt();
        System.out.println("Enter gano:");
        gano=scanner.nextDouble();
        
        ders=((vize1*30)/100) + ((vize1*30)/100) + ((final1*40)/100);
        
        if(ders >0 && ders<50 && final1<50)
        {
            System.out.println("FF");
        }
        if(ders>45 && ders<50 && final1<50)
        {
            System.out.println("DD-Sartlı Gecis Hakkı");
        }
        if(ders >=50 && ders<60 && final1>50)
        {
            System.out.println("CC");
        }
        if(ders >60 && ders<70 && final1<50)
        {
            System.out.println("CB");
        }
        if(ders >70 && ders<80 && final1<50)
        {
            System.out.println("BB");
        }
        if(ders >80 && ders<90 && final1<50)
        {
            System.out.println("BA");
        }
        if(ders >90 && ders<100 && final1<50)
        {
            System.out.println("AA");
        }
        if(gano>3.00)
        {
            System.out.println("You are little cow...");
        }
        if(gano<3.00)
        {
            System.out.println("İf you want you can study hard...");
        }
        
    }
}*/
/*
//for(baslatma(inizilation statements);kosul;arttırma-azaltma islemleri){  döngü kosulumuz dogru oldugu surece calısacak }
public class main{
    public static void main(String[] args) {
        int i,j;
        for(i=0 ; i<5 ; i++){
            System.out.println(i);
        }
    }
}
*/
/*class main{
    public static void main(String[] args){
    for(int i=10;i>=0;i--){
        System.out.println("i= " + i);
    }
}
}*/
/*class main{
    public static void main(String[] args){
    int i=0;
    for(;i<7;i++){
        System.out.println("I will learn the Java...");
    }
}
}*/
/*class main{
    public static void main(String[] args){
    int i=0;
    int j=10;
    for(;i<=10 && j>0; j--,i++){
        System.out.println("\ni= " + i + "\tj= " + j);
    }
}
}*/
/*class main{
    public static void main(String[] args){
        int num1,i,a=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the factorial:");
        num1=scanner.nextInt();
        for(i=1;i<=num1;i++){
            a*=i;
            System.out.println(i + "! = " + a);
            
        }
        System.out.println(num1 + "! = " + a);
    }
}*/
//  While for döngüsü farkı
/*class main{
    public static void main(String[] args){
        int i =10;
        while(i<100){
            System.out.println("i= " + i);
            i+=3;
        }
    }
}*/
/*import java.util.Scanner; //Scannerı import ettik
class main{
    public static void main(String[] args){
        int num,faktoriyel=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one number:");
        num=scanner.nextInt();
        while(num>0)
        {
            faktoriyel*= num;
            num--;
            
            
        }
        System.out.println("Enter the number for which you want to find the factorial:");
        num=scanner.nextInt();
        System.out.println(num +"! =" + faktoriyel);
    }
}*/
/*import java.util.Scanner;
class main{
    //girilen sayının rakamları toplamı
    public static void main(String[] args) {
        int num,total=0;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        do{
           total+=num%10;
           num/=10;
           
        }while(num>0);
        System.out.println("sum of digits of the number:" + total);
    }
}*/
/*class main{
    public static void main(String[] args){
        for(int i = 0 ; i < 10 ; i++){
            if( i == 3 || i == 5){  //bu kısımda 3 ile 5 i atlıyor ve devam ediyor.
                continue;
            }
            System.out.println("i= " + i);
        }
    }
}*/

/*
public class main{
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            
            if( i == 3 || i ==5 ){
                i++;// buraya i ++ ekledik çünkü 3 e kadar getirip 5 ten sonrasını yazdırmıyor yazdırabilmesi için buraya i++ ekledik.
                continue;
            }
            System.out.println("i= " + i);
            i++;
            
        }
    }
}*/

/*While döngüsü yardımıyla bir tane ATM yapmaya çalışıcaz.

İslemler
1.işlem:bakiye öğrenme
2.işlem:para çekme 
3.işlem:para yatırma
çıkış:q
*/
/*
import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String welcome="Bir işlem seçiniz:\n1.:Para Yatırma\n2.Para Çekme\n3.Para Öğrenme\n4.Quit";
        System.out.println(welcome);
        int bakiye=1250;
        System.out.println("Lütfen işlem numarası giriniz:");
        int işlem=scanner.nextInt();
        
        
        while(işlem>0 && işlem<5){
            switch (işlem){
            
            case 1:
                System.out.println("Lütfen para miktarı giriniz:");
                int eklenecekmiktar=scanner.nextInt();
                bakiye=bakiye+eklenecekmiktar;
                 if(bakiye<0){
                    System.out.println("Yetersiz bakiye...");
                             }
                 else{
                System.out.print("Güncel bakiyeniz:" + bakiye);
                 }
            break;
            case 2:
                System.out.println("Lütfen para miktarı giriniz:");
                int alınacaktutar=scanner.nextInt();
                bakiye=bakiye-alınacaktutar;
                if(bakiye<0){
                    System.out.println("Yetersiz bakiye...");
                             }
                 else{
                System.out.print("Güncel bakiyeniz:" + bakiye);
                 }
            break;
            case 3:
                System.out.print("Güncel bakiyeniz:" + bakiye);
            break;
            case 4:
                System.out.print("Sistemden çıkılıyor...");
                break;
            default:
                System.out.println("Hatalı işlem girdiniz..");
                break;
        }
        break;
        }
        }
    }
*/

/*Girilen bir sayının armstrong sayı olup olmadığını bulan kod dizisi yaz.
örneğin girilen 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekir.
1634= 1^4 + 6^4 + 3^4 + 4^4(4 basamak sayısı)
371 = 3^3 + 7^3 + 1^3(3 basamak sayısı)

do while döngüsü yardımıyla yapabiliriz


*/
/*
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        System.out.println("Enter the number of digits:");
        int digits=scanner.nextInt();
        int temp=num,total=0;
        do {         
            int digitvalue=temp%10;
            temp/=10;
            total+=Math.pow(digitvalue,digits);
        } while (temp>0);
        if(num==total){
            System.out.println("This number is Armstrong number...");
        }
        else{
            System.out.println("This number is not Armstrong number...");
        }
    }
}*/
/*
//iç içe for döngüsüyle çarpım tablosu

public class main{
    public static void main(String[] args) {
        int i,j;
        for(i = 0 ; i <= 10; i++ ){
            for(j = 0 ; j <= 10 ; j++){
                System.out.println(i + " x " + j + " = " + ( i * j ) );
            }
            System.out.println("*********************************************");
        }
    }
}*/
/*
public class main {
    public static void main(String[] args) {
        int rows = 10;
 
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
*/
/*
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki=4;
        String sys_kullaniciadi="Bartu Pacal";
        String sys_parola="12345";
        
        System.out.println("*********************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("*********************************");
        
        while(true) {
            System.out.println("Kullanici adini giriniz:");
            String kullanici=scanner.nextLine();
            System.out.println("Parolayı giriniz:");
            String parola=scanner.nextLine();
            
            if( kullanici.equals(sys_kullaniciadi) && parola.equals(sys_parola)){
                System.out.println("Hosgeldiniz " + kullanici);
                break;
            }
            else if( kullanici.equals(sys_kullaniciadi) && !parola.equals(sys_parola))
            {
                System.out.println( "Sayın"+ kullanici + "hatalı parola girdiniz..." );
                giris_hakki-=1;
                
            }
            else if(!kullanici.equals(sys_kullaniciadi) && parola.equals(sys_parola))
            {
                System.out.println("Kullanıcı adınızı doğru girmediniz...");
                giris_hakki-=1;
                
            }
            else {
                System.out.println("Kullanici adiniz ve parolanız hatalı");
                giris_hakki-=1;
            }
            if(giris_hakki == 0)
            {
                System.out.println("Giriş hakkınız bitti...");
                break;
            }
        }
        
    }
}
*/
/*
// Faiz işleme Para = Para + yıl*(3*(Para)/50)
//Interest
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money,year,interest;
        System.out.println("Enter the amount of money for which interest will be charged:");
        money = scanner.nextInt();
        System.out.println("Please write in how many months the interest will be applied to the money:");
        year = scanner.nextInt();
        for(int i=1;i<=year;i++){
            interest=((money*3)/50);
            money= money + i *((money*3)/50);
            System.out.println("Your total money at the end of the "  + i +". year:" + money);
            System.out.println("The amount of interest applied:" + interest);
        }
    }
}
*/
//Methodlar ve Fonksiyonlar
/*public class main{
// public static void selamlama() {
        
        System.out.println("Merhaba nasılsınız...");
        System.out.println("Selamlar...");
    }
    public static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        int fctoriyel=1;
        int i;
        for(i=num;i>0;i--)
        {
         fctoriyel=i * fctoriyel;   
        }
        System.out.println(num +"!= " + fctoriyel);
        
            //while(num>0){
            //    fctoriyel*=num;
            //    num--;
        //}
        //System.out.print(num +"!= " + fctoriyel);
        
    }
    public static void main(String[] args){//main metodu
        
        //Erişim belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
        //Burası fonsiyon bloğu
        //fonksiyonun yapacağğı işler burada olacak
        }
        
        selamlama();
        selamlama();
        faktoriyel();
         
    }
}*/
/*
public class main{
    public static void toplama(int a,int b,int c) {
        System.out.println("Toplamları = " + (a+b+c));
        
    }
    public static void selamlama(String isim) {
         System.out.println("Selamlar... " + isim);
    }
    public static void main(String[] args) {
        selamlama("Murat");
        selamlama("Bartu");
        toplama(12,13,15);
    }
}
*/

/*
public class main{
    public static int toplama(int a,int b,int c) {
       // System.out.println(a+b+c);//voidda kullandığımız
       return (a+b+c);//burada döndürdüğümüz değer int olduğundan void yerine int yazdık
    }
    public static void main(String[] args) {
         System.out.println("Çıktı değerimiz: " + toplama(1,2,3));
    }
}
*/
/*
public class main{
    public static int ikiliçarp(int a,int b) {
        return a*b;
    }
    public static int ikilitoplama(int a,int b) {
        return a+b;
    }
    public static int ikilicikarma(int a ,int b) {
        return a-b;
    }
    public static void main(String[] args) {
         System.out.println("Çarpım sonucumuz:" + ikiliçarp(ikilicikarma(55, 33),ikilitoplama(24, 13)));
         System.out.println("Toplama sonucumuz:" + ikilitoplama(24, 13));
         System.out.println("Fark sonucumuz:" + ikilicikarma(55, 33));
    }
}
*/
//  return den sonra kodlar çalışmaz çünkü return fonksiyonların son sözcüğüdür.
//  Overloading = Aşırı Yükleme
/*
public class main{
    public static void toplama(String a,String b) {
        System.out.println(a + " " + b );
        
    }
    public static void toplama(int a,int b) {
        System.out.println("Toplamları = " + (a+b));
        
    }
    public static void toplama(int a,int b,int c) {
        System.out.println("Toplamları:" + (a+b+c));
    }
    public static void main(String[] args) {
        toplama(4, 5, 6);
        toplama(1, 2);// 3 parametre alıyor ama biz 2 tane gönderdik burda ne yapmamız lazım
        //Bizim bu fonksiyonun üstüne tekrar tanımlamamız lazım yani 2 tane aynı fonksiyon belirttik
        toplama("Bartu", "Paçal");
    }
}*/

/*public class main{
    public static void skorhesapla(String isim,int puan) {
        System.out.println(isim + " isimli oyuncunun " + puan + " puana sahiptir.");
    }
    public static void skorhesapla(String isim) {
        System.out.println(isim + " isimli oyuncu puansızdır.");
        
    }
    public static void skorhesapla(int puan) {
        System.out.println("İsimsiz oyuncu " + puan + " puana sahiptir.");
    }
    public static void main(String[] args) {
        skorhesapla("Bartu",15);
        skorhesapla(13);
        skorhesapla("Melisa");
    }
}*/
/*
public class main{
    public static void main(String[] args) {
        int a=4;
        String yazdir="Merhaba";
        if(a<10){
        System.out.println(yazdir);
    }
    
}
}*/
/*
public class main{
    public static void toplama(int a,int b,int c) {
        System.out.println("Toplamları = " + (a+b+c));
    }
    public static void main(String[] args) {
        toplama(12,13,15);
        //System.out.println(a); bu kısım çalışmaz çünkü a , b ve c toplamada tanımlı yanlızca o kodbloğuna ait üstte tanımlanmiş birer parametrelerdir. 
    }
}
*/
/*
public class main {
    public static boolean asalMi(int sayi) {
        for (int i = 2 ; i < sayi;i++) {
            if (sayi % i == 0){
                return false;    
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        for (int i = 2 ; i < 1000 ; i++) {
            if (asalMi(i)){
                System.out.println(i); 
            }
        }
        
        //1'den 1000'e kadar olan sayÄ±lardan asal olanlarÄ± ekrana yazdÄ±rÄ±n. 
        //Asal SayÄ± : 1'e ve kendisinden baÅŸka hiÃ§bir sayÄ±ya bÃ¶lÃ¼nmeyen sayÄ±ya asal sayÄ± denir.
        
    }
}
*/
/*
import java.util.Scanner;
public class main{
    public static int ebobBulma(int num1 ,int num2){
        int ebob = 1;
        for(int i=1 ; i<=num1 && i<=num2 ; i++){
            if((num1 % i==0) && (num2 % i == 0) ){
                ebob=i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        // kullanıcıdan alınan 2 sayının ebobunu bulma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinici sayı:");
        int sayi1 = scanner.nextInt();
        System.out.println("ikinci sayı:");
        int sayi2 = scanner.nextInt();
        System.out.println("Iki sayının Ebobu: " + ebobBulma(sayi1, sayi2));
    }
}*/
/*
import java.util.Scanner;
public class main{
    public static int topla(int a,int b,int c,int d) {
        return (a+b+c+d);
    }
    public static double çıkarma(int a,int b,int c,int d) {
        return ((double)a-b-c-d);
    }
    public static float çarpma(int a,int b,int c,int d) {
        return ((float)a*b*c*d);
    }
    public static double bölme(int a,int b,int c,int d) {
            return ((double)a/b/c/d);
    }
    
    public static void main(String[] args) {
       int num1,num2,num3,num4;
        String exit,op;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiply\n4.Division\n5-Enter q for exit ...");
        op = scanner.nextLine();
        
            System.out.println("Enter num1:");
            num1 = scanner.nextInt();
            System.out.println("Enter num2:");
            num2 = scanner.nextInt();
            System.out.println("Enter num3:");
            num3 = scanner.nextInt();
            System.out.println("Enter num4:");
            num4 = scanner.nextInt();
        if(op.equals("1")){
           
            System.out.println("Addition result:" + topla(num1, num2,num3, num4));
        }
        else if(op.equals("2")){
           
            System.out.println("Substraction result:" +çıkarma(num1, num2,num3, num4));
        }
        else if(op.equals("3")){
            
            System.out.println("Multiply result:" + çarpma(num1, num2,num3, num4));
            
        }
        else if(op.equals("4")){
            System.out.println("Substraction result:" +bölme(num1, num2,num3, num4));
        }
         else if(op.equals("q")){
            System.out.println("Exit from system...");
        }
        else{
            System.out.println("We didn't find operation number ??!!");
        }
        
    }
}
*/
/*import java.util.Scanner;


public class main {
    
    //Method Overloading kullanak bir tane hesap makinesi tasarlamaya Ã§alÄ±ÅŸÄ±n.
    //Toplama ve Ã‡arpma metodlarÄ±nÄ± 2 veya 3 parametre alacak ÅŸekilde tasarlayÄ±n.

     
    public static int cikarma(int a,int b) {
        
        return (a - b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a / b);
        
    }
    public static int toplama(int a,int b){
        
        return (a + b);
        
    }
    public static int toplama(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a,int b) {
        
        return a * b;
    }
    public static int carpma(int a,int b,int c) {
        return a * b * c;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler =  "1. Toplama Ä°ÅŸlemi\n"
                           +"2. Ã‡Ä±karma Ä°ÅŸlemi\n"
                           + "3. Ã‡arpma Ä°ÅŸlemi\n"
                           + "4. BÃ¶lme Ä°ÅŸlemi\n"
                           + "Ã‡Ä±kÄ±ÅŸ iÃ§in q'ya basÄ±n.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.print("Ä°ÅŸlemi SeÃ§iniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Ã‡Ä±kÄ±lÄ±yor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("KaÃ§ deÄŸer toplayacaksÄ±nÄ±z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n toplamlarÄ± : " + (toplama(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n toplamlarÄ± : " + (toplama(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun iÃ§in uygun metod bulunmuyor...");
                }
                
                
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen SayÄ±larÄ± FarklarÄ± : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("KaÃ§ deÄŸer Ã§arpacaksÄ±nÄ±z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n Ã§arpÄ±mlarÄ± : " + (carpma(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n Ã§arpÄ±mlarÄ± : " + (carpma(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun iÃ§in uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen SayÄ±larÄ±n BÃ¶lÃ¼mÃ¼ : " + bolme(a, b));
                
            }
            else {
                System.out.println("GeÃ§ersiz Ä°ÅŸlem...");
            }   
        }  
    }
}
*/
