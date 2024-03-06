public class Buku {
    String isbn, judul, author;
    int jumlahHalaman;

    public static Integer jumlahBuku = 0;

    public Buku(String isbn, String judul, int jumlahHalaman,String author){
        this.isbn = isbn;
        this.judul = judul;
        this.author = author;
        this.jumlahHalaman = jumlahHalaman;
        jumlahBuku++;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "isbn='" + isbn + '\'' +
                ", judul='" + judul + '\'' +
                ", author='" + author + '\'' +
                ", jumlahHalaman=" + jumlahHalaman +
                '}';
    }
}
