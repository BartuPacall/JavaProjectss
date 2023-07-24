
public class Main {
    public static void main(String[] args) {
     
        
    Sayisal sayisal1 = new Sayisal(29, 10, 30, 40);
    Sayisal sayisal2 = new Sayisal(15, 30, 20, 30);
    Sayisal birinci = birinci(sayisal1, sayisal2);
    System.out.println("Birinci sayisal öğrencinin puanı : " + birinci.puanhesapla());
    EsitAgirlik esitAgirlik = new EsitAgirlik(12, 23, 30, 20);
    EsitAgirlik esitAgirlik1 = new EsitAgirlik(22, 12, 15, 36);
    
    EsitAgirlik birinci2 = birinci(esitAgirlik1, esitAgirlik);
    System.out.println("Birinci eşit ağırlık öğrencinin puanı : " +birinci2.puanhesapla());
        
    /*
    Character[] char_dizi = {'J','A','V','A'};
    Integer[] integer_dizi = {1,2,3,4,5,6,7};
    String[] string_dizi = {"Java","Python","C++","Php"};
    Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Bartu")};
       
        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);
    
    
    */
    }
    
    public static <E extends Aday> E birinci(E e1,E e2){
        // puanhesaplada sorun çıkarıyor biz sadece adayı extends edenleri göndermek için böyle yazdık.
        
       if(e1.puanhesapla() > e2.puanhesapla()){
           return e1;
       }
       else{
           return e2;
       }
    
    
    
}
    
    /*
    public static <E> void yazdir(E[] dizi){
        for( E e : dizi ) {
            
            System.out.println(e);
            
        }
       
    }*/ 
}
