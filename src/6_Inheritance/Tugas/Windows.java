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
public class Windows extends Laptop {
    public String fitur;

    public Windows() {
    
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBatrei, String fitur) {
        super
        (merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}
