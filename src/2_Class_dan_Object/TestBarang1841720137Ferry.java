
package Pbo2;

public class TestBarang1841720137Ferry {
    public static void main(String[] args) {
        Barang1841720137Ferry brg1=new Barang1841720137Ferry();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        
        System.out.println("Stok Baru adalah "+ brg1.tambahStok(20));
    }
}
