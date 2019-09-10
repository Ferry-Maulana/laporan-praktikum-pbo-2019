
package sepedademo;

public class Sepeda1841720137Ferry
{
    private String mMerek;
    private String mWarna;
    private int mKecepatan;
    private int mGear;
    
    
    public void setMerekFerry(String newValue){
        mMerek = newValue;
    }
    
    public void setWarnaFerry(String newValue){
        mWarna = newValue;
    }
    
    public void gantiGearFerry(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanFerry(int plus){
        mKecepatan = mKecepatan + plus;
    }
    
    public void remFerry(int min){
        mKecepatan = mKecepatan - min;
    }
    
    public void cetakStatusFerry(){
        System.out.println("Merek: " + mMerek);
        System.out.println("Kecepatan: " + mKecepatan + "km/h");
        System.out.println("Gear:" + mGear);
        System.out.println("Warna: "+mWarna);
    }
}
