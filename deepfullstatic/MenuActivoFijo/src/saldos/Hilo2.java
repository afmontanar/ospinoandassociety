/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldos;

import areas.ClasArea;
import java.awt.Frame;
import javax.swing.JDialog;


/**
 *
 * @author Noel Acevedo
 */

public class Hilo2 extends Thread{
    boolean milis;
    private Frame po;

    public Hilo2(boolean milis,Frame po) {
        this.milis = milis;
        this.po = po;
    }
    
    public void run(){
        if(milis){
//            mainFrame mainFrame = new mainFrame(po, milis);
//            mainFrame.setVi
            JDialog get = ClasArea.are.get("mainframex");
            get.setVisible(true);
        }
    }
}
