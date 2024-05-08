public class Motor extends  Kendaraan{
    protected JENIS_MESIN jenisMesin;

    public Motor(String merek, int tahunProduksi, int harga, JENIS_MESIN jenisMesin){
        super(merek, tahunProduksi, harga);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void info_spesifik() {
        System.out.println("Merek " + merek +" dengan jenis Mesin: " + jenisMesin + " dengan harga " + harga + " tahun produksi " + tahunProduksi);
    }

    @Override
    public void biaya_layanan() {
        System.out.println("Biaya Layanannya adalah " + harga * 0.1 * (jenisMesin.ordinal() +1));
    }
}
enum JENIS_MESIN{
    CC110, CC125, CC150, CC250, CC500, CC1000
}