public class Kopek extends Hayvan{
    private int dis_sayisi;
    public Kopek(int kilo , int boy , int bacak_sayisi , String isim , int dis_sayisi){
        
        super(kilo, boy, bacak_sayisi, isim);
        
        this.dis_sayisi=dis_sayisi;
        
        
    }

     public void kos(int hız){
         System.out.println("Köpek kosuyor...");
         //super.hareketeGeç(hız); // superi kaldırırsak harekete geçteki method  override edilmiş oldu...
         hareketeGeç(hız);// böyle çok daha güvenli olur
     }   
     public void hareketeGeç(int hız){
         System.out.println("Köpek " + hız + " ile hareket ediyor");
     }
    
    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
}
