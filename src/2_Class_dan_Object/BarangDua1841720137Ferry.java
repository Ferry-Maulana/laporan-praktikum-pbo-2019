
package Pbo2;

public class BarangDua1841720137Ferry {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public void tampilBarang() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);

    }

    public int hargaBarang(int hr) {
        return hargaDasar = hr;
    }

    public float diskon(float ds) {
        return diskon = ds;
    }

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar / 100));

    }
}
