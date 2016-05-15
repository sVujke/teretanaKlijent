/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import transfer.KlijentTransfer;
import transfer.ServerTransfer;

/**
 *
 * @author vujke
 */
public class Komunikacija {
    
    Socket soket;
    private static Komunikacija instanca;
    ObjectOutputStream out;
    ObjectInputStream in;
    
    public static Komunikacija vratiInstancu(){
        if(instanca == null){
            instanca = new Komunikacija();
        }
        return instanca;
    }
    
    public void setSocket(Socket soket) throws IOException{
        this.soket = soket;
        out = new ObjectOutputStream(this.soket.getOutputStream());
        in = new ObjectInputStream(this.soket.getInputStream());
    }
    
    public void posaljiZahtev(KlijentTransfer kt) throws IOException{
        out.writeObject(kt);
    }
    
    public ServerTransfer procitajOdgovor() throws IOException, ClassNotFoundException{
        return (ServerTransfer) in.readObject();
    }
}
