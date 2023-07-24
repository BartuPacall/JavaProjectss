
public class Daire extends Sekil {
    private int yaricap;
    // gene ünlem verdi kendi constructor ını kendin yaz diyor ünleme bas add constructor
    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }
    
    // Eğer bunu sekil sınıfından türettiysen senin bunu implement etmen gerekiyor diyor extends yazınca
    // ünleme bas implement all abstract methods a bas
    @Override
    void alan_hesapla() {
        System.out.println(getIsim() +" alanı : " + (yaricap*yaricap*Math.PI) + " eşittir.");
    }

    @Override
    void cevre_hesapla() {
        System.out.println("Dairenin çevresi : " + (2*Math.PI*yaricap));
    }
    
}
