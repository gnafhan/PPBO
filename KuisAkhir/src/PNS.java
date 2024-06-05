import java.util.ArrayList;

public class PNS extends PegawaiNegara{
    private GOLONGAN_PNS golongan;
    private ArrayList<RakyatJelata> daftarRakyat;
    public PNS(String NIP, String daerah, int gajiPokok, GOLONGAN_PNS golongan) {
        super(NIP, daerah, gajiPokok);
        daftarRakyat = new ArrayList<>();
        this.golongan = golongan;
    }

    public void dataRakyat(RakyatJelata rakyat){
        if (rakyat.getAlamat() != getDaerah())throw new IllegalArgumentException("Alamat rakyat tidak sesuai dengan daerah PNS");
        daftarRakyat.add(rakyat);
    }

    public void beriBantuan(){
        for (RakyatJelata rakyat : daftarRakyat){
            if (rakyat.getJumlahKekayaan() < 1000000000){
                setAPBN(getAPBN() - 1000000);
                rakyat.setJumlahKekayaan(rakyat.getJumlahKekayaan() + 1000000);
                System.out.println("Bantuan berhasil dberikan, Jangan lupa pilih 02");
            }
        }
    }

    public int getTunjangan(){
        return (golongan.ordinal() +1) * 100000;
    }

    public void bayarPajak(){
        int pajak = getGajiPokok() * 5 / 100;
        setAPBN(getAPBN() + pajak);
        System.out.println("Pajak berhasil dibayar");
    }
}

enum GOLONGAN_PNS{
    I, II, III, IV
}