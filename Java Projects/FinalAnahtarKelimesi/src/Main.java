
public class Main {
    public static void main(String[] args) {
        
        // final anahtar kelimesi tanımlanan bir özelliğin değeri sadece 1 defa verilebiliyor.
        //biz o özelliğe değer verdiğimiz zaman başka bir yerde bu özelliğin değerini değiştiremiyoruz 
        /*
        FinalTest f1 =new FinalTest("Obje1");
        FinalTest f2 = new FinalTest("Obje2");
        
        System.out.println("Obje sayısı : " + f1.obje_sayisi); // static final şeklinde yapmadığımız için sırayla 1 ve 2 bastırıldı
        System.out.println("Obje sayısı : " + f2.obje_sayisi);
        f2.obje_sayisi = 10 ; // burada değer veremiyoruz
        */
        System.out.println("PI sayısı : "+ Math.PI);
        // Math.PI= 3.15 ; // final olarak yazmasalardı public static olarak yazılsaydı biz bunu değiştirebilicektik.
        
        System.out.println("Database ismi : " + Database.databaseIsmi);
        System.out.println("Username : " + Database.username);
        System.out.println("Password : " + Database.password);
        
        // Database.username = "root2"; // bunu değiştiremiyoruz böylece
        
        
    }
}
