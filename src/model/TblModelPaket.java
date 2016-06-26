/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;

import domen.Korisnik;
import domen.Paket;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vujke
 */
public class TblModelPaket extends AbstractTableModel {

    List<AbstractObjekat> paketi;
    String[] kolone = new String[]{"naziv", "cena"};

    public TblModelPaket(List<AbstractObjekat> paketi) {
        this.paketi = paketi;
    }

        
    @Override
    public int getRowCount() {
        return paketi.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paket paket = (Paket) paketi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return paket.getNaziv();
            case 1:
                return paket.getCena()+" RSD";
            default:
                return "n/a";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
        //return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void resetTabele(List<AbstractObjekat> paketi){
        this.paketi = paketi;
                fireTableDataChanged();
    }
    
    public AbstractObjekat vratiPaket(int red){
        return paketi.get(red);
    }

}
