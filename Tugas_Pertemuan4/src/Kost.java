import java.util.ArrayList;

public class Kost {
    private String namaKost;
    private ArrayList<Mahasiswa> penghuniKost = new ArrayList();
    private ArrayList<Mahasiswa> pengunjungKost = new ArrayList();
    static ArrayList<Integer> nomorKamarKosong = new ArrayList<>();
    static Integer kapasitasParkir = 22;
    public static final Integer KAPASITAS_KOST = 8;

    public void tambahPenghuni(Mahasiswa mahasiswa){
        if (validasiKendaraan(mahasiswa) && validasiSize()) {
            kapasitasParkir -= mahasiswa.getSizeKendaraan();
            penghuniKost.add(mahasiswa);
            if (nomorKamarKosong.size() > 0) {
                mahasiswa.setNomorKamar(nomorKamarKosong.get(0));
                nomorKamarKosong.remove(0);
            } else{
                mahasiswa.setNomorKamar( penghuniKost.size());
            }
            System.out.println("\u001B[32mPenghuni kost bertambah (+) { "+mahasiswa.getNama()+", " + mahasiswa.getKendaraan()+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mPenghuni kost tidak bertambah { "+mahasiswa.getNama()+", " + mahasiswa.getKendaraan()+" } \u001B[0m");
            detailSekarang();
        }
    }

    private boolean validasiKendaraan(Mahasiswa mahasiswa) {
        return mahasiswa.getSizeKendaraan() <= kapasitasParkir;
    }

    private boolean validasiSize(){
        return penghuniKost.size() < KAPASITAS_KOST;
    }

    public void hapusPenghuni(Mahasiswa mahasiswa){
        boolean statusHapus = penghuniKost.remove(mahasiswa);
        if (statusHapus) {
            kapasitasParkir += mahasiswa.getSizeKendaraan();
            System.out.println("\u001B[32mPenghuni kost berkurang (-) { "+mahasiswa.getNama()+" }\u001B[0m");
            nomorKamarKosong.add(mahasiswa.getNomorKamar());
            detailSekarang();
        } else {
            System.out.println("\u001B[31mPenghuni kost tidak berkurang (tidak ditemukan) { "+mahasiswa.getNama()+" }\u001B[0m \n");
        }
    }

    public void berkunjung(Mahasiswa mahasiswa){
        if (validasiKendaraan(mahasiswa)) {
            kapasitasParkir -= mahasiswa.getSizeKendaraan();
            pengunjungKost.add(mahasiswa);
            System.out.println("\u001B[32mMahasiswa bisa berkunjung (+) { "+mahasiswa.getNama()+", " + mahasiswa.getKendaraan()+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mMahasiswa tidak bisa berkunjung (+) { "+mahasiswa.getNama()+", " + mahasiswa.getKendaraan()+" }\u001B[0m");
            detailSekarang();
        }
    }

    public void keluar(Mahasiswa mahasiswa){
        boolean statusKeluar = pengunjungKost.remove(mahasiswa);
        if (statusKeluar) {
            kapasitasParkir += mahasiswa.getSizeKendaraan();
            System.out.println("\u001B[32mMahasiswa keluar (-) { "+mahasiswa.getNama()+" }\u001B[0m");
            detailSekarang();
        } else {
            System.out.println("\u001B[31mMahasiswa tidak keluar (tidak ditemukan) (-) { "+mahasiswa.getNama()+" }\u001B[0m\n");
        }
    }

    public Mahasiswa cariPenghuni(String nama){
        for (Mahasiswa mahasiswa : penghuniKost) {
            if (mahasiswa.getNama().equals(nama)) {
                return mahasiswa;
            }
        }
        return null;
    }

    private void detailSekarang(){
        System.out.println("Kapasitas parkir tersisa: " + kapasitasParkir + " kapasitas kost : " + penghuniKost.size() + " orang \n");
    }
}