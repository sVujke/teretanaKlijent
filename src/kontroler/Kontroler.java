/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.AbstractObjekat;
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
    
   
}
