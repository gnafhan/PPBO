package Tugas;

public class Main {
    public static void main(String[] args) {
        Kost kostAsri = new Kost();
        Mahasiswa mahasiswa1 = new Mahasiswa("Bude", "UI", Kost.penghuniKost.size()+1, Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa2 = new Mahasiswa("Fulan", "UGM", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa3 = new Mahasiswa("Fulanah", "UGM", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa4 = new Mahasiswa("Ali", "ITB", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa5 = new Mahasiswa("Citra", "ITS", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa6 = new Mahasiswa("Dewi", "Unpad", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa7 = new Mahasiswa("Eko", "UI", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa8 = new Mahasiswa("Fitri", "UGM", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa9 = new Mahasiswa("Guntur", "ITB", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa10 = new Mahasiswa("Hani", "UI", Kost.penghuniKost.size() + 1, Mahasiswa.Kendaraan.MOBIL);

        kostAsri.tambahPenghuni(mahasiswa1);
        kostAsri.tambahPenghuni(mahasiswa2);
        kostAsri.tambahPenghuni(mahasiswa3);
        kostAsri.tambahPenghuni(mahasiswa4);
        kostAsri.tambahPenghuni(mahasiswa5);
        kostAsri.tambahPenghuni(mahasiswa6);
        kostAsri.tambahPenghuni(mahasiswa7);
        kostAsri.tambahPenghuni(mahasiswa8);
        kostAsri.tambahPenghuni(mahasiswa9);
        kostAsri.tambahPenghuni(mahasiswa10);

        kostAsri.hapusPenghuni(mahasiswa2);
        kostAsri.tambahPenghuni(mahasiswa10);
        kostAsri.hapusPenghuni(mahasiswa2);



    }
}
