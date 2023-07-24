
public class Kare extends Sekil{

    private int kenar;
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    public void alan_Hesaplama() {
        System.out.println(getIsim() + " nin alanı = " + (kenar*kenar));
    }
    
    
}
