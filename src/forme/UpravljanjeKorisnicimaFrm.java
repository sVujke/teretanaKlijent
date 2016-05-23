/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.AbstractObjekat;
import domen.Korisnik;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import model.TblModelKorisnik;

/**
 *
 * @author vujke
 */
public class UpravljanjeKorisnicimaFrm extends javax.swing.JFrame {
    
    TblModelKorisnik tbl;
    /**
     * Creates new form UpravljanjeKorisnicimaFrm
     */
    public UpravljanjeKorisnicimaFrm() {
        initComponents();
        System.out.println("Sredi tabelu sledi");
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
        jbtDodaj = new javax.swing.JToggleButton();
        jbtIzbrisi = new javax.swing.JToggleButton();
        jbtSacuvaj = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jbtDodaj.setText("Dodaj korinsika");
        jbtDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDodajActionPerformed(evt);
            }
        });

        jbtIzbrisi.setText("Izbrisi korisnika");
        jbtIzbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIzbrisiActionPerformed(evt);
            }
        });

        jbtSacuvaj.setText("Sačuvaj promene");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Korisnici aplikacije");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtDodaj)
                        .addGap(35, 35, 35)
                        .addComponent(jbtIzbrisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSacuvaj))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDodajActionPerformed
        // TODO add your handling code here:
         DodajKorisnikaFrm frm = new DodajKorisnikaFrm(tbl);
         JDialog dialog = new JDialog(this, "Dodaj korisnika");
         dialog.add(frm);
         dialog.pack();
         dialog.setVisible(true);
    }//GEN-LAST:event_jbtDodajActionPerformed

    private void jbtIzbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIzbrisiActionPerformed
        try {
            // TODO add your handling code here:
            int red = jTable1.getSelectedRow();
            Korisnik k = tbl.vratiListu().get(red);
            Kontroler.vratiKontrolera().obrisiKorisnika(k);
            //JOptionPane.showConfirmDialog(rootPane, "Obrisan je korisnik "+k.getIme());
            JOptionPane.showMessageDialog(rootPane, "Obrisan je korisnik "+k.getIme());
            tbl.izbaciIzListe(k);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Doslo je do greške pri brisanju.");
            Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtIzbrisiActionPerformed

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
            java.util.logging.Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpravljanjeKorisnicimaFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jbtDodaj;
    private javax.swing.JToggleButton jbtIzbrisi;
    private javax.swing.JToggleButton jbtSacuvaj;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu(){
        tbl = new TblModelKorisnik(new ArrayList<>());
        List<AbstractObjekat> korisniciBaza = new ArrayList<>();
        System.out.println("korisniciBaza");
        try {
            System.out.println("pre vratiListuKorisnika");
            korisniciBaza = Kontroler.vratiKontrolera().vratiListuKorisnika();
            System.out.println("posle vratiListuKorisnika");
            for (AbstractObjekat ao : korisniciBaza) {
            Korisnik m = (Korisnik) ao;
                System.out.println(m);
            tbl.dodajUTabelu(m);
            System.out.println("dodat");
        }
        } catch (IOException ex) {
            Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpravljanjeKorisnicimaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        jTable1.setModel(tbl);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
