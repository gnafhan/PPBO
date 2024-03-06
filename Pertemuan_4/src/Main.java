public class Main {
    public static void main(String[] args) {
        KoleksiBuku perpustakaan = new KoleksiBuku();
        Buku buku1 = new Buku("12u82219", "Harry Potter",  19, "aaa"  );
        Buku buku2 = new Buku("12u822191", "Avenger",10,"sasasa"    );
        System.out.println(buku1);
        System.out.println(buku2);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        System.out.println(Buku.jumlahBuku);
//        perpustakaan.tampilkanJudulBuku();
//
//
//        perpustakaan.tampilkanAuthorBuku();
//        perpustakaan.tampilkanHalamanBuku();
//        perpustakaan.tampilkanISBNBuku();

        perpustakaan.tampilkanBuku();


    }


}
