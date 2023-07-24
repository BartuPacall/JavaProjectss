public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String eposta;
    private String telefonnumarası;

    
    
    
    public void paraYatır(double miktar) {
        
        bakiye+=miktar;
        System.out.println("Güncel Bakiyeniz = " +bakiye);
        
    }
    public void paraCekme(double miktar){
        if (miktar > 1500){
            System.out.println("Günde 1500 den fazla para çekemezsiniz...");
        }
        if(bakiye - miktar < 0){
            System.out.println("Yetersiz Bakiye....");
        }
        else{
            bakiye-=miktar;
            System.out.println("Güncel bakiyeniz: " + bakiye);
        }
    }
    //burayı class ın adıyla aynı yani Account() olarak belirledik yoksa burası constructor olmaz yani otomatik olarak çağrılmayacak eğer account yapmasaydık
    public Account(){
        //System.out.println("Kendi yazdığımız constructor....");
        /*this.hesapNo="Bilgi yok";
        this.bakiye=0.0;
        this.eposta="Bilgi yok";
        this.isim="Bilgi yok";
        this.telefonnumarası="Bilgi yok";*/
        this("bilgi yok ", 0.0, "Bartu", "bilgi yok", "Bilgi yok");
    }
    public void bilgilerigoster(){
        System.out.println("Hesap no : " + this.hesapNo);
        System.out.println("Bakiye : " + this.bakiye);
        System.out.println("İsim : " + this.isim);
        System.out.println("Eposta : " + this.eposta);
        System.out.println("Telefon no : " + this.telefonnumarası);
        
        
        
    }
    public Account(String hesapNo,String isim,String eposta){
        /*this.isim=isim;
        this.eposta=eposta;
        this.hesapNo=hesapNo;
        
        this.bakiye=0.0;
        this.telefonnumarası="Bilgi yok";*/
       this(hesapNo,0.0,isim,eposta,"Bilgi yok");
        
    }
    public Account(String hesapNo,double bakiye,String isim,String eposta,String telefonNo){
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.eposta=eposta;
        telefonnumarası=telefonNo;
        this.isim=isim;
         
    }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
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
     * @return the eposta
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * @param eposta the eposta to set
     */
    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    /**
     * @return the telefonnumarası
     */
    public String getTelefonnumarası() {
        return telefonnumarası;
    }

    /**
     * @param telefonnumarası the telefonnumarası to set
     */
    public void setTelefonnumarası(String telefonnumarası) {
        this.telefonnumarası = telefonnumarası;
    }
    
}