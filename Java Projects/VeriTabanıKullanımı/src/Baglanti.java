
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baglanti {
    private String kullanici_Adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host = "localhost";
    
    private int port =3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement= null;
    public void preparedCalisanlariGetir(int id){
        
        String sorgu = "Select * From calisanlar where id > ? and ad like ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "A%"); // adı a ile başlayanlar
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad : " + ad + " Soyad : " + soyad + "\nEmail : " + email);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void calisanSil(){
        try {
            statement = con.createStatement();
            String sorgu = "Delete From calisanlar where id >3";
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger +" kadar veri silindi...");
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void calisanGuncelle(){
        try {
            statement = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sorgu = "Update calisanlar Set email = 'semavedaediyor@gmail.com' where id = 1 ";
        try {
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void calisanEkle(){
        
        try {
            statement = con.createStatement();
            
            int id = 6;
            String ad = "Semih";
            String soyad = "Akca";
            String email = "Semihacka@hotmail.com";
            String sorgu = "Insert Into calisanlar (id, ad, soyad, email) VALUES("+ id + ",'" + ad + "'," + "'" + soyad + "',"+ "'" + email +"')" ;
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        // INSERT INTO `calisanlar`(`id`, `ad`, `soyad`, `email`) VALUES (,'','','')
        
     
        
        
       
        
        
        
        
    }
    
    public void calisanlariGetir(){
        String sorgu =" Select * From calisanlar ";
        
        try {
            statement= con.createStatement();
            
            statement.executeQuery(sorgu);
            
            ResultSet resultSet = statement.executeQuery(sorgu);
            
            while(resultSet.next()){
                
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                String email = resultSet.getString("email");
                
                System.out.println("AD:" + ad + "  SOYAD:" + soyad + "\nID:" + id + "\tE-mail:" + email);
                System.out.println("---------------------------------------------------------------------------");
                
                
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
    }
    
    
    
    public Baglanti(){
        
        // jdbc:myssql://localhost:3306/demo
        String url = "jdbc:mysql://" + host +  ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            con = DriverManager.getConnection(url, kullanici_Adi, parola);

            System.out.println("Bağlantı Başarılı...");

            //ex.printStackTrace();

       } catch (SQLException ex) {

            // System.out.println("Bağlantı Başarısız...");

           ex.printStackTrace();

       }

}

    public static void main(String[] args) {

        Baglanti baglanti = new Baglanti();
        
        /*System.out.println("Eklenmeden önce.........");
        baglanti.calisanlariGetir();
        System.out.println("*************************");
        baglanti.calisanEkle();
        baglanti.calisanlariGetir();
        System.out.println("Güncelledikten sonra ......");
        System.out.println("---------------------------");
        baglanti.calisanGuncelle();
        baglanti.calisanlariGetir();
        System.out.println("Silinmeden önce...");
        baglanti.calisanlariGetir();
        System.out.println("Silindikten sonra...");
        baglanti.calisanSil();*/
        
        baglanti.preparedCalisanlariGetir(2);
        
        
    } 
        
        
    }
    
    
    

