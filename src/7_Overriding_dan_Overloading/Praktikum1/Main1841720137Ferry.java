package Praktikum1;

/**
 *
 * @author owner
 */
public class Main1841720137Ferry {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720137Ferry man[]=new Manager1841720137Ferry[2];
        Staff1841720137Ferry staff1[]=new Staff1841720137Ferry[2];
        Staff1841720137Ferry staff2[]=new Staff1841720137Ferry[3];
        
        man[0]=new Manager1841720137Ferry();
        man[0].setNamaFerry("Tedjo");
        man[0].setNipFerry("101");
        man[0].setGolonganFerry("1");
        man[0].setTunjanganFerry(5000000);
        man[0].setBagianFerry("Administrasi");
        
        man[1]=new Manager1841720137Ferry();
        man[1].setNamaFerry("Atika");
        man[1].setNipFerry("102");
        man[1].setGolonganFerry("1");
        man[1].setTunjanganFerry(2500000);
        man[1].setBagianFerry("Pemasaran");
        
        staff1[0]=new Staff1841720137Ferry();
        staff1[0].setNamaFerry("Usman");
        staff1[0].setNipFerry("0003");
        staff1[0].setGolonganFerry("2");
        staff1[0].setLemburFerry(10);
        staff1[0].setGajiLemburFerry(100000);
        
        staff1[1]=new Staff1841720137Ferry();
        staff1[1].setNamaFerry("Anugrah");
        staff1[1].setNipFerry("0005");
        staff1[1].setGolonganFerry("2");
        staff1[1].setLemburFerry(10);
        staff1[1].setGajiLemburFerry(55000);
        man[0].setStaffFerry(staff1);
        
        staff2[0]=new Staff1841720137Ferry();
        staff2[0].setNamaFerry("Hendra");
        staff2[0].setNipFerry("0004");
        staff2[0].setGolonganFerry("3");
        staff2[0].setLemburFerry(15);
        staff2[0].setGajiLemburFerry(5500);
        
        staff2[1]=new Staff1841720137Ferry();
        staff2[1].setNamaFerry("Arie");
        staff2[1].setNipFerry("0006");
        staff2[1].setGolonganFerry("4");
        staff2[1].setLemburFerry(5);
        staff2[1].setGajiLemburFerry(100000);
        
        staff2[2]=new Staff1841720137Ferry();
        staff2[2].setNamaFerry("Mentari");
        staff2[2].setNipFerry("0007");
        staff2[2].setGolonganFerry("3");
        staff2[2].setLemburFerry(6);
        staff2[2].setGajiLemburFerry(20000);
        man[1].setStaffFerry(staff2);
        
        man[0].lihatInfoFerry();
        man[1].lihatInfoFerry();
    } 
}