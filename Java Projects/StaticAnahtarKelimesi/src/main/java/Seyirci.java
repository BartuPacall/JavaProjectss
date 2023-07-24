
public class Seyirci {
    
    private static String isim;

    public static int seyirci_sayisi =0; // Bu seyirci sayisi sınıfa özgü oldu.
    
    
    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Seyirci(String isim) {
        this.isim = isim;
        
        seyirci_sayisi++; // her obje oluşturduğumuz zaman seyirci sayisini arttırmış olduk
    }
    
    public void oyun_seyret(){
        System.out.println(isim + " isimli seyirci oyun seyrediyor...");
    }
    
    public static int getSeyirci_sayisi(){
        System.out.println(isim); // bu şekildede hata aldık çünkü gene non - static method
        // oluşan bir şeyden oluşmayan birşeyi çeğırmaya çalışmak bu nedenle hataya sebebiyet verior
        // bundan dolayı private String isimi private static String isim yapıoruz
        return seyirci_sayisi;
    }
    
}
