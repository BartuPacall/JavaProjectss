
import java.util.LinkedHashSet;
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
public class RadioveCombobox extends javax.swing.JFrame {
    Set <String> diller = new LinkedHashSet<String>();
    
    public void goster(){
        String message = "Seçtiğiniz diller : " ;
        
        for(String dil : diller) {
            
            message += dil + " ";
            
        }
        JOptionPane.showConfirmDialog(this, message);
    }
    // eğer tek bir şey seçmek istiyorsak panelden buttongroup sürükle
    /**
     * Creates new form RadioveCombobox
     */
    public RadioveCombobox() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        python_radio = new javax.swing.JRadioButton();
        php_radio = new javax.swing.JRadioButton();
        java_radio = new javax.swing.JRadioButton();
        dilleri_göster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(python_radio);
        python_radio.setText("Python");

        buttonGroup1.add(php_radio);
        php_radio.setText("Php");

        buttonGroup1.add(java_radio);
        java_radio.setText("Java");

        dilleri_göster.setText("göster");
        dilleri_göster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilleri_gösterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(java_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(python_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(php_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dilleri_göster, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(java_radio)
                .addGap(33, 33, 33)
                .addComponent(python_radio)
                .addGap(27, 27, 27)
                .addComponent(php_radio)
                .addGap(77, 77, 77)
                .addComponent(dilleri_göster)
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dilleri_gösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilleri_gösterActionPerformed
        if(java_radio.isSelected()) {
            
            diller.add("Java");
        }
        else {
            diller.remove("Java");
        }
        if(python_radio.isSelected()) {
            
            diller.add("Python");
        }
        else {
            diller.remove("Python");
        }
        if(php_radio.isSelected()) {
            
            diller.add("Php");
        }
        else {
            diller.remove("Php");
        }
        goster();
        
    }//GEN-LAST:event_dilleri_gösterActionPerformed

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
            java.util.logging.Logger.getLogger(RadioveCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioveCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioveCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioveCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioveCombobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dilleri_göster;
    private javax.swing.JRadioButton java_radio;
    private javax.swing.JRadioButton php_radio;
    private javax.swing.JRadioButton python_radio;
    // End of variables declaration//GEN-END:variables
}
