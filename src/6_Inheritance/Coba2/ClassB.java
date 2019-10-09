/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author owner
 */
public class ClassB extends ClassA{
    private int z;
    
    public void setZ(int z){
        this.z = z;
    }
    public void getNilaiz(){
        System.out.println("nilai z: "+z);
    }
    public void getJumlah(){
        System.out.println("jumlah: "+(x+y+z));
    }
}
