public class Beyblade {
    private String beybladeci;
    private int donus_hizi;
    private int saldiriGücü;

    public Beyblade(String beybladeci, int donus_hizi, int saldiriGücü) {
        this.beybladeci = beybladeci;
        this.donus_hizi = donus_hizi;
        this.saldiriGücü = saldiriGücü;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiriGücü() {
        return saldiriGücü;
    }

    public void setSaldiriGücü(int saldiriGücü) {
        this.saldiriGücü = saldiriGücü;
    }
    
    public void saldırı(){
        System.out.println(beybladeci + " " + saldiriGücü + " ve " + donus_hizi + " ile saldırıyor...");
    }
    
    public void kutsalCanavarCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    public void bilgilerigoster(){
        System.out.println("Beybladeci İsmi : " + beybladeci);
        System.out.println("Saldırı Gücü : " + saldiriGücü);
        System.out.println("Dönüş Hızı : " +donus_hizi);
    }
    
}
