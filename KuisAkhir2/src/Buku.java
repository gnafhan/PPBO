import java.util.Date;

public class Buku {
    private int idBuku;
    private static int jumlahBuku = 0;
    private String judul, penulis, penerbit;
    private Date tglTerbit;
    private Date tglTambah;

    public Buku(String judul, String penulis, String penerbit, Date tglTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.tglTambah = new Date();
        jumlahBuku++;
        idBuku = jumlahBuku;
    }

}
