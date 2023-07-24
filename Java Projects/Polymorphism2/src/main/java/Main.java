class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor....";
    }
    
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor..." ;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

class Aslan extends Hayvan{

    public Aslan(String isim) {
        super(isim);
    }
/*
    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor..." ;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    */
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor..." ;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }
    
    public String konus(){
        return this.getIsim() + " kişniyor...";
    }
}

public class Main {
    
    public static void Konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
        
    }

    public static void main(String[] args) {
        /*Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("BeyazSaray");
        Hayvan hayvan4= new Aslan("limon"); // biz bunu override etmedik bu yüzden hayvan methodundaki fonsiyon calıstı sadece
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        System.out.println(hayvan4.konus());*/
        
       /* Konustur(new Kedi("Tekir"));
        Konustur(new Kopek("Karabaş"));
        Konustur(new At("Beyaz Saray"));*/
        Kopek kopek1  = new Kopek("Karabaş");
        // kopek1. yaptığımızdan . dan sonra kopek objemizin object classından bütün methodları alabiliyoruz.
        
        if(kopek1 instanceof Kopek){
            System.out.println("Bu nesne köpek sınıfındandır...");
            // kopek referansı Kopek sınıfından mıdır?
        }
     }

}
