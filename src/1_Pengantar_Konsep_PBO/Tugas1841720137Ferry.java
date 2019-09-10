package sepedademo;

public class Tugas1841720137Ferry extends Sepeda1841720137Ferry
{
    private String hargaMobil;
    
     public void hargaMobilFerry(String newValue){
        hargaMobil = newValue;
    }
    
    public void cetakStatusFerry(){
        super.cetakStatusFerry();
        System.out.println("Harga :" +hargaMobil);
    }
}
