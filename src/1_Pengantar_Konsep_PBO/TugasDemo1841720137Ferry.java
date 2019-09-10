
package sepedademo;

public class TugasDemo1841720137Ferry {
    public static void main(String[] args) {
        
        Tugas1841720137Ferry spd1 = new Tugas1841720137Ferry();
        Tugas1841720137Ferry spd2 = new Tugas1841720137Ferry();
        
        spd1.setMerekFerry("Mazda");
        spd1.tambahKecepatanFerry(10);
        spd1.setWarnaFerry("Putih");
        spd1.gantiGearFerry(4);
        spd1.hargaMobilFerry("200 Juta");
        spd1.cetakStatusFerry();
        
        spd2.setMerekFerry("Fortuner");
        spd2.setWarnaFerry("Hitam");
        spd2.hargaMobilFerry("150 Juta");
        spd2.tambahKecepatanFerry(10);
        spd2.gantiGearFerry(4);
        spd2.tambahKecepatanFerry(10);
        spd2.gantiGearFerry(4);
        spd2.cetakStatusFerry();
    }
}
