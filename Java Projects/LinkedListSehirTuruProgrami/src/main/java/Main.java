/*
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void islemleri_bastir(){
        
        System.out.println("0-İşlemleri Görüntüle");
        System.out.println("1-Bir sonraki şehre git");
        System.out.println("2-Bir önceki şehre git");
        System.out.println("3-Uygulamadan çık");
    }
    public static void sehirleri_turla(LinkedList<String> sehirler){
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> iterator= sehirler.listIterator();
        
        
        
        islemleri_bastir();
        
        
        
        
        if(!(iterator.hasNext())){
            System.out.println("Herhangi bir şehir bulunamadı...");
            
        }
        boolean cikis = false;
        boolean ileri = true;
        
        while(!cikis){
            System.out.println("Bir islem seciniz : ");
            int islem =scanner.nextInt();
            
            
            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true ;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor: " + iterator.next());
                        
                    }
                    else{
                        System.out.println("Gidilecek şehir kalmadı...");
                        ileri = true;
                    }
                    
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if(iterator.hasPrevious()){
                        
                    System.out.println("Şehre gidiliyor: " +  iterator.previous());
                    
                    }
                    else{
                        System.out.println("Şehir Turu başladı...");
                        ileri = false;
                    }
                    break;
                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
                default:
                    System.out.println("Hatalı işlem girdiniz ...");
                    break;
            }
        }
        
    }
    public static void main(String[] args) {
        
        LinkedList <String> sehirler = new LinkedList<String>();
        
        sehirler.add("Konya");
        sehirler.add("Bursa");
        sehirler.add("Samsun");
        
        sehirleri_turla(sehirler);
        
        
    }
    
}*/
