public class Araba {
    private String renk;
    private int kapılar;
    private int tekerlekler;
    private String motor;
    private String model;
    
    public void setModel(String model){ //buradaki modelle alttaki aynı olduğundan this kullandık farklı olsaydı this olmasada olurdu
// Biz burada static kullanmayacağız çünkü artık methodlar objelere özgü olacak ama static kullanırsak classlara özgü olur.
          this.model = model;//This kullandık burada biz model özelliğine erişmek istediğimizi söylüyoruz
                                      
    }
// Refactor -Encapsuled Field yap ve ordakileri seç otomatik yapılıyor bir kısmı get ve set functions
    public String getModel() {
        return this.model;//return model; de olur aynı anlamda
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapılar
     */
    public int getKapılar() {
        return kapılar;
    }

    /**
     * @param kapılar the kapılar to set
     */
    public void setKapılar(int kapılar) {
        if(kapılar < 0 ){
            System.out.println("kapılar sıfırdan küçük olamaz...");
        }
        else{
            this.kapılar = kapılar;
        }
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    }
