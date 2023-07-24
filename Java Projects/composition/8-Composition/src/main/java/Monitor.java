public class Monitor {
    
    private String model;
    
    private String üretici;
    
    private String boyut;
    
    private Resolution resolution; // resolution class ında bir nesneyi oluşturduk burada!

    public Monitor(String model , String üretici , String boyut ,Resolution resolution){
        this.resolution = resolution;
        this.üretici = üretici;
        this.model = model;
        this.boyut = boyut;
    }
    public void monitorü_kapat(){
        System.out.println("Monitor kapatılıyor....");
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the üretici
     */
    public String getÜretici() {
        return üretici;
    }

    /**
     * @param üretici the üretici to set
     */
    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
