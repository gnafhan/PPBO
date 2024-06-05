package page;

import page.helper.Helper;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Frame extends JFrame {
    private JFrame frame;

    public Frame(){
        frame = new JFrame("Sistem Buku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1200, 300);
        read();
        frame.setVisible(true);
    }

    private void read(){
        JPanel panel = new JPanel();
        JButton button = new JButton("Tambah Buku");
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(new Buku("Buku 1", "Penulis 1", "Penerbit 1", Helper.parseDate("01-01-2024")));
        TabelBuku tabelBuku = new TabelBuku(perpustakaan);
        JScrollPane scrollPane = new JScrollPane(tabelBuku);
        tabelBuku.setBounds(30, 40, 1000, 300);
        scrollPane.setBounds(30, 40, 1000, 300);
        panel.add(button);
        panel.add(scrollPane);

        CreateBuku createBuku = new CreateBuku(perpustakaan, frame, panel, tabelBuku);
        createBuku.setBounds(30, 40, 1000, 300);
        button.addActionListener(e -> {
            panel.revalidate();
            panel.repaint();
            tabelBuku.revalidate();
            scrollPane.revalidate();

//            frame.removeAll();



        });
        panel.setVisible(false);
        frame.add(createBuku);
        frame.add(panel);
    }


}
