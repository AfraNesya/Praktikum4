public class Segitiga extends BangunDatar {
    protected final int alas = 7;
    protected final int tinggi = 8;

    public float luas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }

    public float keliling(){
        return (float) (3 * this.alas);
    }
}