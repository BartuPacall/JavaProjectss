
public class Problem {
    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin alanı : " + (yaricap*yaricap*Math.PI));
            
        }
        public static void UcgenCevresi( int kenar1 , int kenar2 , int kenar3 ){
            
            System.out.println(" Üçgenin Çevresi : " + ( kenar1 + kenar2 + kenar3 ) );
            
        }
        
    }
    
    public static class Fizik{
        public static void ic_Carpim(Vec vec1,Vec vec2) {
            
            int iccarpim = (vec1.getI()*vec2.getI() + vec1.getJ()*vec2.getJ() + vec1.getK()*vec2.getK());
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " nin iç çarpımı : " + iccarpim);
        }
    }
}
