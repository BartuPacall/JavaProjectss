

public class FinalTest {
    
    public final int obje_sayisi;
    private static int say = 0 ;
    private final String isim;

    public FinalTest(String isim ) {
        this.isim = isim;
        say++;
        obje_sayisi = say ;
    }
    /*
    public void deneme(){
        obje_sayisi=5; // bunu ya constructor içinde ya da tanımlanırken vermen lazım burada hata alırız yoksa
    }
    */

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
    
}
