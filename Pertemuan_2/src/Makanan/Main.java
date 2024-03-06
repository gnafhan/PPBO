package Makanan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arrayBarang = {"Beras", "Minyak", "Daging", "Air Mineral", "Kopi", "Mie Instan", "Sayur"};
        int[]   hargaBarang = {35000, 25000, 70000, 20000, 30000,20000, 10000};
        int uangDariel = 200000;
        String catatanDariel = "";
        int totalHarga = 0;
        int totalHargaBudget = 0;
        ArrayList<String> arrayCatatan = new ArrayList();
        ArrayList<String> tidakBisaDibeli = new ArrayList();
        for ( String barang:arrayBarang) {
            arrayCatatan.add(barang);
            catatanDariel += barang + " ";
        }
        System.out.println("Barang yang dibeli darriel = " + catatanDariel);
        System.out.println("Array barang yang dibeli darriel = " + arrayCatatan);
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.println("Nama Barang: " + arrayBarang[i] + ", Harga Barang: " + hargaBarang[i] );
            if (totalHarga+hargaBarang[i]>200000){
                tidakBisaDibeli.add(arrayBarang[i]);
            } else {
                totalHargaBudget += hargaBarang[i];
            }
            totalHarga += hargaBarang[i];
        }
        System.out.println("Total Harga Semua Barang : " + totalHarga);
        System.out.println("Total Harga Barang yang Dapat Dibeli Darriel : " + totalHargaBudget);
        if (totalHarga>totalHargaBudget){
            System.out.println("Budget tidak mencukupi, barang yang tidak bisa dibeli : ");
            for (String barang: tidakBisaDibeli) {
                System.out.println(barang);
            }
        } else{
            System.out.println("Semua barang dapat dibeli");
        }
        
    }
}
