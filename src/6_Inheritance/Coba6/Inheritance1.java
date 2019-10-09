/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

/**
 *
 * @author owner
 */
public class Inheritance1 {
    public static void main(String[] args) {
       StaffTetap st = new StaffTetap("Budi","Malang","Laki-laki",20, 2000000, 250000, 200000, "2A",100000);
       st.tampilStaffTetap();
       
       StaffHarian sh = new StaffHarian("indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
       sh.tampilStaffHarian();
    }
}
