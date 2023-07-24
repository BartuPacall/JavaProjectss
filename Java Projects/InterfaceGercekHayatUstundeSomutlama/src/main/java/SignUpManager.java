public class SignUpManager {
        
    private IUserCheckServices iUserCheckServices;
            // AgeUserCheckService ageUserCheckService = new AgeUserCheckService(); eğer biz bunu new dersek tek tek değiştirmemiz gerekir bir şey olduğunda
            // alttaki kısmı constructer olarak verdik
    
            
    public SignUpManager(IUserCheckServices iUserCheckServices) {
        this.iUserCheckServices = iUserCheckServices;
    }
    public void SignUp(User user){
            if(iUserCheckServices.checkUser(user)){
                System.out.println(user.getName() + " isimli kullanıcı kayıt oldu." );
            }
            else{
                System.out.println(user.getName() + " isimli kullanıcı kayıt olamadı...");
            }
            /*if(ageUserCheckService.checkUser(user)== true){
                System.out.println(user.getName() + " isimli kullanıcı kayıt oldu." );
            }
            else{
                System.out.println(user.getName() + " isimli kullanıcı kayıt olamadı...");
            }*/
            
        }
}
