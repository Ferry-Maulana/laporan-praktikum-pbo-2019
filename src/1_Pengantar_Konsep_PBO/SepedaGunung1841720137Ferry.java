package sepedademo;

public class SepedaGunung1841720137Ferry extends Sepeda1841720137Ferry
{
    private String tipeSuspensi;
    
     public void setTipeSuspensiFerry(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void cetakStatusFerry(){
        super.cetakStatusFerry();
        System.out.println("Tipe suspensi" +tipeSuspensi);
    }
}
