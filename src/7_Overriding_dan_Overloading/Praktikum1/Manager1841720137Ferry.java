package Praktikum1;

/**
 *
 * @author owner
 */
public class Manager1841720137Ferry extends Karyawan1841720137Ferry{
    private double tunjangan;
    private String bagian;
    private Staff1841720137Ferry st[];
    
    public void setTunjanganFerry(double tunjangan)
    {
        this.tunjangan=tunjangan;
    }
    public double getTunjangan()
    {
        return tunjangan;
    }
    public void setBagianFerry(String bagian)
    {
        this.bagian=bagian;
    }
    public String getBagian()
    {
        return bagian;
    }
    public void setStaffFerry(Staff1841720137Ferry st[])
    {
        this.st=st;
    }
    
    public void viewStaff()
    {
        int i;
        System.out.println("---------------");
        for(i=0;i<st.length;i++)
        {
            st[i].lihatInfo();
        }
        System.out.println("---------------");
    }
    public void lihatInfoFerry()
    {
        System.out.println("Manager :"+this.getBagian());
        System.out.println("NIP :"+this.getNip());
        System.out.println("Nama :"+this.getNama());
        System.out.println("Golongan :"+this.getGolongan());
        System.out.printf("Tunjangan :%.0f\n",this.getTunjangan());
        System.out.printf("Gaji :%.0f\n",this.getGaji());
        System.out.println("Bagiam :"+this.getBagian());
        this.viewStaff();
    }
    public double getGaji()
    {
        return super.getGaji()+tunjangan;
    }
}
