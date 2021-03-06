/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.AbstractObjekat;
import domen.Clan;
import domen.IstorijatPaketa;
import domen.Mesto;
import domen.Paket;
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
        jbtIstorijatPaketa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtPretrazi = new javax.swing.JButton();
        jtxtPretraga = new javax.swing.JTextField();
        jbtReset = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jbtIstorijatPaketa.setText("Istorijat člana");
        jbtIstorijatPaketa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIstorijatPaketaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtIstorijatPaketa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtIzbriši, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jbtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbtIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbtIzbriši, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbtIstorijatPaketa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtPretrazi.setText("Pretraži");
        jbtPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPretraziActionPerformed(evt);
            }
        });

        jbtReset.setText("Resetuj tabelu");
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jtxtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jbtReset))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addGap(29, 29, 29))
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

        try {
            List<AbstractObjekat> clanovi = Kontroler.vratiKontrolera().pretraziClanove(pretraga);
            tbl.filterForme(clanovi);
            if (tbl.vratiListu().size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Ne postoji član po "
                        + "zadatoj vrednosti!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Postoje članovi po "
                        + "zadatoj vrednosti!", "Poruka", JOptionPane.INFORMATION_MESSAGE, null);
                
//                
//                JOptionPane.showMessageDialog(rootPane, "Član nije obrisan! "
//                        , "Greška!", JOptionPane.ERROR_MESSAGE, null);
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtPretraziActionPerformed

    private void jbtDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDodajActionPerformed
        try {
            // TODO add your handling code here:
            DodajClanaFrm dodaj = new DodajClanaFrm(tbl);
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

        if (red == -1) {
            JOptionPane.showMessageDialog(rootPane, "Nije odabran član "
                    + "kojeg treba izmeniti!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }

        try {
//            Mesto mesto = tbl.vratiMesto(tbl.vratiClana(red).getMesto().getMestoid());
            // TODO add your handling code here:
            Paket p = (Paket) tbl.vratiPaket(tbl.vratiPaketId(tbl.vratiClana(red)));
            System.out.println(p);
            DodajClanaFrm dodaj = new DodajClanaFrm(tbl, "update", tbl.vratiClana(red), p);
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
        // TODO add your handling code here
        int red = jTable1.getSelectedRow();

        if (red == -1) {
            JOptionPane.showMessageDialog(rootPane, "Nije odabran član "
                    + "kojeg treba izbrisati!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }

        Clan clan = tbl.vratiClana(red);

        try {
            Clan obrisan = (Clan) Kontroler.vratiKontrolera().obrisiClana(clan);

            List<AbstractObjekat> clanovi = Kontroler.vratiKontrolera().vratiListuClanova();
            tbl.filterForme(clanovi);

            JOptionPane.showMessageDialog(rootPane, "Obrisan je član: "
                    + obrisan.getIme() + "", "Poruka", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtIzbrišiActionPerformed

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        try {
            // TODO add your handling code here:
            List<AbstractObjekat> clanovi = Kontroler.vratiKontrolera().vratiListuClanova();
            tbl.filterForme(clanovi);
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtResetActionPerformed

    private void jbtIstorijatPaketaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIstorijatPaketaActionPerformed
        // TODO add your handling code here:
        int red = jTable1.getSelectedRow();

        if (red == -1) {
            JOptionPane.showMessageDialog(rootPane, "Nije odabran član "
                    + "kojeg treba izbrisati!", "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }

        Clan clan = tbl.vratiClana(red);

        List<AbstractObjekat> paketi;
        try {
            paketi = Kontroler.vratiKontrolera().vratiSvePakete();
            List<AbstractObjekat> lip = Kontroler.vratiKontrolera().vratiListuIP();
            List<AbstractObjekat> ip = new ArrayList<>();
            for (AbstractObjekat abs : lip) {
                IstorijatPaketa istoP = (IstorijatPaketa) abs;
                if (istoP.getClan().equals(clan)) {
                    ip.add(abs);
                }
            }

            IstorijatPaketaFrm f = new IstorijatPaketaFrm(clan, ip, paketi);

            JDialog dialog = new JDialog(this, "Istorijat člana");
            dialog.add(f);
            dialog.pack();
            dialog.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jbtIstorijatPaketaActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtDodaj;
    private javax.swing.JButton jbtIstorijatPaketa;
    private javax.swing.JButton jbtIzbriši;
    private javax.swing.JButton jbtIzmeni;
    private javax.swing.JButton jbtPretrazi;
    private javax.swing.JButton jbtReset;
    private javax.swing.JTextField jtxtPretraga;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {
        try {

            List<AbstractObjekat> clanovi;
            List<AbstractObjekat> mesta;
            List<AbstractObjekat> listaIp;
            List<AbstractObjekat> paketi;
            //System.out.println("korisniciBaza");

            //System.out.println("pre vratiListuKorisnika");
            clanovi = Kontroler.vratiKontrolera().vratiListuClanova();

            mesta = Kontroler.vratiKontrolera().vratiSvaMesta();

            listaIp = Kontroler.vratiKontrolera().vratiListuIP();

            paketi = Kontroler.vratiKontrolera().vratiSvePakete();

            tbl = new TblModelClan(clanovi, mesta, listaIp, paketi);
            //System.out.println("posle vratiListuKorisnika");
//            for (AbstractObjekat ao : clanovi) {
//                Clan m = (Clan) ao;
//                //System.out.println(m);
//                tbl.dodajUTabelu(m);
//                //System.out.println("dodat");
//            }

            jTable1.setModel(tbl);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClanFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
