/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.AbstractObjekat;
import domen.Clan;
import domen.Mesto;
import domen.Paket;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import model.TblModelClan;

/**
 *
 * @author vujke
 */
public class DodajClanaFrm extends javax.swing.JPanel {
    String mode;
    TblModelClan tbl;
    /**
     * Creates new form DodajClanaFrm
     */
    public DodajClanaFrm(TblModelClan tbl) throws IOException, ClassNotFoundException {
        initComponents();
        srediComboBox();
        this.tbl = tbl;
    }
    
    public DodajClanaFrm(TblModelClan tbl, String mode, Clan clan, Paket paket) throws IOException, ClassNotFoundException {
        initComponents();
        srediComboBoxUpdate(clan.getMesto(), paket);
        this.mode = mode;
         this.tbl = tbl;
        jbtDodaj.setText("Izmeni člana");
        jtxtIme.setText(clan.getIme());
        jtxtPrezime.setText(clan.getPrezime());
        jtxtEmail.setText(clan.getEmail());
        jtxtTelefon.setText(clan.getTelefon());
        jtxtAdresa.setText(clan.getAdresa());
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtIme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtPrezime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtTelefon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtAdresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbMesto = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jcbPaket = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jbtDodaj = new javax.swing.JButton();

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefon:");

        jLabel5.setText("Adresa:");

        jLabel6.setText("Mesto:");

        jcbPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaketActionPerformed(evt);
            }
        });

        jLabel7.setText("Paket usluga:");

        jbtDodaj.setText("Dodaj člana");
        jbtDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbPaket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbMesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jbtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbtDodaj)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPaketActionPerformed

    private void jbtDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDodajActionPerformed
        // TODO add your handling code here:
        
        String ime = jtxtIme.getText().trim();
        String prezime = jtxtPrezime.getText().trim();
        String email = jtxtEmail.getText().trim();
        String tel = jtxtTelefon.getText().trim();
        String adresa = jtxtAdresa.getText().trim();
        
        
        if(ime.length()==0){
            JOptionPane.showMessageDialog(jcbPaket, "Nije uneto ime člana!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        if(prezime.length()==0){
            JOptionPane.showMessageDialog(jcbPaket, "Nije uneto prezime clana!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        if(email.length()==0){
            JOptionPane.showMessageDialog(jcbPaket, "Nije uneta e-mal adresa!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        if(tel.length()==0){
            JOptionPane.showMessageDialog(jcbPaket, "Nije unet telefon!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        if(adresa.length()==0){
            JOptionPane.showMessageDialog(jcbPaket, "Nije uneta adresa!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        String validacijaTelefona = "+0123456789";
        if(!validanBroj(validacijaTelefona,tel)){
            JOptionPane.showMessageDialog(jcbPaket, "Nije unet validan broj telefona!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        if(!validanEmail(email)){
           JOptionPane.showMessageDialog(jcbPaket, "Nije unet validan e-mail!"
                    , "Greška!", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        Mesto mesto = (Mesto) jcbMesto.getSelectedItem();
        Paket paket = (Paket) jcbPaket.getSelectedItem();
        Clan clan = new Clan(null,ime, prezime, email, adresa, tel, mesto);
        List<Object> parametri = new ArrayList<>();
        parametri.add(clan);
        parametri.add(paket);
        try {
            Kontroler.vratiKontrolera().zapamtiClana(parametri);
            List<AbstractObjekat> clList = Kontroler.vratiKontrolera().vratiListuClanova();
            tbl.filterForme(clList);
        } catch (IOException ex) {
            Logger.getLogger(DodajClanaFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DodajClanaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtDodajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtDodaj;
    private javax.swing.JComboBox jcbMesto;
    private javax.swing.JComboBox jcbPaket;
    private javax.swing.JTextField jtxtAdresa;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIme;
    private javax.swing.JTextField jtxtPrezime;
    private javax.swing.JTextField jtxtTelefon;
    // End of variables declaration//GEN-END:variables

    private boolean validanBroj(String validacijaTelefona, String tel) {
        
        if(tel.length()<7){
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if(!validacijaTelefona.contains(tel.charAt(i)+"")){
                return false;
            }
        }
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean validanEmail(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void srediComboBox() throws IOException, ClassNotFoundException {
        //List<AbstractObjekat> lm = new ArrayList<>();
        List<AbstractObjekat> mesta = new ArrayList<>();
        List<AbstractObjekat> paketi = new ArrayList<>();
        
                //(List<AbstractObjekat>) kontroler.vratiSvaMesta();
                System.out.println("doslodo mesta");
        mesta = Kontroler.vratiKontrolera().vratiSvaMesta();
        System.out.println("Proslo mesta");
        paketi = Kontroler.vratiKontrolera().vratiSvePakete();
        System.out.println("Proslo pakete");
        //paketi = Kontroler.vratiKontrolera();
       // List<Mesto> listaMesta = (Mesto) mesta;
        //lm = k.vratiSvaMesta();
         for (AbstractObjekat m : mesta) {
            jcbMesto.addItem(m);
        }
         
         for (AbstractObjekat p : paketi) {
            jcbPaket.addItem(p);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void srediComboBoxUpdate(Mesto mesto, Paket paket) {
        try {
            List<AbstractObjekat> mesta = new ArrayList<>();
            List<AbstractObjekat> paketi = new ArrayList<>();
//            jcbMesto.addItem(mesto);
            
            //(List<AbstractObjekat>) kontroler.vratiSvaMesta();
            System.out.println("doslodo mesta");
            mesta = Kontroler.vratiKontrolera().vratiSvaMesta();
            System.out.println("Proslo mesta");
            paketi = Kontroler.vratiKontrolera().vratiSvePakete();
            System.out.println("Proslo pakete");
            //paketi = Kontroler.vratiKontrolera();
            // List<Mesto> listaMesta = (Mesto) mesta;
            //lm = k.vratiSvaMesta();
            jcbMesto.setModel(new DefaultComboBoxModel(mesta.toArray()));
            jcbPaket.setModel(new DefaultComboBoxModel(paketi.toArray()));
            
            jcbMesto.setSelectedItem(mesto);
            System.out.println(paket);
            jcbPaket.setSelectedItem(paket);
//            for (AbstractObjekat m : mesta) {
//                jcbMesto.addItem(m);
//            }
            
//            for (AbstractObjekat p : paketi) {
//                jcbPaket.addItem(p);
//            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(DodajClanaFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DodajClanaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
