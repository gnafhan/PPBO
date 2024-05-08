public class Main {

    public static void main(String[] args) {
        Mobil avanza = new Mobil("Toyota Avanza", 2019, 200000, TIPE_MOBIL.SUV);
        Motor bmw_gs = new Motor("BMW GS", 2018, 500000, JENIS_MESIN.CC1000);
        Truk hino = new Truk("Hino", 2017, 300000, KAPASITAS_ANGKUT.LOWER_20_TON);
        avanza.info_spesifik();
        bmw_gs.info_spesifik();
        hino.info_spesifik();

        avanza.beliSecond();
        bmw_gs.beliSecond();
        hino.beliSecond();

        avanza.biaya_layanan();
        bmw_gs.biaya_layanan();
        hino.biaya_layanan();

        Kendaraan.TukarTambah(avanza, bmw_gs);
        Kendaraan.TukarTambah(bmw_gs, hino);
        Kendaraan.TukarTambah(hino, avanza);
    }



}
