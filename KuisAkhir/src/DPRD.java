import java.util.ArrayList;

public class DPRD extends PegawaiNegara{
    private int jumlahKunjungan;
    private ArrayList<String> aspirasiRakyat;
    public DPRD(String NIP, String daerah, int gajiPokok) {
        super(NIP, daerah, gajiPokok);
    }

    public void tampungAspirasi(String aspirasi){
        aspirasiRakyat.add(aspirasi);
        System.out.println("Aspirasi berhasil ditampung (ditampung doang)");
    }

    public void kunjunganKerja() {
        jumlahKunjungan++;
        System.out.println("Kunjungan berhasil dilakukan (sekalian jalan-jalan mumpung gratis)");
    }

    public int getTunjangan(){
        return jumlahKunjungan * 1000000;
    }

    public void bayarPajak(){
        int pajak = getGajiPokok() * 2 / 100;
        setAPBN(getAPBN() - pajak);
        System.out.println("Pajak berhasil dibayar");
    }
}
