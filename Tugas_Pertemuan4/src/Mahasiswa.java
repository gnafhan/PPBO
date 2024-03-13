public class Mahasiswa {
    private String nama, universitas;
    private Integer nomorKamar;

    private Kendaraan kendaraan;

    private Integer sizeKendaraan;
    static enum Kendaraan{
        MOTOR, MOBIL
    }
    public Mahasiswa(String nama, String universitas, Kendaraan kendaraan){
        this.nama = nama;
        this.universitas = universitas;
        this.kendaraan = kendaraan;
        this.sizeKendaraan = (Kendaraan.valueOf(kendaraan.toString()).ordinal() +1) *2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getSizeKendaraan() {
        return sizeKendaraan;
    }

    public void setSizeKendaraan(Integer sizeKendaraan) {
        this.sizeKendaraan = sizeKendaraan;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public Integer getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(Integer nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", universitas='" + universitas + '\'' +
                ", nomorKamar=" + nomorKamar +
                ", kendaraan=" + kendaraan +
                '}';
    }
}