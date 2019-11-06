/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10;

public class Tester41841720137Ferry {
    public static void main(String[] args) {
       Owner1841720137Ferry ow = new Owner1841720137Ferry();
       ElectricityBill1841720137Ferry eBill = new ElectricityBill1841720137Ferry(5, "R-1");
       ow.pay(eBill);
       System.out.println("-----------------------------");
       
       PermanentEmployee1841720137Ferry pEmp = new PermanentEmployee1841720137Ferry("Dedik", 500);
       ow.pay(pEmp);
       System.out.println("-----------------------------");
       
       InternshipEmployee1841720137Ferry iEmp = new InternshipEmployee1841720137Ferry("Sunarto", 5);
       ow.showMyEmployee(pEmp);
       System.out.println("-----------------------------");
       ow.showMyEmployee(iEmp);
    }
    
}
