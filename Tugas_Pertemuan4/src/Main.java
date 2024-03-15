public class Main {
    public static void main(String[] args) {
        Kost kost1 = new Kost();
        kost1.setNamaKost("Kost 1");
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Doni");
        mahasiswa1.setUniversitas("UGM");
        mahasiswa1.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Fulan");
        mahasiswa2.setUniversitas("UGM");
        mahasiswa2.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNama("Fulanah");
        mahasiswa3.setUniversitas("UGM");
        mahasiswa3.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.setNama("Ali");
        mahasiswa4.setUniversitas("ITB");
        mahasiswa4.setKendaraan(Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa5 = new Mahasiswa();
        mahasiswa5.setNama("Citra");
        mahasiswa5.setUniversitas("ITS");
        mahasiswa5.setKendaraan(Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa6 = new Mahasiswa();
        mahasiswa6.setNama("Dewi");
        mahasiswa6.setUniversitas("Unpad");
        mahasiswa6.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa7 = new Mahasiswa();
        mahasiswa7.setNama("Eko");
        mahasiswa7.setUniversitas("UI");
        mahasiswa7.setKendaraan(Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa8 = new Mahasiswa();
        mahasiswa8.setNama("Fitri");
        mahasiswa8.setUniversitas("UGM");
        mahasiswa8.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa9 = new Mahasiswa();
        mahasiswa9.setNama("Guntur");
        mahasiswa9.setUniversitas("ITB");
        mahasiswa9.setKendaraan(Mahasiswa.Kendaraan.MOTOR);
        Mahasiswa mahasiswa10 = new Mahasiswa();
        mahasiswa10.setNama("Hani");
        mahasiswa10.setUniversitas("UI");
        mahasiswa10.setKendaraan(Mahasiswa.Kendaraan.MOBIL);
        Mahasiswa mahasiswa11 = new Mahasiswa();

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

        Mahasiswa mahasiswaKunjung1 = new Mahasiswa();
        mahasiswaKunjung1.setNama("Iwan");
        mahasiswaKunjung1.setUniversitas("UGM");
        mahasiswaKunjung1.setKendaraan(Mahasiswa.Kendaraan.MOTOR);
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