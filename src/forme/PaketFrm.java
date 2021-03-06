/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.AbstractObjekat;
import domen.Paket;
import domen.Termin;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import model.TblModelPaket;
import model.TblModelTermin;
import start.KlijentStart;
import forme.DodajPaketFrm;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.table.TableColumn;

/**
 *
 * @author vujke
 */
public class PaketFrm extends javax.swing.JFrame {
    TblModelTermin tblT;
    TblModelPaket tblP;
    /**
     * Creates new form PaketFrm
     */
    public PaketFrm() {
        initComponents();
        srediTabele();
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
        jtblPaketii = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbtPretrazi = new javax.swing.JButton();
        jtxtPretraga = new javax.swing.JTextField();
        jbtResetuj = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtDodajPaket = new javax.swing.JButton();
        jbtIzmeniPaket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paketi\n");

        jtblPaketii.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblPaketii);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtPretrazi.setText("Pretraži");
        jbtPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPretraziActionPerformed(evt);
            }
        });

        jbtResetuj.setText("Resetuj tabelu");
        jbtResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetujActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jbtResetuj, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jtxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPretrazi)
                    .addComponent(jtxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtResetuj))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtDodajPaket.setText("Dodaj Paket");
        jbtDodajPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDodajPaketActionPerformed(evt);
            }
        });

        jbtIzmeniPaket.setText("Izmeni Paket");
        jbtIzmeniPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIzmeniPaketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtDodajPaket)
                    .addComponent(jbtIzmeniPaket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbtDodajPaket)
                .addGap(26, 26, 26)
                .addComponent(jbtIzmeniPaket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDodajPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDodajPaketActionPerformed
        // TODO add your handling code here:
        
        Paket paket = null;

        DodajPaketFrm pk = new DodajPaketFrm("create", paket, tblP, null);
        
        JDialog dialog = new JDialog(this, "Dodaj paket");
            dialog.add(pk);
            dialog.pack();
            dialog.setVisible(true);
    }//GEN-LAST:event_jbtDodajPaketActionPerformed

    private void jbtIzmeniPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIzmeniPaketActionPerformed
        // TODO add your handling code here:
        
        int red = jtblPaketii.getSelectedRow();
        
        if(red == -1){
            JOptionPane.showMessageDialog(rootPane, "Nije odabran paket "
                    + "koji se menja!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        Paket paket = (Paket) tblP.vratiPaket(red);
        
             
        try {
             List<Termin> brisem;  
            List<Termin> terminiInicijalno = new ArrayList<>();
                List<AbstractObjekat> absTerm;
            absTerm = Kontroler.vratiKontrolera().vratiListuTermina();
            for (AbstractObjekat abs : absTerm) {
                    Termin tt = (Termin) abs;
                    if (tt.getPaket().equals(paket)) {
                        terminiInicijalno.add(tt);
                    }

                }
            brisem = terminiInicijalno;
            
             DodajPaketFrm pk = new DodajPaketFrm("update", paket, tblP, brisem);
        
        JDialog dialog = new JDialog(this, "Izmeni paket");
            dialog.add(pk);
            dialog.pack();
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
    }//GEN-LAST:event_jbtIzmeniPaketActionPerformed

    private void jbtPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPretraziActionPerformed
        // TODO add your handling code here:
        String pretraga = jtxtPretraga.getText();
        try {
            List<AbstractObjekat> pretplate = Kontroler.vratiKontrolera().pretraziPakete(pretraga);
            tblP.resetTabele(pretplate);
            if (tblP.vratiListu().size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Ne postoji paket po "
                        + "zadatoj vrednosti!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Postoje paketi po "
                        + "zadatoj vrednosti!", "Poruka", JOptionPane.INFORMATION_MESSAGE, null);
                
//                
//                JOptionPane.showMessageDialog(rootPane, "Član nije obrisan! "
//                        , "Greška!", JOptionPane.ERROR_MESSAGE, null);
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtPretraziActionPerformed

    private void jbtResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetujActionPerformed
        try {
            // TODO add your handling code here:
            List<AbstractObjekat> pretplate = Kontroler.vratiKontrolera().vratiSvePakete();
            tblP.resetTabele(pretplate);
        } catch (IOException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtResetujActionPerformed

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
            java.util.logging.Logger.getLogger(PaketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlijentStart().start();
                new PaketFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtDodajPaket;
    private javax.swing.JButton jbtIzmeniPaket;
    private javax.swing.JButton jbtPretrazi;
    private javax.swing.JButton jbtResetuj;
    private javax.swing.JTable jtblPaketii;
    private javax.swing.JTextField jtxtPretraga;
    // End of variables declaration//GEN-END:variables

    private void srediTabele() {
        List<AbstractObjekat> paketi;
        try {
            paketi = Kontroler.vratiKontrolera().vratiSvePakete();
            tblP = new TblModelPaket(paketi);
            jtblPaketii.setModel(tblP);
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaketFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
