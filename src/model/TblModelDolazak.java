/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Dolazak;
import domen.Korisnik;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    List<AbstractObjekat> dolasci;
    String[] kolone = new String[]{"datum","smena","radni dan","član"};

    public TblModelDolazak(List<AbstractObjekat> dolasci) {
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
        
            Dolazak dol = (Dolazak) dolasci.get(rowIndex);
            switch(columnIndex){
                case 0: return ulepsajDatum(dol.getDatum());
                case 1: return dol.getSmena();
                case 2: return daNe(dol.isRadniDan());
                case 3: return dol.getClan();
                default: return "n/a";
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }  
    //return "n/a";
}

    private String daNe(boolean radniDan) {
        if(radniDan == true) return "DA";
        return "NE";
    }
    
    public void dodajDolazak(Dolazak d){
        dolasci.add(d);
    }
    
    
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public String getColumnName(int column) {
        return kolone[column];//super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

    private Object ulepsajDatum(Date datum) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date = datum;
        return dateFormat.format(date);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
