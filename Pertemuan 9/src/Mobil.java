public class Mobil extends Kendaraan{
    protected TIPE_MOBIL tipeMobil;

    public Mobil(String merek, int tahunProduksi, int harga, TIPE_MOBIL tipeMobil){
        super(merek, tahunProduksi, harga);
        this.tipeMobil = tipeMobil;
    }

    @Override
    public void info_spesifik() {
        System.out.println("Merek " + merek +" dengan tipe mobil: " + tipeMobil + " dengan harga " + harga + " tahun produksi " + tahunProduksi);
    }

    @Override
    public void biaya_layanan() {
        System.out.println("Biaya Layanannya adalah " + harga * 0.1 * (tipeMobil.ordinal() +1));
    }
}

enum TIPE_MOBIL {
    SUV, SEDAN, DOUBLE_CABIN, CROSSOVER, HATCHBACK
}