public class Validation {
    public static void isIndexValid(int index, int banyak){
        if (index < 0 || index >= banyak){
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public static void isIndexIsExist(Obat[] rakObat, int index){
        if (rakObat[index] != null){
            throw new NullPointerException("Obat sudah ada");
        }
    }

    public static void isIndexIsNotExist(Obat[] rakObat, int index){
        if (rakObat[index] == null){
            throw new NullPointerException("Obat tidak ada");
        }
    }

    public static void isStockEnough(Obat obat, int jumlah){
        if (obat.getStok() < jumlah){
            throw new IllegalArgumentException("Stok tidak cukup");
        }
    }

    public static void isLowerPrice(Obat[] rakObat, int index, int harga){
        if (index != 0){
            if (rakObat[index-1]!= null){
                if (  rakObat[index-1].getHarga() > harga){
                    throw new IllegalArgumentException("Harga lebih rendah dari index sebelumnya");
                }
            }
        }
    }

}
