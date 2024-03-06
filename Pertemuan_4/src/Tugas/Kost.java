package Tugas;

import java.util.ArrayList;

public class Kost {
    String namaKost;
    static ArrayList<Mahasiswa> penghuniKost = new ArrayList();

    static Integer kapasitasParkir = 22;

    public void tambahPenghuni(Mahasiswa mahasiswa){
        tampilkanPenghuni();
        if (validasiKendaraan(mahasiswa) && validasiSize()) {
            kapasitasParkir -= mahasiswa.sizeKendaraan;
            penghuniKost.add(mahasiswa);
            System.out.println("Penghuni kost bertambah, kapasitas kos :" + penghuniKost.size() + " kapasitas parkir : " + kapasitasParkir);
        } else {
            System.out.println("Penghuni kost tidak bertambah, kapasitas kos :" + penghuniKost.size() + " kapasitas parkir : " + kapasitasParkir);
        }
    }

    private boolean validasiKendaraan(Mahasiswa mahasiswa) {
        return mahasiswa.sizeKendaraan <= kapasitasParkir;
    }

    private boolean validasiSize(){
        return penghuniKost.size() < 8;
    }

    public void hapusPenghuni(Mahasiswa mahasiswa){
        try {
            tampilkanPenghuni();
            penghuniKost.remove(mahasiswa);
            kapasitasParkir += mahasiswa.sizeKendaraan;
            System.out.println("Penghuni kost berkurang");
        }catch (Exception e){
            System.out.println("Penghuni tidak ditemukan");
        }
    }

    public void berkunjung(Mahasiswa mahasiswa){
        if (validasiKendaraan(mahasiswa) && validasiSize()) {
            kapasitasParkir -= mahasiswa.sizeKendaraan;
            System.out.println("Mahasiswa berkunjung");
        } else {
            System.out.println("Mahasiswa tidak berkunjung");
        }
    }

    public void keluar(Mahasiswa mahasiswa){
        kapasitasParkir += mahasiswa.sizeKendaraan;
        System.out.println("Mahasiswa keluar");
    }

    public Mahasiswa cariPenghuni(String nama){
        for (Mahasiswa mahasiswa : penghuniKost) {
            if (mahasiswa.nama.equals(nama)) {
                return mahasiswa;
            }
        }
        return null;
    }

    private void tampilkanPenghuni(){
        System.out.println("Penghuni kost : " + penghuniKost.size() + " kapasitas parkir : " + kapasitasParkir);
    }


}
