public class Mahasiswa {
    String nama, universitas;
    Integer nomorKamar;
    static enum Kendaraan{
        MOTOR, MOBIL
    }

    Kendaraan kendaraan;

    Integer sizeKendaraan;

    public Mahasiswa(String nama, String universitas, Kendaraan kendaraan){
        this.nama = nama;
        this.universitas = universitas;
        this.kendaraan = kendaraan;
        this.sizeKendaraan = (Kendaraan.valueOf(kendaraan.toString()).ordinal() +1) *2;
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