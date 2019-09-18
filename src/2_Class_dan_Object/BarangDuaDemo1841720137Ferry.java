
package Pbo2;

public class BarangDuaDemo1841720137Ferry {
    public static void main(String[]args){
        BarangDua1841720137Ferry br = new BarangDua1841720137Ferry();

        br.kode = "QWERTY";
        br.namaBarang = "Handphone Samsung";
        br.hargaDasar = 1500000;
        br.diskon(10);
        br.tampilBarang();
        System.out.println("Total Harga : " + br.hitungHargaJual());
    }
}
