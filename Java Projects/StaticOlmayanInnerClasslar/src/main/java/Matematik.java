
import java.util.Scanner;


public class Matematik {
    
    private double PI = Math.PI;
    
    public class Factorial{
        public void faktorial(){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            int fact = 1;
            for ( int i = 1 ; i <= sayi ; i++ ){
                fact*=i;
            }
            System.out.println("Faktoriyel : " + fact);
            
        }
        
        
        
    }
    public class Asal{
        public boolean asal_mi(int sayi){
            
            int i = 2;
            while(i < sayi) {
                if(sayi % i == 0 ) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public class Alan{
    public class DaireAlan{
        public void daire_alan(int yaricap) {
            System.out.println("Dairenin alanı : " + (yaricap*yaricap*PI));
            }
        }
    }
}
