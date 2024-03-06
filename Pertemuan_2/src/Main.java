import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> check = new ArrayList();
//        Integer[] array2 = {1,2,3,4,5,6};
//        T[] array = {1, "1", 1};
//        System.out.println(array2[5]);
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        char[] arrNama = new char[len];
//        for (int i = 0; i < len; i++) {
//            arrNama[i] = scanner.next().charAt(0);
//        }
//        String nama = "";
//        for (char i: arrNama ) {
//            nama += i;
//        }
//        System.out.println(nama);
//        ArrayList<String> nama = new ArrayList();
//        nama.add("ghifari nafhan");
//        nama.add("aaaa");
//        System.out.println(nama);
//
//        for (int j = 0; j < genap.length; j+=1) {
//            genap[j] = j*2+2;
//        }
//        for (int a: genap
//             ) {
//            System.out.println(a);
//        }
//        System.out.println(genap);

        int[] genap = new int[5];
        int i = 0;
        while (i<genap.length){
            genap[i] = i * 2 + 2;
            i+=1;
        }
        i = 0;
        while (i<genap.length){
            System.out.println(genap[i]);
            i++;
        }

        do {
            i-=1;
            System.out.println(i*2);
        }while (i>1);

    }
}




