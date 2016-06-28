/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import start.KlijentStart;

/**
 *
 * @author vujke
 */
public class IndexFrm extends javax.swing.JFrame {

    /**
     * Creates new form IndexFrm
     */
    public IndexFrm() {
        initComponents();
        
        new KlijentStart().start();
        
//        jMenuBar1.setVisible(false);
        jPanel2.setVisible(false);
        jlblUlogovan.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtPrijava = new javax.swing.JToggleButton();
        jPasswordField = new javax.swing.JPasswordField();
        jlabelPrijaviteSe = new javax.swing.JLabel();
        jlblUlogovan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtPaketi = new javax.swing.JButton();
        jbtPretplata = new javax.swing.JButton();
        jbtClanovi2 = new javax.swing.JButton();
        jbtDolazak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kontrolna tabla");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("username:");

        jLabel2.setText("šifra: ");

        jbtPrijava.setText("Prijavite se");
        jbtPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrijavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jPasswordField)))
                    .addComponent(jbtPrijava, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtPrijava)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlabelPrijaviteSe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlabelPrijaviteSe.setText("Prijavite se na aplikaciju:");

        jlblUlogovan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblUlogovan.setText("Dobro došao/la");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtPaketi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtPaketi.setText("Paketi");
        jbtPaketi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPaketiActionPerformed(evt);
            }
        });

        jbtPretplata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtPretplata.setText("Pretplate");
        jbtPretplata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPretplataActionPerformed(evt);
            }
        });

        jbtClanovi2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtClanovi2.setText("Članovi");
        jbtClanovi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClanovi2ActionPerformed(evt);
            }
        });

        jbtDolazak.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtDolazak.setText("Dolasci");
        jbtDolazak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDolazakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtClanovi2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtPretplata, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPaketi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPaketi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtClanovi2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPretplata, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelPrijaviteSe)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUlogovan, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlabelPrijaviteSe)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblUlogovan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrijavaActionPerformed
        // TODO add your handling code here:
        String username = jtxtUserName.getText().trim();
        char[] passChar = jPasswordField.getPassword();
        String password = new String(passChar);
        
        if(username.length() == 0 && password.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Unesite korisničko "
                    + "ime i šifru", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        } else if (username.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Unesite korisničko ime"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        } else if((password.length() == 0)){
            JOptionPane.showMessageDialog(rootPane, "Unesite šifru"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        Korisnik k = new Korisnik("", "", password, username);
        Korisnik korisnik;
        try {
            
            korisnik = kontroler.Kontroler.vratiKontrolera().prijaviKorisnika(k);
            if(korisnik != null){
                jlblUlogovan.setText("Dobro došao/la "+korisnik.getIme()+"!");
                jPanel1.setVisible(false);
                jlabelPrijaviteSe.setVisible(false);
//                jMenuBar1.setVisible(true);
                jPanel2.setVisible(true);
                jlblUlogovan.setVisible(true);
                
            } else{
                JOptionPane.showMessageDialog(rootPane, "Pogresan username ili password");
            }
        } catch (IOException ex) {
            Logger.getLogger(IndexFrm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(rootPane, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IndexFrm.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showConfirmDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jbtPrijavaActionPerformed

    private void jbtClanovi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClanovi2ActionPerformed
        // TODO add your handling code here:
        ClanFrm frm = new ClanFrm();
        frm.setVisible(true);
    }//GEN-LAST:event_jbtClanovi2ActionPerformed

    private void jbtDolazakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDolazakActionPerformed
        // TODO add your handling code here:
        //System.out.println("pre konstruktora");
        DolazakFrm dol = new DolazakFrm();
        //System.out.println("posle konstruktora");
        dol.setVisible(true);
    }//GEN-LAST:event_jbtDolazakActionPerformed

    private void jbtPretplataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPretplataActionPerformed
        // TODO add your handling code here:
        PretplataFrm pfr = new PretplataFrm();
        pfr.setVisible(true);
    }//GEN-LAST:event_jbtPretplataActionPerformed

    private void jbtPaketiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPaketiActionPerformed
        // TODO add your handling code here:
        PaketFrm pak = new PaketFrm();
        pak.setVisible(true);
    }//GEN-LAST:event_jbtPaketiActionPerformed

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
            java.util.logging.Logger.getLogger(IndexFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexFrm().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JButton jbtClanovi2;
    private javax.swing.JButton jbtDolazak;
    private javax.swing.JButton jbtPaketi;
    private javax.swing.JButton jbtPretplata;
    private javax.swing.JToggleButton jbtPrijava;
    private javax.swing.JLabel jlabelPrijaviteSe;
    private javax.swing.JLabel jlblUlogovan;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
}
