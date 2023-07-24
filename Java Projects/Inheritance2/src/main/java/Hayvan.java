public class Hayvan {
    private int kilo;
    private int boy;
    private int bacak_sayisi;
    private String isim;
    
    public Hayvan(int kilo , int boy , int bacak_sayisi , String isim){
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
        this.isim = isim;
    }
    public void yemekYe(){
        System.out.println("Hayvan şuan yemek yiyor...");
    }
        
    public void hareketeGeç(int hız){
        System.out.println("Hayvan " + hız + " ile hareket ediyor");
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacak_sayisi
     */
    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    /**
     * @param bacak_sayisi the bacak_sayisi to set
     */
    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
        
    }
