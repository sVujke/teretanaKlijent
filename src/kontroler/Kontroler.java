/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.AbstractObjekat;
import domen.Korisnik;
import java.io.IOException;
import java.util.List;
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
   
    public Korisnik prijaviKorisnika(Korisnik k) throws IOException, ClassNotFoundException {
        KlijentTransfer kt = new KlijentTransfer();
        kt.setOperacija(konstante.Konstante.PRIJAVI_KORISNIKA);
        kt.setParametar(k);
        kom.posaljiZahtev(kt);
        ServerTransfer st = kom.procitajOdgovor();  // izgleda da je ovde greska! 
            System.out.println("evo me u kont klijenta 1 ");
        if(st.getUspesnostOperacije() == 1){
            System.out.println("evo me u kont klijenta 2");
           return (Korisnik) (st.getPodaci());
       } else {
           return null;
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
   
}
