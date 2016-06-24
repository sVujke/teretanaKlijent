/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Clan;
import domen.IstorijatPaketa;
import domen.Mesto;
import domen.Paket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vujke
 */
public class TblModelClanMini extends AbstractTableModel {

   List<AbstractObjekat> clanovi;
    String[] kolone = new String[]{"ime i prezime","e-mail","paket"};
    //List<AbstractObjekat> mesta = new ArrayList<>();
    List<AbstractObjekat> listaIp;
    List<AbstractObjekat> paketi;
    String imePrezime;
    
    public TblModelClanMini(List<AbstractObjekat> clanovi, List<AbstractObjekat> listaIp, List<AbstractObjekat> paketi) {
        this.clanovi = clanovi;
        //this.mesta = mesta;
        this.listaIp = listaIp;
        this.paketi = paketi;
    }
    
    @Override
    public int getRowCount() {
        return clanovi.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Clan clan = (Clan) clanovi.get(rowIndex);
        Clan clan = (Clan) clanovi.get(rowIndex);
        imePrezime = clan.getIme()+" "+clan.getPrezime();
        switch(columnIndex){
            
            case 0: return imePrezime;
            case 1: return clan.getEmail();
            case 2: return vratiPaket(vratiPaketId(clan));
            default: return "n/a";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getColumnName(int column) {
        return kolone[column];//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

    public void dodajUTabelu(Clan m) {
        clanovi.add(m);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    public Clan vratiClana(int rowIndex){
        return (Clan) clanovi.get(rowIndex);
    }

    

    public void filterForme(List<AbstractObjekat> clanovi) {
        this.clanovi = clanovi;
        fireTableDataChanged();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Object vratiPaket(Object vratiPaketId) {
        for (AbstractObjekat abs : paketi) {
            Paket p = (Paket) abs;
            if(p.getPaketId().equals(vratiPaketId)){
                return p;
            }
        }
        
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
