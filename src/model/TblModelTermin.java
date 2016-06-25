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

/**
 *
 * @author vujke
 */
public class TblModelTermin extends AbstractTableModel{

    List<AbstractObjekat> termini;
    String[] kolone = new String[]{"smena", "radni dan"};

    public TblModelTermin(List<AbstractObjekat> termini) {
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
        Termin termin = (Termin) termini.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return termin.getSmena();
            case 1:
                return termin.isRadniDan(); 
            default:
                return "n/a";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
