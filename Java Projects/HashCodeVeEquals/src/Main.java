
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||| Id : " + id + " | İsim: " + isim + " |||";
        
    }
// insert code -> equals and hashcode | Hashcode ve equals metodlarını sette aynı değere sahip 2 objenin tutulmaması için override ediyoruz 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.isim);
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        Set<Player> hashset  = new HashSet<Player>();
        
        Player player1 = new Player("Enes", 1);
        Player player2 = new Player("Mehmet", 8 );
        Player player3 = new Player("Bazel", 2);
        Player player4 = new Player("Enes", 1);
        
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for( Player p : hashset ){
            System.out.println(p);
        }
        /*
        Set<String> hashset  = new HashSet<String>();
        hashset.add("Java");
        hashset.add("C++");
        hashset.add("Php");
        hashset.add("Php"); // aynı degeri eklemeyecektir.
        
        
        for( String s : hashset ){
            System.out.println(s);
        }
        */
        
        /*HashSet<String> hashset = new HashSet<String>();

        bu referans oluşturma örneği ile

        Set<String> hashset = new HashSet<String>();

        bu referans oluşturma örneğinin ne gibi farkları var ?
        
        Cevap
        Herhangi bir farkı yok. Birisi kendi sinıfından yani HashSet sınıfından bir obje oluşturuluyor ve referans olarak da HashSet sınıfı gösteriliyor. Diğeri ise yine HashSet sınıfından bir obje oluşturulup referans olarak da o sınıfının miras aldığını sınıfı referans gösteriliyor yani oda Set Sınıfı oluyor. Sadece oluşturma şekili farklı , kullanımları aynı işlev görüyor. Bu şekilde de oluşturabilirsiniz diye anlattı Murat hoca.
        */
        
    }
    
}
