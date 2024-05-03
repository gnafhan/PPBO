package Tugas;

public class Karyawan {
    protected String NIK;
    protected Gender gender;
    protected int gaji, cuti;
    static int countKaryawan = 0;

    public Karyawan(int gaji, Gender gender) {
        countKaryawan++;
        this.NIK = "K" + countKaryawan;
        this.gaji = gaji;
        this.cuti = 12;
        this.gender = gender;
    }

    public int getTHR(){
        return this.gaji;
    }

    public int getCuti() {
        return cuti;
    }
    public void setCuti(TipeCuti tipeCuti){
        if (tipeCuti == TipeCuti.Pernikahan){
            this.cuti += 2;
        } else {
            if (this.gender == Gender.LakiLaki){
                this.cuti += 3;
            } else {
                this.cuti += 90;
            }
        }
    }

    public void setCuti(int hariCuti){
        this.cuti += hariCuti;
    }


    @Override
    public String toString() {
        return "Karyawan{" +
                "NIK='" + NIK + '\'' +
                ", gender=" + gender +
                ", gaji=" + gaji +
                ", cuti=" + cuti +
                '}';
    }
}

enum Gender {
    LakiLaki, Perempuan
}

enum TipeCuti {
    Pernikahan, Melahirkan;
}
