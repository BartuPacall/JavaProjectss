import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{ // implemente ettik ve içine player yazdık çünkü nasıl karşılaştıracağini belirledik
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||| ID |||= " + id + " " + "Player: " + " Isim =" + isim  ;
    }

    @Override
    public int compareTo(Player player) {
        
        // rakamları büyükten küçüğe istersek yönlerini değiştireceğiz
        
        if(this.id < player.id){
            return -1; // -1 değer döndürmesi bizim küçükten büyüğe sıralamak istediğimizi söylemiş oluyor
            
        }
        else if(this.id > player.id){
            return 1;
        }
        return 0;
        
    }
    
    
}
public class main {
    public static void main(String[] args) {
        
        /*
        List<String> list_String = new ArrayList<String>();
        
        list_String.add("Java");
        list_String.add("Python");
        list_String.add("Go");
        list_String.add("Php");
        list_String.add("C++");
        
        Collections.sort(list_String);
        
        // alfabetik olarak büyükten küçüğe sıraladı
        
        for(String s : list_String){
            System.out.println(s);
            
        }
    */
    
    List<Player> list_Player = new ArrayList<Player>();
    list_Player.add(new Player("Mehmet", 17));
    list_Player.add(new Player("Arda", 19));
    list_Player.add(new Player("Celil", 21));
    list_Player.add(new Player("Saban", 3));
    list_Player.add(new Player("Kattie", 2));
    
    Player p1 = new Player("Mehmet", 17);
    Player p2 = new Player("Kattie", 2);
    
    
        // System.out.println(p1.compareTo(p2));
        // p1 this , p2 player yerine geçicek en üstteki fonksiyonda
    
       //Collections.sort(list_Player);
       
       /* for(Player p : list_Player ){
           System.out.println(p);
       }
       */
    Set<Player> treeset = new TreeSet<Player>();
    treeset.add(new Player("Mehmet", 17));
    treeset.add(new Player("Arda", 19));
    treeset.add(new Player("Celil", 21));
    treeset.add(new Player("Saban", 3));
    treeset.add(new Player("Kattie", 2));
    
    for(Player p : treeset ){
           System.out.println(p);
       }
    
    }
        
}
/*toString, objeyi direk print etmeye yarayan bir özellik. Yani

Obje obje = new Obje() ise print(obje) dediğiniz anda toString'in altındaki komutlar çalışır.
*/

/*
Şimdi biz orada listeyi yaratirken oraya Player cinsinden deger alacagini soyledik yani boyle yaratdik List<Player> list_player....Ama sen listeye bir sey eklerken  list_player.add("Murat",5) dersen listeye bir String ve bir de int deger eklemek istedigini bildirirsin ve liste error verir çunki Player cinsinden bir deger eklemelisin.
*/