public class Obat {
    private String nama;
    private int harga, stok;


    public Obat(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    @Override
    public String toString() {
        return "" +
                "nama = " + nama +
                " | harga = " + harga +
                " | stock = " + stok;
    }
}
