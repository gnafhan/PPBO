public class MobilPenumpang extends Mobil  {
    TipeMobilPenumpang tipe;

    public MobilPenumpang(String nopol, String warna, String merk, TipeMobilPenumpang tipe){
        super(nopol, warna, merk);
        this.tipe = tipe;
    }
    @Override
    public void tambahGigi() {
        if (!this.isDikopling && this.tipe == TipeMobilPenumpang.REGULAR) return;
        this.gigi++;
        if (this.gigi > 5){
            this.gigi = 5;
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
        } else if (this.gigi-1 < 4 &&this.kecepatan > 40) {
            this.gigi = 4;
        } else if (this.gigi-1 < 5 &&this.kecepatan > 70) {
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
        } else if (this.gigi == 3 && new_kecepatan > 40) {
            this.kecepatan = 40;
        } else if (this.gigi == 4 && new_kecepatan > 70) {
            this.kecepatan = 70;
        } else if (this.gigi == 5 && new_kecepatan > 100) {
            this.kecepatan = 100;
        } else {
            this.kecepatan = new_kecepatan;
        }
        System.out.println("Kecepatan saat ini: " + this.kecepatan);
    }
}
