public class Rak {
    private Obat[] rakObat;
    private int banyak;

    public Rak(int banyak) {
        this.banyak = banyak;
        rakObat = new Obat[banyak];
    }

    public void lihatObat(){
        for (int i = 0; i < banyak; i++) {
            System.out.println("---------------------------------------------------");
            System.out.println(rakObat[i]);
        }
        System.out.println("---------------------------------------------------");
    }

    public void tambahObat(String name, int price, int stock, int index){
        Validation.isIndexValid(index, banyak);
        Validation.isIndexIsExist(rakObat, index);
        Validation.isLowerPrice(rakObat, index, price);
        rakObat[index] = new Obat(name, price, stock);
    }

    public void pindahObat(int from, int to){
        Validation.isIndexValid(from, banyak);
        Validation.isIndexValid(to, banyak);
        Validation.isIndexIsExist(rakObat, to);
        rakObat[to] = rakObat[from];
        rakObat[from] = null;
    }

    public void beliObat (int index, int jumlah){
        Validation.isIndexValid(index, banyak);
        Validation.isIndexIsNotExist(rakObat, index);
        Validation.isStockEnough(rakObat[index], jumlah);
        rakObat[index].setStok(rakObat[index].getStok()-jumlah);
    }
}
