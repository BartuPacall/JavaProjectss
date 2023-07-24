
public class Daire extends Sekil{
    
    private int yaricap;
    
    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alan_Hesaplama() {

        System.out.println(getIsim() + " 'nin alanı = " + (yaricap*yaricap*Math.PI));
        
    }
    
    
}
