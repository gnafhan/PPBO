package page;

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

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public static int getJumlahBuku() {
        return jumlahBuku;
    }

    public static void setJumlahBuku(int jumlahBuku) {
        Buku.jumlahBuku = jumlahBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Date getTglTerbit() {
        return tglTerbit;
    }

    public void setTglTerbit(Date tglTerbit) {
        this.tglTerbit = tglTerbit;
    }

    public Date getTglTambah() {
        return tglTambah;
    }

    public void setTglTambah(Date tglTambah) {
        this.tglTambah = tglTambah;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "idBuku=" + idBuku +
                ", judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tglTerbit=" + tglTerbit +
                ", tglTambah=" + tglTambah +
                '}';
    }
}
