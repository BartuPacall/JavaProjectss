
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

    class GrafikKullanimi extends JPanel{
        // JPANELE tıkladıgımızda j panelin bir jcomponentsten extend edildiğini görüyoruz insert override yapıncac bunun bileşenleri orada çıkıyor paint grafiği seçioruz ordan

    public GrafikKullanimi() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
       
        
        g.fillRect(200, 100, 30, 40);
        
        g.setColor(Color.red);
        g.fillRect(400, 600, 30, 30);
        g.setColor(Color.blue);
        g.drawOval(200, 200, 30, 60);
        g.fillOval(300, 300, 70, 140);

        g.setColor(Color.cyan);
        g.drawLine(100, 100, 10, 60);
        
            
        
        
        
    }
    
}
