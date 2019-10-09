/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author owner
 */
public class Pc extends Komputer{
   public int ukMonitor;

    public Pc() {
    }

    public Pc(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, int ukMonitor) {
        super
        (merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukMonitor = ukMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("Ukuran monitor : "
                +ukMonitor);
    } 
}
