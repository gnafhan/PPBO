import java.util.ArrayList;

public class Kost {
    String namaKost;
    ArrayList<Mahasiswa> penghuniKost = new ArrayList();
    ArrayList<Mahasiswa> pengunjungKost = new ArrayList();
    static ArrayList<Integer> nomorKamarKosong = new ArrayList<>();

    static Integer kapasitasParkir = 22;

    public static final Integer KAPASITAS_KOST = 8;

    public void tambahPenghuni(Mahasiswa mahasiswa){
        if (validasiKendaraan(mahasiswa) && validasiSize()) {
            kapasitasParkir -= mahasiswa.sizeKendaraan;
            penghuniKost.add(mahasiswa);
            if (nomorKamarKosong.size() > 0) {
                mahasiswa.nomorKamar = nomorKamarKosong.get(0);
                nomorKamarKosong.remove(0);
            } else{
                mahasiswa.nomorKamar = penghuniKost.size();
            }
            System.out.println("\u001B[32mPenghuni kost bertambah (+) { "+mahasiswa.nama+", " + mahasiswa.kendaraan+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mPenghuni kost tidak bertambah { "+mahasiswa.nama+", " + mahasiswa.kendaraan+" } \u001B[0m");
            detailSekarang();
        }
    }

    private boolean validasiKendaraan(Mahasiswa mahasiswa) {
        return mahasiswa.sizeKendaraan <= kapasitasParkir;
    }

    private boolean validasiSize(){
        return penghuniKost.size() < KAPASITAS_KOST;
    }

    public void hapusPenghuni(Mahasiswa mahasiswa){
        boolean statusHapus = penghuniKost.remove(mahasiswa);
        if (statusHapus) {
            kapasitasParkir += mahasiswa.sizeKendaraan;
            System.out.println("\u001B[32mPenghuni kost berkurang (-) { "+mahasiswa.nama+" }\u001B[0m");
            nomorKamarKosong.add(mahasiswa.nomorKamar);
            detailSekarang();
        } else {
            System.out.println("\u001B[31mPenghuni kost tidak berkurang (tidak ditemukan) { "+mahasiswa.nama+" }\u001B[0m \n");
        }
    }

    public void berkunjung(Mahasiswa mahasiswa){
        if (validasiKendaraan(mahasiswa)) {
            kapasitasParkir -= mahasiswa.sizeKendaraan;
            pengunjungKost.add(mahasiswa);
            System.out.println("\u001B[32mMahasiswa bisa berkunjung (+) { "+mahasiswa.nama+", " + mahasiswa.kendaraan+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mMahasiswa tidak bisa berkunjung (+) { "+mahasiswa.nama+", " + mahasiswa.kendaraan+" }\u001B[0m");
            detailSekarang();
        }
    }

    public void keluar(Mahasiswa mahasiswa){
        boolean statusKeluar = pengunjungKost.remove(mahasiswa);
        if (statusKeluar) {
            kapasitasParkir += mahasiswa.sizeKendaraan;
            System.out.println("\u001B[32mMahasiswa keluar (-) { "+mahasiswa.nama+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mMahasiswa tidak keluar (tidak ditemukan) (-) { "+mahasiswa.nama+" }\u001B[0m\n");
        }
    }

    public Mahasiswa cariPenghuni(String nama){
        for (Mahasiswa mahasiswa : penghuniKost) {
            if (mahasiswa.nama.equals(nama)) {
                return mahasiswa;
            }
        }
        return null;
    }

    private void detailSekarang(){
        System.out.println("Kapasitas parkir tersisa: " + kapasitasParkir + " kapasitas kost : " + penghuniKost.size() + " orang \n");
    }
}