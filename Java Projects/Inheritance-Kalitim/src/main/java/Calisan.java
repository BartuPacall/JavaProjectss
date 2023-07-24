public class Calisan { //Superclass - Baseclass
    private String isim;
    
    private String departman;
    
    private int maas;

    public Calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }
    public void calis(){
        System.out.println("Çalışan çalışıyor...");
    }

    public void bilgilerigoster(){
        
        System.out.println("İsim : " + getIsim());
        System.out.println("Departman : " + getDepartman());
        System.out.println("Maaş : " + getMaas());
    }

    public void departman_degistir(String yeni_departman){
        System.out.println("Departman değiştiriliyor....");
        this.setDepartman(yeni_departman) ;
        
        System.out.println("Yeni departmanınız : " + getDepartman());
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

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

}
