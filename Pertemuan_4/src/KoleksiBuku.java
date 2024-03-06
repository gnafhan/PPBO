import java.util.ArrayList;
import java.util.HashMap;

public class KoleksiBuku {


    private ArrayList<HashMap> koleksi = new ArrayList();

    public void tambahBuku(Buku buku){
        HashMap<String, String> bukuMap = new HashMap();
        bukuMap.put("judul",buku.judul);
        bukuMap.put("isbn", buku.isbn);
        bukuMap.put("author", buku.author);
        bukuMap.put("jumlahHalaman", Integer.toString(buku.jumlahHalaman));

        koleksi.add(bukuMap);
    }


    //    public void tampilkanJudulBuku(){
//        ArrayList<String> judul = new ArrayList();
//        koleksi.forEach(buku -> {
//            judul.add(buku.judul);
//        });
//        System.out.println(judul);
//    }
//
//    public void tampilkanISBNBuku(){
//        ArrayList<String> isbn = new ArrayList();
//        koleksi.forEach(buku -> {
//            isbn.add(buku.isbn);
//        });
//        System.out.println(isbn);
//    }

//    public void tampilkanAuthorBuku(){
//        ArrayList<String> author = new ArrayList();
//        koleksi.forEach(buku -> {
//            author.add(buku.author);
//        });
//        System.out.println(author);
//    }
//
//    public void tampilkanHalamanBuku(){
//        ArrayList<Integer> halaman = new ArrayList();
//        koleksi.forEach(buku -> {
//            halaman.add(buku.jumlahHalaman);
//        });
//        System.out.println(halaman);
//    }



    public void tampilkanBuku(){
        System.out.println(koleksi);
    }
}
