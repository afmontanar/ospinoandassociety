/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldos;

import areas.ClasArea;
import javax.swing.JDialog;

/**
 *
 * @author adicnet
 */
public class pbHandler extends Thread{
    // Variables
//    private boolean life ;
    private int order;
    private int prog ;
    private javax.swing.JProgressBar progBar ;

    // Constructor
    public pbHandler(Object in){
        this.progBar = (javax.swing.JProgressBar) in ;
//        this.life = true ;
        this.prog = 0 ;        
    }

    // Methods
//    public void kill(){
//        this.life = false;
//    }
    public void cmd(int in){ // Setter
        this.order = in ;
    }
    public void run(){
        while( true ){            
            if(order == 1){
//                System.out.println("Thread running.." + this.prog);
                this.prog++;                
                this.progBar.setValue(this.prog);                
                try{
                    Thread.sleep(10); // 125 millisegundos
                }catch(Exception e){ e.printStackTrace(); System.out.println("Thread->Sleep problem:");}
            }
            if( this.prog == 100 ){
//                life = false ;
                   this.progBar.setValue(0);  
                   JDialog get = ClasArea.are.get("mainframex");
                   get.setVisible(false);
                   prog=0;
//                System.out.println("Thread ended..");
            }
        }
    }
}
