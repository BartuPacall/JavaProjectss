
package com.bartupacal.paket1;

import com.bartupacal.paket2.Araba;
import com.bartupacal.paket2.Hayvan;

public class Main {
    /*
    Access Modifiers Erişim Belirleyiciler
    
    Erişim Belirleyiciler 2 düzeyde erişimi belirlerler.
    
    Sınıf Düzeyinde Erişim Belirleyiciler 
    
    public : Bir class eğer public olarak yazılmışsa bu classa paketin içindeki vedışındaki
    tüm classlar tarafından erişilir.
    
    default :  default erişim belirleyici kullanmamak anlamına gelir.Eğer bir class hiçbir erişim belirleyici kullanmadan yazılmışsa bu class'a sadece aynı paketin içindeki classlar erişebilir . Paketin dışındaki classlar bu class'a erişemez.
    
    
    *** protected , private etişim erişim belleyiciler dışında classlar için kullanılmalıdır.
    
    Metod ve Özellik Düzeyinde Erişim Belirleyiciler 
    
    
    public : eğer bir metod veya özellik (class , member veya alan) public olarak tanımlanmışsa , bu
    alana paketin içindeki ve dışındaki tüm classlar erişebilir.
    
    default : Eğer bir method veya özellik tanımlanırken hiçbir erişim belirleyici  kullanılmamışsa (default) , bu alana sadece paketin içindeki classlar erişebilir.
    
    protected : Eğer bir metod veya özellik ( class , member veya alan ) public olarak tanımlanmışsa , bu
    alana paketin içindeki ve dışındaki tüm classlar erişebilir.Paketin dışındaki classlar ise sadece ve sadece bu alanın bulunduğu class'ın bir alt classıysa erişebilir.
    
    
    private : Eğer bir alan private olarak tanımlanmmışsa bu alana sadece kendi class ı erişebilir.
    
    Daha önceden öğrendiğimiz gibi bir methodun içinde tanımlanmış değişkenler lokal değişken olarak tanımlanırlar. Yani , 
    bu değişkenlere diğer metodlardan ve classlardan erişilemez. Bundan dolayı bu değişkenlere access modifier eklenmez.
    
    
    */
    
    public static void main(String[] args) {
        
        /*Araba araba = new Araba();
        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);
        */
        /*Hayvan hayvan = new Hayvan("Hayvan");
        System.out.println(hayvan.isim);*/
       
    }
    
}
