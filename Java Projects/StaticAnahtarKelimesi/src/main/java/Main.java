
public class Main {
        public static void selamla(){
                
                System.out.println("Selamlar...");
                
            }
        /*public void selamla(){
        // non -static bir method
        // bunu alttakinde selamla(); -> ile kullanamayız çünkü static bir methodda static olmayan bir method çağrılamaz...
        // ama üste yazdığımız staticli şekilde kullanabiliriz.
                System.out.println("Selamlar...");
                
            }*/
    
        public static void main(String[] args) {
            // bundaki statici kaldırırsak no main classes hatasını alırız çünkü bizim main methodumuzun belleğimizde direkt olarak oluşması gerekiyor statici kaldırırsak main direkt oluşmayacağından
            // bizim java projelerimizin çalışması için static bir main methoda sahip olması gerekiyor.
            // static bir method
            Seyirci seyirci1 = new Seyirci("Bartu Paçal");
            Seyirci seyirci2 = new Seyirci("Enes Anadolu");
            
            seyirci1.oyun_seyret();
            // her obje oluşturduğumuz zaman seyirci sayisini arttırmış olduk
            // System.out.println("Seyirci sayisi : " + Seyirci.seyirci_sayisi); 
            // Bunu get seyirci sayisi olarak çağıramıyoruz ama neden ? üsttekini ^
            // Çünkü seyirci sayimiz non static bir method direk sınıf ismi üstünden erişemem erişebilmemiz için mutlaka ve mutlaka obje oluşturmamız gerekiyor.
            // Ancak get seyirci sayısını static bir method yaparsam ben direk buna sınıf üstünden erişebilirim. 
            // nasıl yapıcaz -> Seyirci.javaya -> bas public static int Seyirici_sayisi
            System.out.println("Seyirci sayisi : " + Seyirci.getSeyirci_sayisi()); 
            System.out.println("Seyirci sayisi : " + seyirci1.getSeyirci_sayisi());
            System.out.println("Seyirci sayisi : " + seyirci2.getSeyirci_sayisi());
            
            selamla();
            System.out.println(Math.PI); // ctrl ile math a bastığımız zaman math ın classını açıcağız ve static ile tanımlı olan PI nın kodları
            
            
    }
}
