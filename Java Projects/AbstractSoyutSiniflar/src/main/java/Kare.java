
public class Kare extends Sekil{
    private int kenar;
    // gene ünlem verdi kendi constructor ını kendin yaz diyor ünleme bas add constructor
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar; // bunu biz ekledik özellik ekleyip
    }
    // Eğer bunu sekil sınıfından türettiysen senin bunu implement etmen gerekiyor diyor extends yazınca
    // ünleme bas implement all abstract methods a bas
    @Override
    void alan_hesapla() {

        System.out.println(getIsim() + " alanı : " + (kenar*kenar) + " eşittir.");
    }
    
    void cevre_hesapla(){
        System.out.println("Karenin çevresi: " + (kenar*4));
    }
    
}
