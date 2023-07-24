public class main {
    public static void main(String[] args) {
        
        // inheritance yardımıyla benzer classların ortak özelliklerini ve methodlarını tek bir çatı altında birleştirip daha sonra bu classlarımızı türetebiliyorduk
        // javada c++ olduğu gibi multipleinheritance bulunmuyor onun yerine interface kullanıyoruz
        // Java da bir interface'in kod blokları yazılmıyor.İnterface 'e uyan tüm classları tek tek yazarak tanımlamaları gerekiyor.
        // ve interfaceler normal class lar gibi olmasığından biz bunlardan herhangi bir obje oluşturamıyoruz. Bu interface'e uyan classlara referans olabiliyoruz.
        // final ve static değişkenler tanımlanabiliyor.Bunları implemente eden yani bu interface uyan classlar için bir çatı olabilir.
        
        // new -> interface seçiyoruz ve I yani interface anlamına gelen IMuhendisi yazıyoruz proje adına
        
        // IMuhendis mühendis1 = new IMuhendis();
        
        PcMuhendisi muhendis1 =new PcMuhendisi(false, false);
        
        /*
        muhendis1.askerlik_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(4.00));
        String[] tecrube={"Vestel","Havelsan","Aselsan"};
        muhendis1.is_tecrübesi(tecrube);
        */
        // MakineMuhendisi muhendis2 = new MakineMuhendisi(true, true);
        // IMuhendis muhendis2 = new MakineMuhendisi(true, true); // Makine mühendisi yerine başa I Muhendis yazınca hata verdi bunu biz referans kısmına paratez içinde makine muhendisi ekleyerek düzelttik.        
       // MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, true);
        muhendis2.askerlik_sorgula();
        muhendis2.adli_sicil_sorgula();
        String[] tecrube = {"Vestel","Havelsan","Aselsan"};
        String[] referans = {"Ayşegül sengülme","Melisağ Sol","Adem Bureyn"};
        System.out.println(muhendis2.mezuniyet_ortalamasi(4.00));
        // ((MakineMuhendisi)muhendis2).referans_getir(referans);// Bu Kısmı
        muhendis2.referans_getir(referans);
        muhendis2.is_tecrübesi(tecrube);
        muhendis2.calis();
        
    }
    // Androidlerde bu kısımları çok fazla kullanıcaz
    
}
