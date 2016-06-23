/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.AbstractObjekat;
import domen.Clan;
import domen.Dolazak;
import domen.Korisnik;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import komunikacija.Komunikacija;
import transfer.KlijentTransfer;
import transfer.ServerTransfer;

/**
 *
 * @author vujke
 */
public class Kontroler {
    
    private static Kontroler instance;
    
    public static Kontroler vratiKontrolera(){
        if(instance == null){
            instance = new Kontroler();
        }
        return instance;
    }

   
    
    Komunikacija kom = Komunikacija.vratiInstancu();
    
   public List<AbstractObjekat> vratiSvaMesta() throws IOException, ClassNotFoundException{
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.VRATI_LISTU_MESTA);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
   }
   
   public List<AbstractObjekat> vratiSvePakete() throws IOException, ClassNotFoundException{
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.VRATI_LISTU_PAKETA);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
   }
   
    public Korisnik prijaviKorisnika(Korisnik k) throws IOException, ClassNotFoundException {
        KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.PRIJAVI_KORISNIKA);
        kt.setParametar(k);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();  
            //System.out.println("evo me u kont klijenta 1 ");
        if(st.getUspesnostOperacije() == 1){
            //System.out.println("evo me u kont klijenta 2");
           return (Korisnik) (st.getPodaci());
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public AbstractObjekat zapamtiClana(AbstractObjekat clan) throws IOException, ClassNotFoundException{
        KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.ZAPAMTI_CLANA);
        kt.setParametar(clan);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();
        if(st.getUspesnostOperacije() == 1){
            //System.out.println("evo me u kont klijenta 2");
           return (Korisnik) (st.getPodaci());
       } else {
           return null;
       }
    }
    
    public AbstractObjekat obrisiClana(AbstractObjekat clan) throws IOException, ClassNotFoundException{
         KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.OBRISI_CLANA);
        kt.setParametar(clan);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();
        if(st.getUspesnostOperacije() == 1){
            //System.out.println("evo me u kont klijenta 2");
           return (Clan) (st.getPodaci());
       } else {
           return null;
       }
    }

    public List<AbstractObjekat> vratiListuKorisnika() throws IOException, ClassNotFoundException {
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.VRATI_LISTU_KORISNIKA);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public AbstractObjekat zapamtiKorisnika(AbstractObjekat korisnik) throws IOException, ClassNotFoundException{
        KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.ZAPAMTI_KORISNIKA);
        kt.setParametar(korisnik);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();
        if(st.getUspesnostOperacije() == 1){
            //System.out.println("evo me u kont klijenta 2");
           return (Korisnik) (st.getPodaci());
       } else {
           return null;
       }
    }
    
      public AbstractObjekat obrisiKorisnika(AbstractObjekat korisnik) throws IOException, ClassNotFoundException{
        KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.OBRISI_KORISNIKA);
        kt.setParametar(korisnik);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();
        if(st.getUspesnostOperacije() == 1){
            //System.out.println("evo me u kont klijenta 2");
           return (AbstractObjekat) (st.getPodaci());
       } else {
           return null;
       }
    }

    public List<AbstractObjekat> vratiListuClanova() throws IOException, ClassNotFoundException {
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.VRATI_LISTU_CLANOVA);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AbstractObjekat vratiObjPoKljucu(String id) throws IOException, ClassNotFoundException {
        
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(konstante.Konstante.VRATI_CLANA_PK);
            kt.setParametar(id);
            kom.posaljiZahtev(kt);
            ServerTransfer st = kom.procitajOdgovor();
            
            if(st.getUspesnostOperacije() == 1){
                return (AbstractObjekat) st.getPodaci();
            } else {
                return null;
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public List<AbstractObjekat> vratiListuDolazaka() throws IOException, ClassNotFoundException {
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.VRATI_LISTU_DOLAZAKA);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<AbstractObjekat> pretraziClanove(String pretraga) throws IOException, ClassNotFoundException {
       KlijentTransfer kt = new KlijentTransfer();
       kt.setOperacija(konstante.Konstante.PRETRAZI_CLANOVE);
       kt.setParametar(pretraga);
       kom.posaljiZahtev(kt);
       ServerTransfer st = kom.procitajOdgovor();
       
       if(st.getUspesnostOperacije() == 1){
           return (List<AbstractObjekat>) st.getPodaci();
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
