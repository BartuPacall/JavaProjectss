
public class YazdirmaSinifi<E> {
    // <E> 'nin anlamı : Ben sana farklı veri tiplerinden veri göndereceğim ve gönderdiğim veri tipini e yi kullandığın her yere yaz.
    public void yazdir(E[] dizi){
        
        for( E e : dizi){
            System.out.println(e);
        }
        
    }
    
    
}
