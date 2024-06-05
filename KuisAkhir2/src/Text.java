import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Text extends JFrame implements ActionListener {
    // JTextFields
    static JTextField inputJudul, inputPenulis, inputPenerbit, inputTglTerbit;

    // JFrame
    static JFrame frame;

    // JButton
    static JButton submitButton;

    // Labels
    static JLabel labelPenulis, labelJudul, labelPenerbit, labelTglTerbit;

    // Default constructor
    Text() {
    }

    // Main method
    public static void main(String[] args) {
        // Create a new frame to store text fields and button
        frame = new JFrame("Textfield Example");

        // Create labels
        labelJudul = new JLabel("Judul Buku: ");
        labelPenulis = new JLabel("Penulis: ");
        labelPenerbit = new JLabel("Penerbit: ");
        labelTglTerbit = new JLabel("Tanggal Terbit: ");

        // Create a new button
        submitButton = new JButton("Submit");

        // Create an object of the Text class
        Text te = new Text();

        // Add ActionListener to the button
        submitButton.addActionListener(te);

        // Create JTextFields with 16 columns
        inputJudul = new JTextField(16);
        inputPenulis = new JTextField(16);
        inputPenerbit = new JTextField(16);
        inputTglTerbit = new JTextField(16);

        // Create a panel with GridBagLayout
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add labels and text fields to the panel with constraints
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        c.gridx = 0;
        c.gridy = 0;
        p.add(labelJudul, c);

        c.gridx = 1;
        c.gridy = 0;
        p.add(inputJudul, c);

        c.gridx = 0;
        c.gridy = 1;
        p.add(labelPenulis, c);

        c.gridx = 1;
        c.gridy = 1;
        p.add(inputPenulis, c);

        c.gridx = 0;
        c.gridy = 2;
        p.add(labelPenerbit, c);

        c.gridx = 1;
        c.gridy = 2;
        p.add(inputPenerbit, c);

        c.gridx = 0;
        c.gridy = 3;
        p.add(labelTglTerbit, c);

        c.gridx = 1;
        c.gridy = 3;
        p.add(inputTglTerbit, c);

        c.gridx = 1;
        c.gridy = 4;
        p.add(submitButton, c);

        // Add panel to frame
        frame.add(p);

        // Set the size of frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Action performed method
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            // Get text from text fields and display it
            String judul = inputJudul.getText();
            String penulis = inputPenulis.getText();
            String penerbit = inputPenerbit.getText();
            String tglTerbit = inputTglTerbit.getText();

            System.out.println("Judul Buku: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Penerbit: " + penerbit);
            System.out.println("Tanggal Terbit: " + tglTerbit);
        }
    }
}
