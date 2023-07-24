
public interface IDeneme {
    
    // private int a = 4 ; // modifier private not allowed here-özel değiştiricilere burada izin verilmez
    // interface in herhangi bir constructor ı yok yani interfaceten herhangi bir obje üretemiyoruz o yüzden private alanlar burada yasaklı olarak gösteriliyor
    public int a = 4 ; 
    
    public int b = 5 ; // = koymalısın diyor public bir değer belirtiyorsan bunun değerini direk vermen gerekir
    
    public static String deneme ="Deneme"; // static anahtar kelimesini kullanmayarak interface ismi üzerinde a ve b ye eriştik
    
    public final int c = 6; // final kullanmak da etkilemiyor public olarak versekte gene interface ismi üzerinden erişeceğiz
    
    public static void deneme(){
        // İnterface e direk bir method ekleyemezsin , bu interface i kullanmak için obje oluşturmamız lazım ama obje interfacelerde oluşturulamıyor yani static olmayan bir methodu buraya ekleyemiyoruz ,gövdeli bir method yazmak için static bulunması gerekiyor
        System.out.println("Deneme");
        
    }
    
}
