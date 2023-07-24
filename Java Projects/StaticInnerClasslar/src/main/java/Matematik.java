// matematik class ı oluşturduk -> onun içinde bir static class oluşturduk -> onun içinede daire alan methodunu oluşturduk.
public class Matematik {
    // private double PI=Math.PI; non- static vaariable olduğundan static yaparak ancak biz bunu alttaki soutta kullanabiliriz.
    private static double PI=Math.PI;
    public static class alan{
        public static void daire_Alan(int yaricap){ // burayıda static yaptık mainde hata almadık
            System.out.println("Daire'nin Alanı : " + (yaricap*yaricap*PI)); // burada non - static yerne static olanı kullanmalıyız yoksa çalışmaz.
        }
        
    }
    
    
}
