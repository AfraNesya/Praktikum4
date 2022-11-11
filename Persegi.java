public class Persegi extends BangunDatar {
    private final double sisi = 8;

    public float luas(){
        return (float) (this.sisi * this.sisi);
    }

    public float keliling(){
        return (float) (4 * this.sisi);
    }
}