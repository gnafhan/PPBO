abstract public class Mobil {
    protected String nopol, warna, merk;
    protected int gigi;
    protected int kecepatan;
    protected boolean isDikopling;

    public Mobil(String nopol, String warna, String merk){
        this.nopol = nopol;
        this.warna = warna;
        this.merk = merk;
        this.gigi = 0;
        this.kecepatan = 0;
        this.isDikopling = false;
    }

    protected void kopling(){
        this.isDikopling = !this.isDikopling;
        System.out.println(isDikopling? "Kopling menyala": "Kopling mati");
    }

    abstract public void tambahGigi();
    abstract public void kurangiGigi();
    abstract public void gas();

    public void rem(){
        this.kecepatan -= 10;
        System.out.println("Kecepatan saat ini: " + this.kecepatan);
    }

}