
public class Main {
        public static void main(String[] args) {
        
        //    Sekil sekil = new Sekil ("Sekil"); bu kısımda interfaceler gibi obje oluşturamıyoruz...
        Sekil sekil; // biz burda abstract classımızdan referans ürettik alt sınıflara referans olabildi...
        sekil = new Kare("Kare2", 9);
        sekil.alan_hesapla();
        sekil.cevre_hesapla();
        sekil= new Daire("Daire2", 5);
        sekil.alan_hesapla();
        sekil.cevre_hesapla();
        
        
        Kare kare1 = new Kare("Kare1", 6); // biz burda referans yoluyla kare oluşturduk
        Daire daire1 =new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
            
    }
}
