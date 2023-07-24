public class Hesap {
    private String Kullanici;
    private String parola;
    private int bakiye;
    // insert constructor'ı seç 3 ünüde işaretle sonra gene insert getter and setter i seç 3 ünü işaretle...
    public Hesap(String Kullanici, String parola, int bakiye) {
        this.Kullanici = Kullanici;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici() {
        return Kullanici;
    }

    public void setKullanici(String Kullanici) {
        this.Kullanici = Kullanici;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatır(int miktar){
        bakiye+=miktar;
        System.out.println("Güncel bakiyeniz : " + bakiye);
    
}
    public void paraÇekme(int miktar){
        if(bakiye-miktar < 0){
            System.out.println("Yetersiz bakiye...");
        }
        else{
        bakiye-=miktar;
        System.out.println("Güncel bakiyeniz : " + bakiye);
    }
    }
}
