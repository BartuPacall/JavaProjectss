public class Kart{
    private int değer;
    private boolean tahmin = false;

    public Kart(int değer) {
        this.değer = değer;
    }

    public int getDeğer() {
        return değer;
    }

    public void setDeğer(int değer) {
        this.değer = değer;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
}
