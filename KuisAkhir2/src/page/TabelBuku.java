package page;

import javax.swing.*;

public class TabelBuku extends JTable {

    public TabelBuku(Perpustakaan perpustakaan){

        String[][] data;
        data = new String[perpustakaan.getDaftarBuku().size()][6];
        for (int i = 0; i < perpustakaan.getDaftarBuku().size(); i++) {
            data[i][0] = String.valueOf(i+1);
            data[i][1] = perpustakaan.getDaftarBuku().get(i).getJudul();
            data[i][2] = perpustakaan.getDaftarBuku().get(i).getPenulis();
            data[i][3] = perpustakaan.getDaftarBuku().get(i).getPenerbit();
            data[i][4] = perpustakaan.getDaftarBuku().get(i).getTglTerbit().toString();
            data[i][5] = perpustakaan.getDaftarBuku().get(i).getTglTambah().toString();
        }


        // Column Names
        String[] columnNames = { "Id","Judul Buku", "Penulis", "Penerbit", "Tanggal Terbit", "Tanggal Ditambahkan" };
        super(data, columnNames);
    }

    public void refresh(){
        this.revalidate();
    }
}
