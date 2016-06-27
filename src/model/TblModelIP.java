/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Clan;
import domen.IstorijatPaketa;
import domen.Paket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vujke
 */
public class TblModelIP extends AbstractTableModel {
//    List<AbstractObjekat> clanovi;
    String[] kolone = new String[]{"status","datum odabira","paket"};
    List<AbstractObjekat> listaIp;
    List<AbstractObjekat> paketi;
//    Clan

    public TblModelIP( List<AbstractObjekat> listaIp, List<AbstractObjekat> paketi) {
//        this.clanovi = clanovi;
        this.listaIp = listaIp;
        this.paketi = paketi;
    }
    
    
    @Override
    public int getRowCount() {
        return listaIp.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        IstorijatPaketa ip = (IstorijatPaketa) listaIp.get(rowIndex);
        switch(columnIndex){
            case 0: return vratiAN(ip.isAktivan());
            case 1: return ulepsajDatum(ip.getDatumOdabira());
            case 2: return ip.getPaket();
            default: return "n/a";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object vratiAN(boolean aktivan) {
        if(aktivan == true){
            return "AKTIVAN";
        }
        
        return "neaktivan";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object ulepsajDatum(Date datumOdabira) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy.");
        Date date = datumOdabira;
        return dateFormat.format(date);
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object vratiPaketId(Clan clan) {
        for (AbstractObjekat abs : listaIp) {
            //System.out.println("Clan: "+clan.vratiVrednostiPK());
            //System.out.println(clan.vratiParametre());
            
            IstorijatPaketa lip = (IstorijatPaketa) abs;
            System.out.println("LIP: "+lip);
            System.out.println("akt: "+lip.isAktivan());
            System.out.println("1: " +lip.getClan().getClanId());
            System.out.println("2: "+ clan.getClanId());
            if(clan.equals(lip.getClan()) &&
                    (lip.isAktivan() == true)){
                return lip.getPaket().getPaketId();
            }
           // System.out.println("nema");
        }
        
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object vratiPaket(Object vratiPaketId) {
        for (AbstractObjekat abs : paketi) {
            Paket p = (Paket) abs;
            if(p.getPaketId().equals(vratiPaketId)){
                return p;
            }
        }
        
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
