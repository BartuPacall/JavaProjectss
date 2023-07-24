public class Dragon extends Beyblade{
    private String KutsalCanavar;
    private  String gizliYetenek;
    
    public Dragon(String beybladeci,int donus_hizi,int saldiriGücü,String KutsalCanavar,String gizliYetenek){
        super(beybladeci,donus_hizi,saldiriGücü);
        this.KutsalCanavar=KutsalCanavar;
        this.gizliYetenek=gizliYetenek;
        
    }
    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Kutsal Canavar Adı : " + KutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek   );
    }

    @Override
    public void kutsalCanavarCikar() {
       System.out.println(getBeybladeci() + " " + KutsalCanavar +  " ortaya çıkarıyor...");
       System.out.println(getBeybladeci() + " ın gizli Saldırısı :  Hyalet Kasırgası ");
    }
    
}
