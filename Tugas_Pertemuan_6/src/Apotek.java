import java.util.Scanner;

public class Apotek {
    private static Scanner scanner = new Scanner(System.in);
    private static Rak rak;
    public static void start(){
        System.out.print("Masukkan panjang rak: ");
        int jumlahObat = scanner.nextInt();
        rak = new Rak(jumlahObat);
        while (true){
            menu();
        }
    }

    private static void menu(){
        System.out.println("Selamat datang di Apotek");
        System.out.println("1. Lihat Obat");
        System.out.println("2. Tambah Obat");
        System.out.println("3. Pindah Obat");
        System.out.println("4. Beli Obat");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                rak.lihatObat();
                break;
            case 2:
                tambahObat();
                break;
            case 3:
                pindahObat();
                break;
            case 4:
                beliObat();
                break;
            case 5:
                System.out.println("Tetap semangat, mungkin esok akan lebih baik");
                System.exit(0);
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }

    private static void tambahObat(){
        System.out.println("Masukkan obat: ");
        System.out.print("Nama obat: ");
        String nama = scanner.next();
        System.out.print("Harga obat: ");
        int harga = scanner.nextInt();
        System.out.print("Stok obat: ");
        int stok = scanner.nextInt();
        System.out.print("Posisi obat: ");
        int index = scanner.nextInt();
        try{
        rak.tambahObat(nama, harga, stok, index);
        } catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            tambahObat();
        }
    }

    private static void pindahObat(){
        System.out.println("Masukkan obat: ");
        System.out.print("Posisi obat dari: ");
        int from = scanner.nextInt();
        System.out.print("Posisi obat ke: ");
        int to = scanner.nextInt();
        try{
        rak.pindahObat(from, to);
        } catch (Exception e){
            System.out.println(e.getMessage());
            pindahObat();
        }
    }

    private static void beliObat(){
        System.out.println("Masukkan obat: ");
        System.out.print("Posisi obat: ");
        int index = scanner.nextInt();
        System.out.print("Jumlah obat: ");
        int jumlah = scanner.nextInt();
        try{
            rak.beliObat(index, jumlah);
        } catch (Exception e){
            System.out.println(e.getMessage());
            beliObat();
        }
    }
}
