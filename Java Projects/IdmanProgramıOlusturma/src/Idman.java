public class Idman{
    private int pushup_sayisi;
    private int situp_sayisi;
    private int burpet_sayisi;
    private int squat_sayisi;

    public Idman(int pushup, int situp, int burpet, int squat) {
        this.pushup_sayisi = pushup;
        this.situp_sayisi = situp;
        this.burpet_sayisi = burpet;
        this.squat_sayisi = squat;
    }
    
    public void hareketYap(String harekettürü,int sayi){
        if(harekettürü.equals("burpet")){
            burpetYap(sayi);
        }
        else if(harekettürü.equals("situp")){
            situpYap(sayi);
        }
        else if(harekettürü.equals("squat")){
            squatYap(sayi);
        }
        else if(harekettürü.equals("pushup")){
            pushupYap(sayi);
        }
        else{
            System.out.println("Hareket bulunamadı...");
        }
        
        
    }
    public int getPushup() {
        return pushup_sayisi;
    }

    public void setPushup(int pushup) {
        this.pushup_sayisi = pushup;
    }
    
    public  void pushupYap(int sayi){
        if(pushup_sayisi == 0){
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(pushup_sayisi - sayi < 0 )
        {
            System.out.println("Pushup hedefinizi aştınız...");
            pushup_sayisi=0;
            System.out.println("Kalan pushup : " + pushup_sayisi);
        }
        else{
            pushup_sayisi-=sayi;
            System.out.println("Kalan pushup sayisi :" + pushup_sayisi);
        }
        
    }

    public int getSitup() {
        return situp_sayisi;
    }

    public void setSitup(int situp) {
        this.situp_sayisi = situp;
    }
    public  void situpYap(int sayi){
        if(situp_sayisi == 0){
            System.out.println("Yapacak situp kalmadı...");
        }
        if(situp_sayisi - sayi < 0 )
        {
            System.out.println("Situp hedefinizi aştınız...");
            situp_sayisi=0;
            System.out.println("Kalan situp : " + situp_sayisi);
        }
        else{
            situp_sayisi-=sayi;
            System.out.println("Kalan situp sayisi :" + situp_sayisi);
        }
        
    }
    

    public int getBurpet() {
        return burpet_sayisi;
    }

    public void setBurpet(int burpet) {
        this.burpet_sayisi = burpet;
    }
    public  void burpetYap(int sayi){
        if(burpet_sayisi == 0){
            System.out.println("Yapacak burpet kalmadı...");
        }
        if(burpet_sayisi - sayi < 0 )
        {
            System.out.println("Burpet hedefinizi aştınız...");
            burpet_sayisi=0;
            System.out.println("Kalan burpet : " + burpet_sayisi);
        }
        else{
            burpet_sayisi=burpet_sayisi-sayi;
            System.out.println("Kalan burpet sayisi :" + burpet_sayisi);
        }
        
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public  void squatYap(int sayi){
        if(squat_sayisi == 0){
            System.out.println("Yapacak squat kalmadı...");
        }
        if(squat_sayisi - sayi < 0 )
        {
            System.out.println("Squat hedefinizi aştınız...");
            squat_sayisi=0;
            System.out.println("Kalan squat : " + squat_sayisi);
        }
        else{
            squat_sayisi-=sayi;
            System.out.println("Kalan squat sayisi :" + squat_sayisi);
        }
        
    }
    public boolean idmanBittimi() {
        return (burpet_sayisi == 0 ) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
    
}
