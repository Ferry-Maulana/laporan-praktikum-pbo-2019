package Pbo3;

public class Motor1841720157Andri {
        public int kecepatan = 0;
        public boolean kontakOn = false;
        
           public void nyalakanMesin(){
          kontakOn = true;
      }
      public void matikanMesin(){
          kontakOn = false;
          kecepatan = 0;
      }
      public void tambahKecepatan(){
          if (kontakOn == true){
              kecepatan+=5;
      }else{
              System.out.println("Kecepatan tidak bisa bertambah karean mesin off!\n");
          }
      }   
            public void kurangiKecepatan(){
          if(kontakOn ==true){
             kecepatan -= 5;
      }else{
              System.out.println("Kecepatan tidak bisa berkurang karean mesin off!\n");
          }
     }
        public void printStatus(){
            if (kontakOn == true){
                System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
            System.out.println("Kecepatan" + kecepatan+"\n");
    }
}