public class Main {
    public static void main(String[] args){
        String[] array = {"Bartu","Sude","Ayşegül","Adem","Melisa","Metehan"};
        int[] array2 ={1,2,3,4,5,6,7};
        Deneme[] array3 = {new Deneme("Mahmut"),new Deneme("Bartu"),new Deneme("Faruk"),new Deneme("Nafiz"),new Deneme("Çamlıbell")};
        /*for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }*/
        for(Deneme c : array3){
            c.Dondur();
        }
        System.out.println("--------------------------------------");
        for (int b : array2){
            System.out.println( b  );
        }
        System.out.println("--------------------------------------");
        for (String a : array){  // bu şekilde yazarakta dizideki tüm elemanları a ile döndürmüş oluyoruz...! for each kısmı bu oluyor for dongusunu kısa şekilde yazabiliyoruz...
            System.out.println(a);
        }
    }
    
}
