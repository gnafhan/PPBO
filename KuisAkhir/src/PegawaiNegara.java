public abstract class PegawaiNegara {
    private String NIP, daerah;
    private int gajiPokok;

    private static int APBN = 1000000000;

    public PegawaiNegara(String NIP, String daerah, int gajiPokok) {
        this.NIP = NIP;
        this.daerah = daerah;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public static int getAPBN() {
        return APBN;
    }

    public static void setAPBN(int APBN) {
        PegawaiNegara.APBN = APBN;
    }
}
