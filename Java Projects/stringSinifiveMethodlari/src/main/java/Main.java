public class Main {
    public static void main(String[] args){
        
        String a = "Mahmut";
        String b = new String("Mustafa"); // Stringlerde bir classtır.
        
        /*System.out.println(b);
        System.out.println("Harf Sayısı : " + b.length());
        
        System.out.println("0.index : " + b.charAt(0));
        System.out.println("2.index : " + b.charAt(2));
        System.out.println("Son index : " + b.charAt((b.length()-1))); 
        
        for( int i = 0 ; i < b.length() ; i++ ){
            System.out.println(b.charAt(i));
        }
        
        System.out.println(b.startsWith("Ma")); // bu b string'i ma ile başlıyor mu ? True yada false döndürüyor.
        System.out.println(b.endsWith("ah"));   // bu b string'i ah ile bitiyor mu ? True yada false döndürüyor.
        
        System.out.println(b.indexOf('a'));
        System.out.println(b.indexOf('c')); // eğer karakter yoksa -1 döndürüyor
        System.out.println(b.lastIndexOf('a')); //sondan kaçıncı elemanı a onun sırasını veriyor bize

        
        System.out.println(b.toLowerCase()); //tüm karakterleri küçük harfe çeviriyor
        System.out.println(b.toUpperCase()); // tüm karakterleri büyük harfe çeviriyoruz
        
        String a1 = "1923";
        int b1 = Integer.parseInt(a1); // bu şekilde string bir ifadeyi integer sayı değerine çeviriyoruz   
        
        System.out.println(b1-42); // int değere çevirip işlem yapaibliriz bu şekilde

        String a1 = "Mustafa";
        String a2 = "Mustafa";
        
        if(a1 == a2){
            System.out.println("Eşitler");
        }*/
        String b1 = new String("Mahmut");
        String b2 = new String("Mahmut"); // 2'sinin değeri eşit ama sen bu ikisini farklı objeler olarak oluştur ve referanslarımız farklı olsun diyoruz.
        
        if(b1 == b2 ){
            System.out.println("Eşitler"); // üstteki for ile farkı bu
        }
        if(b1.equals(b2)){ // b1 ile b2 nin içerikleri aynı mı?
            System.out.println("Eşitdirler"); // Eğer kontroledicekseniz genede bu şekilde kontrol et b1 in içeriği ile b2 nin içeriğini böyle yaptığımızda hata alma riskimiz azalır
        }
        
        }
    
}
