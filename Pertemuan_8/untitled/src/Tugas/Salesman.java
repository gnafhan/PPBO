package Tugas;

public class Salesman extends Karyawan  {
    private int penjualan, targetCapaian;
    public Salesman(int gaji, int targetCapaian, int penjualan, Gender gender){
        super(gaji, gender);
        this.NIK = "S" + countKaryawan;
        this.targetCapaian = targetCapaian;
        this.penjualan = penjualan;
    }

    @Override
    public int getTHR() {
        if (this.penjualan >= this.targetCapaian){
            return this.gaji *2;
        } else {
            return this.gaji;
        }
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "targetCapaian=" + targetCapaian +
                ", NIK='" + NIK + '\'' +
                ", gender=" + gender +
                ", gaji=" + gaji +
                ", cuti=" + cuti +
                '}';
    }
}
