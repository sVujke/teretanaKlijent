/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.AbstractObjekat;
import domen.Clan;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import model.TblModelClan;
import start.KlijentStart;

/**
 *
 * @author vujke
 */
public class ClanFrm extends javax.swing.JFrame {

    TblModelClan tbl;
    /**
     * Creates new form ClanFrm
     */
    public ClanFrm() {
        initComponents();
        srediTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbtDodaj = new javax.swing.JButton();
        jbtIzmeni = new javax.swing.JButton();
        jbtIzbriši = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtPretrazi = new javax.swing.JButton();
        jtxtPretraga = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbtDodaj.setText("Dodaj člana");
        jbtDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDodajActionPerformed(evt);
            }
        });

        jbtIzmeni.setText("Izmeni člana");
        jbtIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIzmeniActionPerformed(evt);
            }
        });

        jbtIzbriši.setText("Izbriši člana");
        jbtIzbriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIzbrišiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtIzbriši, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbtDodaj)
                .addGap(37, 37, 37)
                .addComponent(jbtIzmeni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jbtIzbriši)
                .addGap(25, 25, 25))
        );

        jbtPretrazi.setText("Pretraži");
        jbtPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPretraziActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "imenu", "korisničkom imenu", "email-u" }));

        jLabel1.setText("Pretraži po:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jtxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPretrazi)
                    .addComponent(jtxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPretraziActionPerformed
        // TODO add your handling code here:
        String pretraga = jtxtPretraga.getText().trim();

        if (pretraga.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nije uneto ono što "
                    + "treba pretražiti!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
    }//GEN-LAST:event_jbtPretraziActionPerformed

    private void jbtDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDodajActionPerformed
        try {
            // TODO add your handling code here:
            DodajClanaFrm dodaj = new DodajClanaFrm();
            //FrmDodajKorisnika frm = new FrmDodajKorisnika(tbl);
            JDialog dialog = new JDialog(this, "Dodaj člana");
            dialog.add(dodaj);
            dialog.pack();
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtDodajActionPerformed

    private void jbtIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIzmeniActionPerformed
        // TODO add your handling code here:
        int red = jTable1.getSelectedRow();
        
        if(red == -1){
            JOptionPane.showMessageDialog(rootPane, "Nije odabran član "
                    + "kojeg treba izmeniti!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        try {
            
            // TODO add your handling code here:
            DodajClanaFrm dodaj = new DodajClanaFrm("update", tbl.vratiClana(red));
            //FrmDodajKorisnika frm = new FrmDodajKorisnika(tbl);
            JDialog dialog = new JDialog(this, "Izmeni člana");
            dialog.add(dodaj);
            dialog.pack();
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtIzmeniActionPerformed

    private void jbtIzbrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIzbrišiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtIzbrišiActionPerformed

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
            java.util.logging.Logger.getLogger(ClanFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClanFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClanFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClanFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlijentStart().start();

                new ClanFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtDodaj;
    private javax.swing.JButton jbtIzbriši;
    private javax.swing.JButton jbtIzmeni;
    private javax.swing.JButton jbtPretrazi;
    private javax.swing.JTextField jtxtPretraga;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu(){
        try {
            
            List<AbstractObjekat> clanovi = new ArrayList<>();
            List<AbstractObjekat> mesta = new ArrayList<>();
            //System.out.println("korisniciBaza");
            
            //System.out.println("pre vratiListuKorisnika");
            clanovi = Kontroler.vratiKontrolera().vratiListuClanova();
            
            mesta = Kontroler.vratiKontrolera().vratiSvaMesta();
            tbl = new TblModelClan(new ArrayList<>(), mesta);
            //System.out.println("posle vratiListuKorisnika");
            for (AbstractObjekat ao : clanovi) {
                Clan m = (Clan) ao;
                //System.out.println(m);
                tbl.dodajUTabelu(m);
                //System.out.println("dodat");
            }
            
            jTable1.setModel(tbl);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
