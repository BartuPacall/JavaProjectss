import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*int[] array = {1,2,3,4,5,6,7};
        int[][] array2 = new int[2][2];// 2 satır - 2 sütun olsun dedik.
        
        array2[0][0]=10;
        array2[0][1]=20;
        array2[1][0]=30;
        array2[1][1]=40;
        
        for(int i = 0 ; i < 2 ;i++){
            for(int j=0 ; j < 2 ;j++){
            System.out.println(array2[i][j]);
        }
            }*/
        int[][] array2 = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        
        
        
        for(int i = 0 ; i < 2 ;i++){
            for(int j=0 ; j < 2 ;j++){
                System.out.println("Array2["+ i +"][" + j + "] = ");    
                array2[i][j] = scanner.nextInt();
            } 
    }
        
        
        for(int i = 0 ; i < 2 ;i++){
            for(int j=0 ; j < 2 ;j++){
                System.out.println("Array2["+ i +"][" + j + "] = " + array2[i][j]);
                
            } 
    }
        
    }
    
}
