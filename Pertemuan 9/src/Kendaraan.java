import java.time.Year;

abstract public class Kendaraan {
    protected String merek;
    protected int tahunProduksi, harga;

    public Kendaraan(String merek, int tahunProduksi, int harga){
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }
    abstract public void info_spesifik();
     abstract public void biaya_layanan();

     public void beliSecond(){
         int current_year = Year.now().getValue();
//         System.out.println(harga * (current_year-tahunProduksi) * 0.2);
         System.out.println("Terbeli dengan harga: " + harga * (current_year - tahunProduksi) * 0.2);
     }

     public static void TukarTambah(Kendaraan k1, Kendaraan k2){
         int selisih = Math.abs(k1.harga - k2.harga);
         System.out.println("Selisih harga: " + selisih);
         if (k1.harga > k2.harga){
             System.out.println(k1.merek + "memiliki sisa: " + selisih);
         } else {
             System.out.println(k1.merek + " harus menambahkan: " + selisih + " untuk ditukar");
         }
     }
}
