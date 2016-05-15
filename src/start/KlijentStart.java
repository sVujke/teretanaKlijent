/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import komunikacija.Komunikacija;

/**
 *
 * @author vujke
 */
public class KlijentStart extends Thread {

    @Override
    public void run() {
        try {
            Socket soket = new Socket("localhost",9000);
            Komunikacija.vratiInstancu().setSocket(soket);
// super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
}
