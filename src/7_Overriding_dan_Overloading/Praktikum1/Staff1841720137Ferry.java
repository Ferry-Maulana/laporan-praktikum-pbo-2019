package Praktikum1;

/**
 *
 * @author owner
 */
public class Staff1841720137Ferry extends Karyawan1841720137Ferry {
    private int lembur;
    private double gajiLembur;
    
    public void setLemburFerry(int lembur)
    {
        this.lembur=lembur;
    }
    public int getLembur()
    {
        return lembur;
    }
    public void setGajiLemburFerry(double gajiLembur)
    {
        this.gajiLembur=gajiLembur;
    }
    public double getGajiLembur()
    {
        return gajiLembur;
    }
    public double getGaji(int lembur,double gajiLembur)
    {
        return super.getGaji()+lembur*gajiLembur;
    }
    public double getGaji()
    {
        return super.getGaji()+lembur*gajiLembur;
    }
    public void lihatInfo()
    {
        System.out.println("NIP :"+this.getNip());
        System.out.println("Nama :"+this.getNama());
        System.out.println("Golongan :"+this.getGolongan());
        System.out.println("Jml Lembur :"+this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGajiLembur());
        System.out.printf("Gaji :%.0f\n",this.getGaji());
    }
}
