/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10;

/**
 *
 * @author owner
 */
public class Tester31841720137Ferry {
    public static void main(String[] args) {
     PermanentEmployee1841720137Ferry pEmp = new PermanentEmployee1841720137Ferry("Dedik", 500);
        InternshipEmployee1841720137Ferry iEmp = new InternshipEmployee1841720137Ferry("Sunarto", 5);
        ElectricityBill1841720137Ferry eBill = new ElectricityBill1841720137Ferry(5, "A-1");
        Employee1841720137Ferry e[] = {pEmp, iEmp};
        Payable1841720137Ferry p[] = {pEmp, eBill};
        Employee1841720137Ferry e2[] = {pEmp, iEmp };
    }
    
}
