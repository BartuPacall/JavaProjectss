
public final class Database {
    // eğer bir classımızı final yaparsak başka hiçbir alt sınıf üretemiyoruz.
    
    public /*final*/ void baglantiKur(/*final*/ String username, /*final*/ String password){
        username = "root2"; // bunun değiiştirilmesini istemiyorsak  final şeklinde belirtmeliyiz 
        System.out.println(username);
        System.out.println(password);
        // bu methodumuzun overrride edilmesini istemiyorsak final anahtar kelimesini kullanıyoruz
        
    }
}
