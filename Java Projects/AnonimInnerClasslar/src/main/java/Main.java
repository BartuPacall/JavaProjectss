
public class Main {
    public static void main(String[] args) {
        
        //bu kısmı yazarken otomatik tamamlattı 
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders çalışıyor...");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyor...");
            }
        }; // class tanımlaması olduğu için sonuna ; koyuyoruz.
        
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        
        System.out.println("****************************************************");
        
        AOgrenci ogrenci2 = new AOgrenci("Bartu Paçal",1453) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapılıyor...\n" + "Ad - Soyad : "+ getIsim() + "\nNumara : " +getNumara());
            }
        };
        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();
    }
    public static abstract class AOgrenci{
        
        private String isim;
        private int numara;

        public String getIsim() { // getter
            return isim;
        }

        public void setIsim(String isim) { // setter
            this.isim = isim;
        }

        public int getNumara() { // getter
            return numara;
        }

        public void setNumara(int numara) { // setter
            this.numara = numara;
        }

        public AOgrenci(String isim, int numara) { // constructor
            this.isim = isim;
            this.numara = numara;
        }
        
        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("Selamlar...");
        }
    }
    
    // interface i ek dosya açarakta kullanabiliriz ama biz main class ın içinde yazıcaz
    public interface IOgrenci{
        
        void ders_calis();
        void derse_gir();
    }
    
}
