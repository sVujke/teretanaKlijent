/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Clan;
import domen.Termin;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;

/**
 *
 * @author vujke
 */
public class TblModelTermin extends AbstractTableModel {

    List<Termin> termini;
    String[] kolone = new String[]{"smena", "radni dan"};

    public TblModelTermin(List<Termin> termini) {
        this.termini = termini;
    }

    @Override
    public int getRowCount() {
        return termini.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Termin termin = termini.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return termin.getSmena();
            case 1:
                return vratiDaNe(termin.isRadniDan());
            default:
                return "n/a";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

    public void napraviRed() {
        Termin t = new Termin();
        //Predmet p = new Predmet(0, "ImePredmeta", 0, 0);
        t.setId("0");
        // t.setRadniDan(true);
        t.setSmena("odaberi smenu");
//        t.setPaket(paket);
//        t.setPredmet(p);
        termini.add(t);
        fireTableDataChanged();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void izbaci(int red) {
        termini.remove(red);
        fireTableDataChanged();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Termin> vratiListuTermina() {
        return termini;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {

            Termin t = termini.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    t.setSmena((String) aValue);

                case 1:
                    t.setRadniDan(dajMuBool((String) aValue));
            }
        } catch (Exception e) {

        }

    }

    private boolean dajMuBool(String string) {
        if (string.equals("DA")) {
            return true;
        }

        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
       // return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    private Object vratiDaNe(boolean radniDan) {
        if(radniDan == true){
            return "DA";
        }
        
        return "NE";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void resetTabele(List<AbstractObjekat> absTerm) {
        termini.clear();
        for (AbstractObjekat abs : absTerm) {
            Termin ter = (Termin) abs;
            
            termini.add(ter);
        }
        
        fireTableDataChanged();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Termin> vratiListu() {
        return termini;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
