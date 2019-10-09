package Pbo3;

public class KoperasiDemo {

    public static void main(String[] args) {
        Anggota1841720137Ferry anggota1 = new Anggota1841720137Ferry("Ferry", "Jl.semanggi");
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());

        anggota1.setNama("Ferry");
        anggota1.setAlamat("jl.Pisang Kipas no 16a");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ":Rp" + anggota1.getSimpanan());
    }
}
