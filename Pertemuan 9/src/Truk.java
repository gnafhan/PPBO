public class Truk extends Kendaraan{
    protected KAPASITAS_ANGKUT kapasitasAngkut;

    public Truk(String merek, int tahunProduksi, int harga, KAPASITAS_ANGKUT kapasitasAngkut){
        super(merek, tahunProduksi, harga);
        this.kapasitasAngkut = kapasitasAngkut;
    }

    @Override
    public void info_spesifik() {
        System.out.println("Merek " + merek +" dengan kapasitas angkut: " + kapasitasAngkut + " dengan harga " + harga + " tahun produksi " + tahunProduksi);
    }

    @Override
    public void biaya_layanan() {
        System.out.println("Biaya Layanannya adalah " + harga * 0.2 * (kapasitasAngkut.ordinal() +1));
    }
}
enum KAPASITAS_ANGKUT{
    LOWER_8_5_TON, LOWER_16_TON, LOWER_20_TON
}
