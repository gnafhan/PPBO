public class RakyatJelata {
    private int jumlahKekayaan;
    private String alamat;

    public RakyatJelata(int jumlahKekayaan, String alamat) {
        this.jumlahKekayaan = jumlahKekayaan;
        this.alamat = alamat;
    }

    public int getJumlahKekayaan() {
        return jumlahKekayaan;
    }

    public void setJumlahKekayaan(int jumlahKekayaan) {
        this.jumlahKekayaan = jumlahKekayaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void bayarPajak(){
        int pajak = getJumlahKekayaan() * 1 / 100;
        setJumlahKekayaan(getJumlahKekayaan() - pajak);
        PegawaiNegara.setAPBN(PegawaiNegara.getAPBN() + pajak);
        System.out.println("Pajak berhasil dibayar");
    }
}
