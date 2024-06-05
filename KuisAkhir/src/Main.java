public class Main {
    public static void main(String[] args) {
//        PNS
        System.out.println("=====================================PNS=====================================");
        PNS pns1 = new PNS("23/11111/111/AA/22", "Jakarta", 10000000, GOLONGAN_PNS.III);
        RakyatJelata rakyat1 = new RakyatJelata(1000000, "Jakarta");
        RakyatJelata rakyat2 = new RakyatJelata(1000000000, "Jakarta");
        RakyatJelata rakyat3 = new RakyatJelata(1000000000, "Bandung");
        pns1.dataRakyat(rakyat1);
        pns1.dataRakyat(rakyat2);
        try {
            pns1.dataRakyat(rakyat3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        pns1.beriBantuan();
        System.out.println(rakyat1.getJumlahKekayaan());
        System.out.println(rakyat2.getJumlahKekayaan());
        System.out.println(rakyat3.getJumlahKekayaan());
        System.out.println("APBN: "+ PegawaiNegara.getAPBN());
        System.out.println("Tunjangan pns1: " + pns1.getTunjangan());
        pns1.bayarPajak();

        System.out.println("=====================================Gubernur=====================================");

//        Gubernur
        Gubernur gubernur1 = new Gubernur("23/11111/111/AA/22", "Jakarta", 10000000);
        PNS pns2 = new PNS("23/11111/111/AA/22", "Jakarta", 10000000, GOLONGAN_PNS.III);
        PNS pns3 = new PNS("23/11111/111/AA/22", "Jakarta", 10000000, GOLONGAN_PNS.III);
        PNS pns4 = new PNS("23/11111/111/AA/22", "Jakarta", 10000000, GOLONGAN_PNS.III);
        gubernur1.dataPNS(pns2);
        gubernur1.dataPNS(pns3);
        gubernur1.dataPNS(pns4);
        System.out.println("Tunjangan gubernur1: " + gubernur1.getTunjangan());
        gubernur1.bayarPajak();
        System.out.println(PegawaiNegara.getAPBN());
        gubernur1.tambahAnggaran(1000000);
        System.out.println(PegawaiNegara.getAPBN());

        System.out.println("=====================================DPRD=====================================");
        DPRD dprd1 = new DPRD("23/11111/111/AA/22", "Jakarta", 10000000);
        dprd1.kunjunganKerja();
        dprd1.kunjunganKerja();
        dprd1.kunjunganKerja();
        System.out.println("Tunjangan dprd1: " + dprd1.getTunjangan());
        dprd1.bayarPajak();
        System.out.println(PegawaiNegara.getAPBN());

        System.out.println("=====================================RakyatJelata=====================================");
        RakyatJelata rakyat4 = new RakyatJelata(1000000, "Jakarta");
        rakyat4.bayarPajak();
    }
}
