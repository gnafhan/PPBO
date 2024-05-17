public class Main {
    public static void main(String[] args) {
        System.out.println("==================================== Penumpang ====================================");
        MobilPenumpang mobilPenumpang = new MobilPenumpang("B 1234 ABC", "Merah", "Toyota", TipeMobilPenumpang.REGULAR);
        mobilPenumpang.kopling();
        mobilPenumpang.tambahGigi();
        mobilPenumpang.gas();
        mobilPenumpang.tambahGigi();
        mobilPenumpang.gas();
        mobilPenumpang.tambahGigi();
        mobilPenumpang.gas();
        mobilPenumpang.gas();
        mobilPenumpang.tambahGigi();
        mobilPenumpang.gas();

        mobilPenumpang.rem();
        mobilPenumpang.kurangiGigi();
        mobilPenumpang.rem();
        mobilPenumpang.kurangiGigi();
        mobilPenumpang.kurangiGigi();
        mobilPenumpang.kurangiGigi();


        System.out.println("==================================== Angkutan ====================================");
        MobilAngkutan mobilAngkutan = new MobilAngkutan("B 1234 XYZ", "Biru", "Mitsubishi", 10);
        mobilAngkutan.kopling();
        mobilAngkutan.tambahGigi();
        mobilAngkutan.gas();
        mobilAngkutan.tambahGigi();
        mobilAngkutan.gas();
        mobilAngkutan.tambahGigi();
        mobilAngkutan.gas();
        mobilAngkutan.gas();
        mobilAngkutan.tambahGigi();
        mobilAngkutan.gas();

        mobilAngkutan.rem();
        mobilAngkutan.kurangiGigi();
        mobilAngkutan.rem();
        mobilAngkutan.kurangiGigi();
        mobilAngkutan.kurangiGigi();
        mobilAngkutan.kurangiGigi();

    }
}
