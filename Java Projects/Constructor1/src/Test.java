/*public class Test{
    public static void main(String[] args) {
        Account account1 = new Account();
        //account1.setBakiye(5000);
        //account1.setEposta("bartup.123a@gmail.com");
        //account1.setHesapNo("12345");
        //account1.setIsim("Bartu Paçal");
        //account1.setTelefonnumarası("05428357130");
        //System.out.println("Bakiye =" + account1.getBakiye());
        //Üsttekileri yazmak yerine constructerları kullnacağız
        
        //Account account2=new Account("123123",1000.0,"Bartu Paçal","bartup.123a@hotmail.com","123231");
        //account2.paraCekme(1000);
        //account2.paraYatır(10000);
        
        //Account account3 = new Account();
        //System.out.println(account3.getEposta());
        
        Account account4 = new Account("23132321","Bartu Paçal","biriexample@gmail.com");
        
        //System.out.println(account4.getEposta());
        //System.out.println(account4.getTelefonnumarası());
        account4.bilgilerigoster();
    }
}
*/

public class Test{
    public static void main(String[] args) {
        /*Account account1 = new Account("123123",0.0,"Bartu Paçal","Bartup.12@hotmail.com","123123");
        Account account2 = account1;// Artık account 2 account 1 e eşitlendi.
        Account account3 = new Account();
        if(account1 == account3){
            System.out.println("Aynı objeyi gösteriyorlar...");
        }
        else{
            System.out.println("Aynı objeyi göstermiyorlar...");
        }*/
        new Account("123123","Bartu Paçal","birisiexample@.hotmail.com").bilgilerigoster();
        // daha sonra bu objemize herhangibir referans atamadığımızdan ilerde kullanamayacağız ancak tek satırlık işlemler için kullanılabilir uzun uzun referans kullanmak yerine kısa işlerimizi bununla halledebiliriz
        
        
        
        
    }
}