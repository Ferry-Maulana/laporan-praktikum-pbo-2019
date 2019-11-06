package abstractclass;

public class Program1841720137Ferry {
    
    public static void main(String[] args)
    {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Ani");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
