/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_konversi;

/**
 *
 * @author saut manurung
 */
public class Konversi extends javax.swing.JFrame {

    /**
     * Creates new form Konversi_Desimal
     */
    public Konversi() {
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
        Desimal = new javax.swing.JLabel();
        Oktal = new javax.swing.JLabel();
        Biner = new javax.swing.JLabel();
        Heksadesimal = new javax.swing.JLabel();
        Kotak_desimal = new javax.swing.JTextField();
        Kotak_Oktal = new javax.swing.JTextField();
        Kotak_Biner = new javax.swing.JTextField();
        Kotak_Heksadesimal = new javax.swing.JTextField();
        Konversi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MenuBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Konversi Bilangan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kalkulator Konversi Bilangan Desimal,Biner,Oktal, dan Heksadesimal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Masukkan Angka yang ingin anda Konversikan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        Desimal.setForeground(new java.awt.Color(255, 255, 255));
        Desimal.setText("Desimal :");
        getContentPane().add(Desimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        Oktal.setForeground(new java.awt.Color(255, 255, 255));
        Oktal.setText("Oktal :");
        getContentPane().add(Oktal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        Biner.setForeground(new java.awt.Color(255, 255, 255));
        Biner.setText("Biner :");
        getContentPane().add(Biner, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        Heksadesimal.setForeground(new java.awt.Color(255, 255, 255));
        Heksadesimal.setText("Heksadesimal : ");
        getContentPane().add(Heksadesimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        Kotak_desimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kotak_desimalActionPerformed(evt);
            }
        });
        getContentPane().add(Kotak_desimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 141, -1));

        Kotak_Oktal.setEditable(false);
        Kotak_Oktal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kotak_OktalActionPerformed(evt);
            }
        });
        getContentPane().add(Kotak_Oktal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 141, -1));

        Kotak_Biner.setEditable(false);
        Kotak_Biner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kotak_BinerActionPerformed(evt);
            }
        });
        getContentPane().add(Kotak_Biner, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 141, -1));

        Kotak_Heksadesimal.setEditable(false);
        Kotak_Heksadesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kotak_HeksadesimalActionPerformed(evt);
            }
        });
        getContentPane().add(Kotak_Heksadesimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 141, -1));

        Konversi.setText("Konversi");
        Konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiActionPerformed(evt);
            }
        });
        getContentPane().add(Konversi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Terima Kasih Telah Menggunakan Aplikasi Ini");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        MenuBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Oktal", "Binary", "Hexadesimal" }));
        MenuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBoxActionPerformed(evt);
            }
        });
        getContentPane().add(MenuBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\file dari hp samsung\\20190711_185517.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kotak_desimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kotak_desimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kotak_desimalActionPerformed

    private void Kotak_OktalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kotak_OktalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kotak_OktalActionPerformed

    private void Kotak_BinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kotak_BinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kotak_BinerActionPerformed

    private void Kotak_HeksadesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kotak_HeksadesimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kotak_HeksadesimalActionPerformed

    private void KonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiActionPerformed
        if (MenuBox.getSelectedItem().equals("Decimal")) {
            Kotak_Biner.setText(Integer.toBinaryString(Integer.parseInt(Kotak_desimal.getText())));
            Kotak_Oktal.setText(Integer.toOctalString(Integer.parseInt(Kotak_desimal.getText())));
            Kotak_Heksadesimal.setText(Integer.toHexString(Integer.parseInt(Kotak_desimal.getText())));
        } else if (MenuBox.getSelectedItem().equals("Oktal")) {
            int decimal = Integer.parseInt(Kotak_Oktal.getText(), 8);
            Kotak_desimal.setText(String.valueOf(decimal));
            Kotak_Biner.setText(Integer.toBinaryString(decimal));
            Kotak_Heksadesimal.setText(Integer.toHexString(decimal));
        } else if (MenuBox.getSelectedItem().equals("Hexadesimal")) {
            int decimal = Integer.parseInt(Kotak_Heksadesimal.getText(), 16);
            Kotak_desimal.setText(String.valueOf(decimal));
            Kotak_Biner.setText(Integer.toBinaryString(decimal));
            Kotak_Oktal.setText(Integer.toOctalString(decimal));
        } else if (MenuBox.getSelectedItem().equals("Binary")) {
            int decimal = Integer.parseInt(Kotak_Biner.getText(), 2);
            Kotak_desimal.setText(String.valueOf(decimal));
            Kotak_Oktal.setText(Integer.toOctalString(decimal));
            Kotak_Heksadesimal.setText(Integer.toHexString(decimal));
        }


    }//GEN-LAST:event_KonversiActionPerformed

    private void MenuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBoxActionPerformed
        if (MenuBox.getSelectedItem().equals("Decimal")) {
            Kotak_desimal.setEditable(true);
            Kotak_Oktal.setEditable(false);
            Kotak_Biner.setEditable(false);
            Kotak_Heksadesimal.setEditable(false);
        } else if (MenuBox.getSelectedItem().equals("Oktal")) {
            Kotak_Oktal.setEditable(true);
            Kotak_desimal.setEditable(false);
            Kotak_Biner.setEditable(false);
            Kotak_Heksadesimal.setEditable(false);
        } else if (MenuBox.getSelectedItem().equals("Binary")) {
            Kotak_Biner.setEditable(true);
            Kotak_Oktal.setEditable(false);
            Kotak_desimal.setEditable(false);
            Kotak_Heksadesimal.setEditable(false);
        } else if (MenuBox.getSelectedItem().equals("Hexadesimal")) {
            Kotak_Heksadesimal.setEditable(true);
            Kotak_Oktal.setEditable(false);
            Kotak_Biner.setEditable(false);
            Kotak_desimal.setEditable(false);
        }
    }//GEN-LAST:event_MenuBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Biner;
    public javax.swing.JLabel Desimal;
    public javax.swing.JLabel Heksadesimal;
    public javax.swing.JButton Konversi;
    public javax.swing.JTextField Kotak_Biner;
    public javax.swing.JTextField Kotak_Heksadesimal;
    public javax.swing.JTextField Kotak_Oktal;
    public javax.swing.JTextField Kotak_desimal;
    public javax.swing.JComboBox<String> MenuBox;
    public javax.swing.JLabel Oktal;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
