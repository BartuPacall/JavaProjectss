
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame{
    
     public AnaEkran(String string) throws HeadlessException {
        super(string);
    }
    
    public static void main(String[] args) {
            
        GrafikKullanimi grafik_kullanimi = new GrafikKullanimi();
        
        AnaEkran anaEkran = new AnaEkran("Grafik Kullanimi");
        
        anaEkran.setVisible(true);
        anaEkran.setResizable(true); // kenarlarından tutunca bu pencere genişlesin diyoruz
        anaEkran.setSize(800,600);
        anaEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // çarpıya basınca kapansın diyoruz buradada
        
        anaEkran.add(grafik_kullanimi);
        
        // not : eğer (0,0) noktasını arıyorsan sol en üst koşe olur aşağı(y) ve sağ tarafa doğru(x) değerleri artar.
        
        
        
    }

    
    
}
