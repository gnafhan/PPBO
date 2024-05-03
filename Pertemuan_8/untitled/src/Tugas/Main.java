package Tugas;

public class Main {
    public static void main(String[] args) {
        Karyawan fatimah = new Karyawan(3000000, Gender.Perempuan);
        Karyawan joko = new Karyawan(3000000, Gender.LakiLaki);
        Manager budi = new Manager(50000000, Kantor.Cabang, Gender.LakiLaki);
        Manager santi = new Manager(50000000, Kantor.Pusat, Gender.Perempuan);
        Salesman andi = new Salesman(2000000, 5, 10, Gender.LakiLaki);
        Salesman rina = new Salesman(2000000, 10, 5, Gender.Perempuan);
        System.out.println(fatimah);
        System.out.println(joko);
        System.out.println(budi);
        System.out.println(santi);
        System.out.println(andi);
        System.out.println(rina);

//        THR Karyawan biasa
        System.out.println("\nTHR Karyawan biasa");
        System.out.println(fatimah.getTHR());

//        THR Manager
        System.out.println("\nTHR Manager :");
        System.out.println("THR Manager Cabang :");
        System.out.println(budi.getTHR());
        System.out.println("\nTHR Manager Pusat :");
        System.out.println(santi.getTHR());

//        THR Salesman
        System.out.println("\nTHR Salesman :");
        System.out.println("THR Salesman Memenuhi Target Capaian :");
        System.out.println(andi.getTHR());
        System.out.println("\nTHR Salesman Tidak Memenuhi Target Capaian :");
        System.out.println(rina.getTHR());

//        Cuti
        System.out.println("\nCuti dengan tambah hari:");
        joko.setCuti(5);
        System.out.println(joko.getCuti());

        System.out.println("\nCuti dengan tipe cuti pernikahan:");
        fatimah.setCuti(TipeCuti.Pernikahan);
        System.out.println(fatimah.getCuti());

        System.out.println("\nCuti dengan tipe cuti melahirkan laki laki:");
        budi.setCuti(TipeCuti.Melahirkan);
        System.out.println(budi.getCuti());

        System.out.println("\nCuti dengan tipe cuti melahirkan perempuan:");
        santi.setCuti(TipeCuti.Melahirkan);
        System.out.println(santi.getCuti());

    }
}
