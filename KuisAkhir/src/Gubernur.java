import java.util.ArrayList;

public class Gubernur extends PegawaiNegara{
    private ArrayList<PNS> daftarPNS;
    public Gubernur(String NIP, String daerah, int gajiPokok) {
        super(NIP, daerah, gajiPokok);
        daftarPNS = new ArrayList<>();
    }

    public void dataPNS(PNS pns){
        if (pns.getDaerah() != getDaerah())throw new IllegalArgumentException("Daerah PNS tidak sesuai dengan daerah Gubernur");
        daftarPNS.add(pns);
    }

    public void tambahAnggaran(int anggaran){
        setAPBN(getAPBN() + anggaran);
    }

    public int getTunjangan(){
        return daftarPNS.size() * 100000;
    }

    public void bayarPajak(){
        int pajak = getGajiPokok() * 10 / 100;
        setAPBN(getAPBN() - pajak);
        System.out.println("Pajak berhasil dibayar");
    }
}
