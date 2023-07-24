public class Main {
     public static void main(String[] args) {
        
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckServices());
        // SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
        //User user1 = new User(132,"Bartu", 13);
        //signUpManager.SignUp(user1);
         signUpManager.SignUp(new User(13,"Mustafa", 21));
       
    }
}
