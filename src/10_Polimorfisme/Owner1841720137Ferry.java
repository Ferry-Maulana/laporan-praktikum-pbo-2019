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
public class Owner1841720137Ferry {
    public void pay (Payable1841720137Ferry p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720137Ferry){
            ElectricityBill1841720137Ferry eb = (ElectricityBill1841720137Ferry) p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1841720137Ferry){
            PermanentEmployee1841720137Ferry pe = (PermanentEmployee1841720137Ferry) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720137Ferry e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1841720137Ferry)
            System.out.println("You have to pay her/him montly!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
