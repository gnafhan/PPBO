public class Main {
    public static void main(String[] args) {
        Kost kost1 = new Kost();
        Mahasiswa mahasiswa1 = new Mahasiswa("Bude", "UI",  Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa2 = new Mahasiswa("Fulan", "UGM",  Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa3 = new Mahasiswa("Fulanah", "UGM",  Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa4 = new Mahasiswa("Ali", "ITB",  Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa5 = new Mahasiswa("Citra", "ITS",  Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa6 = new Mahasiswa("Dewi", "Unpad",  Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa7 = new Mahasiswa("Eko", "UI",  Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa8 = new Mahasiswa("Fitri", "UGM",  Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa9 = new Mahasiswa("Guntur", "ITB",  Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa10 = new Mahasiswa("Hani", "UI",  Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa11 = new Mahasiswa("Iwan", "UGM",  Mahasiswa.Kendaraan.MOTOR);

        kost1.tambahPenghuni(mahasiswa1);
        kost1.tambahPenghuni(mahasiswa2);
        kost1.tambahPenghuni(mahasiswa3);
        kost1.tambahPenghuni(mahasiswa4);
        kost1.tambahPenghuni(mahasiswa5);
        kost1.tambahPenghuni(mahasiswa6);
        kost1.tambahPenghuni(mahasiswa7);
        kost1.tambahPenghuni(mahasiswa8);
        kost1.tambahPenghuni(mahasiswa9);
        kost1.tambahPenghuni(mahasiswa10);
        kost1.tambahPenghuni(mahasiswa11);

        kost1.hapusPenghuni(mahasiswa1);
        kost1.hapusPenghuni(mahasiswa1);
        kost1.tambahPenghuni(mahasiswa11);

        Mahasiswa mahasiswaKunjung1 = new Mahasiswa("Budi", "UGM",  Mahasiswa.Kendaraan.MOTOR);
        kost1.berkunjung(mahasiswaKunjung1);

        kost1.hapusPenghuni(mahasiswaKunjung1);
        kost1.hapusPenghuni(mahasiswa3);
        kost1.berkunjung(mahasiswaKunjung1);
        kost1.keluar(mahasiswaKunjung1);
        kost1.keluar(mahasiswaKunjung1);
        kost1.keluar(mahasiswa11);

        Mahasiswa cariIwan = kost1.cariPenghuni("Iwan");
        Mahasiswa cariDoni = kost1.cariPenghuni("Doni");
        System.out.println(cariIwan == null ? "\u001B[31mData tidak ditemukan\u001B[0m\n" : "\u001B[32m" + cariIwan + "\u001B[0m\n");
        System.out.println(cariDoni == null ? "\u001B[31mData tidak ditemukan\u001B[0m\n" : cariDoni + "\n");
    }
}