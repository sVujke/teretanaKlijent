/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Clan;
import domen.Dolazak;
import domen.Pretplata;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vujke
 */
public class TblModelPretplata extends AbstractTableModel{
    
    List<AbstractObjekat> pretplate;
    String[] kolone = new String[]{"datum","clan","paket","iznos"};
    //List<AbstractObjekat> listaIp;
//    List<AbstractObjekat> paketi;
//    List<AbstractObjekat> clanovi;

    public TblModelPretplata(List<AbstractObjekat> pretplate) {
        this.pretplate = pretplate;
//        this.paketi = paketi;
//        this.clanovi = clanovi;
    }
    
    
    
    @Override
    public int getRowCount() {
        return pretplate.size();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        System.out.println(pretplate.get(rowIndex).getClass());
        if(pretplate.get(rowIndex).getClass().equals(Clan.class)){
            
            Clan c = (Clan) pretplate.get(rowIndex);
            System.out.println(c);
        }
        Pretplata p = (Pretplata) pretplate.get(rowIndex);
            switch(columnIndex){
                case 0: return ulepsajDatum(p.getDatum());
                case 1: return p.getClan();
                case 2: return p.getPaket();
                case 3: return p.getPaket().getCena();
                default: return "n/a";
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    private Object ulepsajDatum(Date datum) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy.");
        Date date = datum;
        return dateFormat.format(date);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void resetTabele() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void resetTabele(List<AbstractObjekat> pretplate) {
        this.pretplate = pretplate; 
        fireTableDataChanged();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
