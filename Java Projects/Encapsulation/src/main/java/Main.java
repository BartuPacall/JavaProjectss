public class Main {
    public static void main(String[] args) {
        /* Abone abone = new Abone();
        
       abone.isim ="Bartu Paçal";
        abone.bakiye = 4000;
        abone.sehir =" Bursa";
        
        abone.Dogalgaz_Kullan(4000);*/
       
       GelismisAbone abone = new GelismisAbone("Bartu",200, "Bursa");
       
       abone.Dogalgaz_Kullan(100);
    }
}
