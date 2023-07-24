public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblade_turu){
        //Alt class referansını üst sınıfa verebiliyoruz
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takeo", 800, 300, "Mavi Ejderha","Kutsal Canavarla Konuşma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
            
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Dranza("Rei", 700, 300, "Beyaz Kaplan");
            
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Dranza("Max", 400, 1000, "Kara Kaplumbağa");
            
        }
        else{
            return null;
        }
        
       
    }
}
