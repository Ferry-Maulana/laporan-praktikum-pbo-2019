
package Pbo3;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnggotaTugas donny = new AnggotaTugas("111333444","Donny",5000000);
        
        System.out.println("Nama Anggota    : "+donny.getNama());
        System.out.println("Limit Pinjaman  : "+donny.getLmtPeminjaman());
        System.out.println();
        
        System.out.print("Masukan pinjaman ke-1: ");
        int p1=sc.nextInt();
        donny.pinjam(p1);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJmlhPinjaman());
        System.out.println();
        
        System.out.print("Masukan pinjaman ke-2: ");
        int p2=sc.nextInt();
        donny.pinjam(p2);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJmlhPinjaman());
        System.out.println();
        
        System.out.print("Masukan angsuran ke-1: ");
        int a=sc.nextInt();
        donny.angsur(a);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJmlhPinjaman());
        System.out.println();
        
        System.out.print("Masukan angsuran ke-2:");
        int a2=sc.nextInt();
        donny.angsur(a2);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJmlhPinjaman());
    }
}


