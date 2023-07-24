public class Test {
            public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "15.6", resolution);

        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");
        
        Anakart anakart = new Anakart("B250-PRO","ASUS", 10, "WİNDOWS 11");
       
        Bilgisayar pc = new Bilgisayar(monitor, kasa,anakart);
        // iç içe objelerimiz var ve biz bu objelere referanslar yardımıyla ulaşabiliyoruz...
        pc.getKasa().bilgisayari_ac(); // get kasayı fonksiyonunu kullanarak bilgisayarın kasa referansını alıcaz ve biz bunlara referanslar sayesinde erişebiliyoruz.
        pc.getMonitor().monitorü_kapat(); // HAS - A ilişkisi var sahiplik ilişkisi var. Bilgisayar anakarta kasaya sahiptir.
        pc.getAnakart().isletim_sistemi_yükle("Ubuntu 16.04"); // anakart objemin referansını alıyoruz bu referans üzerinden işletim sistemi yükle şeklinde bir fonksiyonu çağırıyoruz.
        
       
        
        
                }
}
