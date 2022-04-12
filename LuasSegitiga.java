
package pert6;

/**
 *
 * @Sultan Ade Ramadhani 20104221
 */
public class LuasSegitiga {
    
    float alas;
    float tinggi;
    double Luas;
    
    public LuasSegitiga (float AL, float TG){
        this.setALAS(AL);
        this.setTINGGI(TG);
    }
    public void setALAS(float AL){
        this.alas = AL;
    }
     public void setTINGGI (float TG){
         this.tinggi = TG;
     }
      private double HitungLuas(){
         this.Luas = 0.5*this.alas*this.tinggi;
         return this.Luas;
      }
      public void CetakLuas(){
         this.HitungLuas();
         System.out.println("Hitung Luas Segitiga");
         System.out.println("-----------------------");
         System.out.println("Nilai Alas   :"+this.alas+"cm");
         System.out.println("Nilai Tinggi :"+this.tinggi+"cm");
         System.out.println("Jadi Luasnya :"+this.Luas+"cm2");
    }
    
}
