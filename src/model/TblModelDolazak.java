/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Dolazak;
import domen.Korisnik;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;

/**
 *
 * @author vujke
 */
public class TblModelDolazak extends AbstractTableModel{

    List<Dolazak> dolasci;
    String[] kolone = new String[]{"datum","smena","radni dan","član"};

    public TblModelDolazak(List<Dolazak> dolasci) {
        this.dolasci = dolasci;
    }
    
    
    @Override
    public int getRowCount() {
        return dolasci.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Dolazak dol = dolasci.get(rowIndex);
            switch(columnIndex){
                case 0: return dol.getDatum();
                case 1: return dol.getSmena();
                case 2: return daNe(dol.isRadniDan());
                case 3: return Kontroler.vratiKontrolera().vratiObjPoKljucu(dol.getClan().getClanId());
                default: return "n/a";
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }   } catch (IOException ex) {
            Logger.getLogger(TblModelDolazak.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TblModelDolazak.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "n/a";
}

    private String daNe(boolean radniDan) {
        if(radniDan == true) return "DA";
        return "NE";
    }
    
    public void dodajDolazak(Dolazak d){
        dolasci.add(d);
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
