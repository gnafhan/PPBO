package page;

import page.helper.Helper;

import javax.swing.*;
import java.awt.*;

public class CreateBuku extends JPanel {
    JTextField inputJudul, inputPenulis, inputPenerbit, inputTglTerbit;


    // JButton
    JButton submitButton;

    // Labels
    JLabel labelPenulis, labelJudul, labelPenerbit, labelTglTerbit;

    public CreateBuku(Perpustakaan perpustakaan, JFrame frame, JPanel panel, TabelBuku tabelBuku) {
        inputJudul = new JTextField(16);
        inputPenulis = new JTextField(16);
        inputPenerbit = new JTextField(16);
        inputTglTerbit = new JTextField(16);

        labelJudul = new JLabel("Judul Buku: ");
        labelPenulis = new JLabel("Penulis: ");
        labelPenerbit = new JLabel("Penerbit: ");
        labelTglTerbit = new JLabel("Tanggal Terbit: ");

        submitButton = new JButton("Submit");

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        c.gridx = 0;
        c.gridy = 0;
        this.add(labelJudul, c);

        c.gridx = 1;
        this.add(inputJudul, c);

        c.gridx = 0;
        c.gridy = 1;
        this.add(labelPenulis, c);

        c.gridx = 1;
        this.add(inputPenulis, c);

        c.gridx = 0;
        c.gridy = 2;
        this.add(labelPenerbit, c);

        c.gridx = 1;
        this.add(inputPenerbit, c);

        c.gridx = 0;
        c.gridy = 3;
        this.add(labelTglTerbit, c);

        c.gridx = 1;
        this.add(inputTglTerbit, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        this.add(submitButton, c);

        submitButton.addActionListener(e -> {
            perpustakaan.tambahBuku(new Buku(inputJudul.getText(), inputPenulis.getText(), inputPenerbit.getText(), Helper.parseDate(inputTglTerbit.getText())));
            this.setVisible(false);
//            panel.setVisible(true);
            TabelBuku tabelBukus = new TabelBuku(perpustakaan);
            JScrollPane scrollPane = new JScrollPane(tabelBukus);
            JPanel panel1 = new JPanel();
            JButton button = new JButton("Tambah Buku");
            panel1.add(button);
            button.addActionListener(e1 -> {
                perpustakaan.tambahBuku(new Buku("judul y", "penulis x", "penerbit z", Helper.parseDate("12-12-2000")));
                tabelBukus.revalidate();
                panel1.revalidate();
                frame.revalidate();
                System.out.println(perpustakaan.getDaftarBuku());
            });
            panel1.add(scrollPane);
            frame.add(panel1);
            frame.revalidate();
            System.out.println(perpustakaan.getDaftarBuku());

        });
    }
}
