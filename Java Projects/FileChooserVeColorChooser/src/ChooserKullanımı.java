
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bartu
 */
public class ChooserKullanımı extends javax.swing.JFrame {

    /**
     * Creates new form ChooserKullanımı
     */
    public ChooserKullanımı() {
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

        dosyaAc = new javax.swing.JButton();
        renkDegis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazialani = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dosyaAc.setText("Dosya Aç");
        dosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaAcActionPerformed(evt);
            }
        });

        renkDegis.setText("Renk Değiştir");
        renkDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkDegisActionPerformed(evt);
            }
        });

        yazialani.setColumns(20);
        yazialani.setRows(5);
        jScrollPane1.setViewportView(yazialani);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dosyaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(renkDegis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosyaAc)
                    .addComponent(renkDegis))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaAcActionPerformed
        
        JFileChooser fc = new JFileChooser();
        int i =fc.showOpenDialog(this);
        
        if(i == JFileChooser.APPROVE_OPTION){
            // aprove_option yani okeye basıldıysa
            File file = fc.getSelectedFile();
            
            String icerik = "";
            
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
                
                while(scanner.hasNextLine()){
                    
                    icerik += scanner.nextLine() + "\n" ;
                    
                    
                }
                yazialani.setText(icerik);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ChooserKullanımı.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_dosyaAcActionPerformed

    private void renkDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkDegisActionPerformed
        Color color = JColorChooser.showDialog(this, "Renk seçiniz : ", Color.RED);
        
        yazialani.setForeground(color);
        
        
        
        
        
    }//GEN-LAST:event_renkDegisActionPerformed

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
            java.util.logging.Logger.getLogger(ChooserKullanımı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanımı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanımı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanımı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserKullanımı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dosyaAc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton renkDegis;
    private javax.swing.JTextArea yazialani;
    // End of variables declaration//GEN-END:variables
}
