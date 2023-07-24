public class Dranza extends Beyblade {
    private String KutsalCanavar;
    
    public Dranza(String beybladeci,int donus_hizi,int saldiriGücü,String KutsalCanavar){
        super(beybladeci, donus_hizi, saldiriGücü);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Kutsal Canavar Adı : " + KutsalCanavar);
    }

    @Override
    public void kutsalCanavarCikar() {
        System.out.println(getBeybladeci() + " " + KutsalCanavar +  " ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın gizli Saldırısı : Alev Kılıcı");
    }
    
}
