/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YeniNAzizah
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Bilangan1 = new javax.swing.JTextField();
        Bilangan2 = new javax.swing.JTextField();
        bagi = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        kali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hasil");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel2.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setText("Bilangan 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel4.setText("Bilangan 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel5.setText("Operator");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        Hasil.setEditable(false);
        getContentPane().add(Hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 30));

        Bilangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bilangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        Bilangan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan2ActionPerformed(evt);
            }
        });
        getContentPane().add(Bilangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));

        bagi.setText(":");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        getContentPane().add(bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 50, 30));

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 30));

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        getContentPane().add(kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 30));

        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        getContentPane().add(kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bilangan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bilangan2ActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
    int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasiltambah= bil1+bil2;
        Hasil.setText(String.valueOf(hasiltambah));   
// TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
       int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasilkurang = bil1-bil2;
        Hasil.setText(String.valueOf(hasilkurang)); // TODO add your handling code here:
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasilkali = bil1*bil2;
        Hasil.setText(String.valueOf(hasilkali));
        
// TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        Float bil1 = Float.valueOf(Bilangan1.getText());
        Float bil2 = Float.valueOf(Bilangan2.getText());
        Float hasilbagi = bil1/bil2;
        Hasil.setText(String.valueOf(hasilbagi)); // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void Bilangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bilangan1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton bagi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
