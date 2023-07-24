
public class KapsamSinifi2 {
    private int Degisken=30; // sadece bu kısım varsa 30
    
    public KapsamSinifi2(){
        
    }
    public void dahiliSinifKontrol() {
        DahiliSinif d = new DahiliSinif();
        System.out.println("Kontrol ediliyor : " + d.a);
    }
    public class DahiliSinif {
        private int a=5;
        private int Degisken=20; // bunu dahil edince 20 yi yazdırır this.Degisken
        public void onilecarp(){
       //      int Degisken=10;
             for(int i = 1 ; i < 6 ; i++){
            
            System.out.println(i + " * " + KapsamSinifi2.this.Degisken + " = " + (i *KapsamSinifi2.this.Degisken)); // class taki değişkeni kullanmak için burda şöyle yapıyoruz --> KapsamSinifi2.this.Degisken 
            }
        }
    }
}
