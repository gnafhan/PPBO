public class MobilAngkutan extends Mobil{
    int kapasitas_maksimum;
    public MobilAngkutan(String nopol, String warna, String merk, int kapasitas_maksimum){
        super(nopol, warna, merk);
        this.kapasitas_maksimum = kapasitas_maksimum;
    }
    @Override
    public void tambahGigi() {
        if (!this.isDikopling) return;
        this.gigi++;
        if (this.gigi > 6){
            this.gigi = 6;
        }
        System.out.println("Gigi saat ini: " + this.gigi);
    }

    @Override
    public void kurangiGigi() {
        if (!this.isDikopling)return;
        if (this.gigi-1 < 1 && this.kecepatan > 0){
            this.gigi = 1;
        } else if (this.gigi-1 < 2 &&this.kecepatan > 10) {
            this.gigi = 2;
        } else if (this.gigi-1 < 3 &&this.kecepatan > 20) {
            this.gigi = 3;
        } else if (this.gigi-1 < 4 &&this.kecepatan > 30) {
            this.gigi = 4;
        } else if (this.gigi-1 < 5 &&this.kecepatan > 50) {
            this.gigi = 5;
        } else{
            gigi--;
        }
        System.out.println("Gigi saat ini: " + this.gigi);
    }

    @Override
    public void gas() {
        int new_kecepatan = this.kecepatan + 10;
        if(this.gigi== 0)return;
        if (this.gigi == 1 && new_kecepatan > 10){
            this.kecepatan = 10;
        } else if (this.gigi == 2 && new_kecepatan > 20) {
            this.kecepatan = 20;
        } else if (this.gigi == 3 && new_kecepatan > 30) {
            this.kecepatan = 30;
        } else if (this.gigi == 4 && new_kecepatan > 50) {
            this.kecepatan = 50;
        } else if (this.gigi == 5 && new_kecepatan > 80) {
            this.kecepatan = 80;
        } else {
            this.kecepatan = new_kecepatan;
        }
        System.out.println("Kecepatan saat ini: " + this.kecepatan);
    }
}
