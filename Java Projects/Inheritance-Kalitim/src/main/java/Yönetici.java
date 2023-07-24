public class Yönetici extends Calisan{ //Subclass
    
    
    private int sorumlu_kisi;
    public Yönetici(String isim , String departman , int maas,int sorumlu_kisi){
        /*this.isim = isim;
        this.departman = departman;
        this.maas = maas;*/
        super(isim,departman,maas); 
//calisan .java super classs tı yanii biz miras aldığımız class ın consturctor ını kullanmak istiyoruz.
        this.sorumlu_kisi=sorumlu_kisi;    
  
    } 
    
     public void zam_yap(int zam_miktarı){
            
            System.out.println("Calisanlara " + zam_miktarı + " tl kadar zam yapildi.");
        }
     public void bilgilerigoster(){
            /*System.out.println("İsim : " + getIsim());
            System.out.println("Departman : " + getDepartman());
            System.out.println("Maaş : " + getMaas());*/
            super.bilgilerigoster();
            
            System.out.println("Sorumlu kişi : " + this.sorumlu_kisi);
     }
}
