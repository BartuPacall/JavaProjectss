
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bartu
 */
public class SiparisUygulaması extends javax.swing.JFrame {
    
    Map<String,Integer> siparisler = new LinkedHashMap<String,Integer>();
    public void siparisleriGoster(){
        
        String message  = "Şu yemekler seçildi : ";
        int tutar = 0  ;
        if(siparisler.isEmpty()){
            message = "Siparişiniz bulunmamaktadır!";
        }
        else{
            message += "Siparisler\n";
        for(Map.Entry<String ,Integer> entry : siparisler.entrySet()){
            message +=entry.getKey() + "\n";
            tutar+=entry.getValue();
            }
        message += "Toplam Tutar : " + tutar;
        }
        JOptionPane.showMessageDialog(this, message);
    }
    
    /**
     * Creates new form SiparisUygulaması
     */
    public SiparisUygulaması() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        iskender = new javax.swing.JCheckBox();
        lahmacun = new javax.swing.JCheckBox();
        pizza = new javax.swing.JCheckBox();
        kokorec = new javax.swing.JCheckBox();
        siparis_görüntüle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Uygulaması");

        jLabel1.setText("MENÜ");

        iskender.setText("İskender - 250 TL");

        lahmacun.setText("Lahmacun - 90 TL");

        pizza.setText("Pizza - 120 TL");

        kokorec.setText("Kokoreç - 200 TL");

        siparis_görüntüle.setText("Sipariş Ver/Görüntüle");
        siparis_görüntüle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_görüntüleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lahmacun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iskender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kokorec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(siparis_görüntüle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iskender)
                .addGap(18, 18, 18)
                .addComponent(lahmacun)
                .addGap(18, 18, 18)
                .addComponent(pizza)
                .addGap(18, 18, 18)
                .addComponent(kokorec)
                .addGap(57, 57, 57)
                .addComponent(siparis_görüntüle)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siparis_görüntüleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_görüntüleActionPerformed
        if(iskender.isSelected()){
            siparisler.put("İskender", 250);
        }
        else{
            siparisler.remove("İskender");
        }
        
        if(lahmacun.isSelected()){
            siparisler.put("Lahmacun", 90);
        }
        else{
            siparisler.remove("Lahmacun");
        }
        if(pizza.isSelected()){
            siparisler.put("Pizza", 200);
        }
        else{
            siparisler.remove("Pizza");
        }
        if(kokorec.isSelected()){
            siparisler.put("Kokoreç", 120);
        }
        else{
            siparisler.remove("Kokoreç");
        }
        siparisleriGoster();
    }//GEN-LAST:event_siparis_görüntüleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulaması().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox iskender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox kokorec;
    private javax.swing.JCheckBox lahmacun;
    private javax.swing.JCheckBox pizza;
    private javax.swing.JButton siparis_görüntüle;
    // End of variables declaration//GEN-END:variables
}
