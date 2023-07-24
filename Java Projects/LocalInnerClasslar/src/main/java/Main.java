
public class Main {
    public static void main(String[] args)  {
        
        
        class Alan { // burada public veya staticte başına ekleyemeyiz
            public void daire_alan(int yaricap){
                
                System.out.println("Dairenin Alanı : " + (yaricap*yaricap*Math.PI));
                
            }
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();
        alan.daire_alan(10);
        alan2.daire_alan(2);
        
    } 
    public static void deneme(){
        
      //  Alan alan1 = new Alan(); // sadece üsteki methoda özgü burada bunu kullanamayız  
        
    }
    
    
}
