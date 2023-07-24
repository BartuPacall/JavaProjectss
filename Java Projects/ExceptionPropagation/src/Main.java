
public class Main {
    
    public static void ucuncufonksiyon(){
        int a = 12/0;
        /*try{
        int a = 12/0;
        }
        catch(ArithmeticException e){
            System.out.println("Sayi sıfıra bölünemez !");
        }*/
    }
    public static void ikincifonksiyon(){
        ucuncufonksiyon();
        /*try{
            ucuncufonksiyon();
        }
        catch(ArithmeticException e){
            System.out.println("Sayı sıfıra bölünemez! ");
        }*/
    }
    public static void birincifonksiyon(){
        ikincifonksiyon();
        /*try{
            ikincifonksiyon();
        }
        catch(ArithmeticException e){
            System.out.println("Sayı sıfıra bölünemez ! ");
        }*/
    }
    
    public static void main(String[] args) {
        birincifonksiyon();
        /*try{
            birincifonksiyon();
        }
        catch(ArithmeticException e){
            System.out.println("Sayı sıfıra bölünemez ! ");
        }*/
        
    }
    
}

// not: exception ucuncude yakalanmassa ikiciye bakılıyor onda yakalanmassabirinci fonksiyonda ondada yakalanmassa maine bakılıyor maindede yakalanmassa hata verior.