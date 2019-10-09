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
public class Running {
     public static void main(String[] args) {
        Komputer k = new Komputer("Asus", 5, 8, "intel i7");
        k.tampilData();
        Laptop l = new Laptop("Asus", 5, 8, "intel i7","tanam");
        l.tampilLaptop();
        Pc  pc = new Pc("MSI", 5, 16, "intel i8",14);
        pc.tampilPc();
        Mac mc = new Mac("Macbook", 5, 4, "intel i7","tanam","Full Security");
        mc.tampilMac();
        Windows wn = new Windows("Windows 10", 5, 4, "intel i7","tanam", "Windows Defender");
        wn.tampilWindows();
   }
}
