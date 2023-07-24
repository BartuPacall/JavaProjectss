public abstract class Sekil {    
    // abstract yapmak için class ı başına abstract ekledik
    
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismini_soyle(){
        
        System.out.println("Bu obje " + isim + " objesidir.");
    }
    
    // alt sınıflar bu methodları kendine göre yazması grekiyorsa biz bunları abstarct olarak yazıoruz
    // alt sınıflar bunları daha sonra kendine göre yazıor
    abstract void alan_hesapla();
    abstract void cevre_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
        
}
