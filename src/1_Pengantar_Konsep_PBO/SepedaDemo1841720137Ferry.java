package sepedademo;

public class SepedaDemo1841720137Ferry {

    public static void main(String[] args) {
        
        Sepeda1841720137Ferry spd1 = new Sepeda1841720137Ferry();
        Sepeda1841720137Ferry spd2 = new Sepeda1841720137Ferry();
        SepedaGunung1841720137Ferry spd3 = new SepedaGunung1841720137Ferry();
        
        spd1.setMerekFerry("Polygon");
        spd1.tambahKecepatanFerry(10);
        spd1.gantiGearFerry(2);
        spd1.cetakStatusFerry();
        
        spd2.setMerekFerry("Wiim Cycle");
        spd2.tambahKecepatanFerry(10);
        spd2.gantiGearFerry(2);
        spd2.tambahKecepatanFerry(10);
        spd2.gantiGearFerry(2);
        spd2.cetakStatusFerry();
        
        spd3.setMerekFerry("Klinee");
        spd3.tambahKecepatanFerry(5);
        spd3.gantiGearFerry(7);
        spd3.setTipeSuspensiFerry("Gas suspension");
        spd3.cetakStatusFerry();
        
        
    }
    
}
