package Tugas;

public class Manager extends Karyawan{
    private Kantor kantor;
    public Manager(int gaji, Kantor kantor, Gender gender){
        super(gaji, gender);
        countKaryawan++;
        this.kantor = kantor;
        this.NIK = "M" + countKaryawan;
    }

    @Override
    public int getTHR(){
        if (this.kantor == Kantor.Cabang){
            return Math.round(this.gaji * 2.5f);
        } else {
            return this.gaji * 3;
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "kantor=" + kantor +
                ", NIK='" + NIK + '\'' +
                ", gender=" + gender +
                ", gaji=" + gaji +
                ", cuti=" + cuti +
                '}';
    }
}

enum Kantor {
    Cabang, Pusat
}
