
public class Ogrenci {
    private String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

     
    // insert code -> override method -> toString
    // bu kısmı override edince direkt sout.println ile bastırabileceğiz...
    @Override
    public String toString() {
        return "İsim : " + isim; 
    }
    
    
    
}
