import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
    Character[] char_dizi = {'J','A','V','A'};
    Integer[] integer_dizi = {1,2,3,4,5,6,7};
    String[] string_dizi = {"Java","Python","C++","Php"};
    
    Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Bartu")};
    
    System.out.println("************************************************");
    YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
    YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
    YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
    YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

    yazdir_char.yazdir(char_dizi);
    System.out.println("************************************************");
    yazdir_integer.yazdir(integer_dizi);
    System.out.println("************************************************");
    yazdir_string.yazdir(string_dizi);
    System.out.println("************************************************");
    yazdir_ogrenci.yazdir(ogrenci_dizi);
    System.out.println("************************************************");
    
        
    }
}
