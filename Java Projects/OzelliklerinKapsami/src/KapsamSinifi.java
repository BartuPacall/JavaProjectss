
public class KapsamSinifi {
    private int Degisken = 30;
    
    public KapsamSinifi(){
        System.out.println("privateDegisken = " + Degisken);
    }
    public void onileCarp(){
        int Degisken = 10;
        for(int i = 1 ; i < 6 ; i++){
            
            System.out.println(i + " * " + this.Degisken + " = " + (i * this.Degisken)); // this eklersek classtaki degisken eklemessek void un içindeki ele alınır
            
        }
    }
    
    
}
