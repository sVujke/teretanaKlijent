/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.AbstractObjekat;
import domen.Clan;
import domen.Mesto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vujke
 */
public class TblModelClan extends AbstractTableModel {
    
    List<Clan> clanovi;
    String[] kolone = new String[]{"ime","prezime","paket","e-mail","telefon","adresa","mesto"};
    List<AbstractObjekat> mesta = new ArrayList<>();
    
    public TblModelClan(List<Clan> clanovi, List<AbstractObjekat> mesta) {
        this.clanovi = clanovi;
        this.mesta = mesta;
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
        Clan clan = clanovi.get(rowIndex);
        switch(columnIndex){
            case 0: return clan.getIme();
            case 1: return clan.getPrezime();
            case 2: return "paket";
            case 3: return clan.getEmail();
            case 4: return clan.getTelefon();
            case 5: return clan.getAdresa();
            case 6: return  vratiNazivMesta(clan.getMesto().getMestoid());
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
    
    public String vratiNazivMesta(String id){
        
        for (AbstractObjekat mestoAb : mesta) {
            Mesto m = (Mesto) mestoAb;
            if(m.getMestoid().equals(id)){
                return m.getNaziv();
            }
        }
        
        return "N/A";
    }
    
    public Clan vratiClana(int rowIndex){
        return clanovi.get(rowIndex);
    }

    public Mesto vratiMesto(String mestoid) {
        for (AbstractObjekat mestoAb : mesta) {
            Mesto m = (Mesto) mestoAb;
            if(m.getMestoid().equals(mestoid)){
                return m;
            }
        }
        
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
