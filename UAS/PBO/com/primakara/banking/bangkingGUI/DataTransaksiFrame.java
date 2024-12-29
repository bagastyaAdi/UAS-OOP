package com.primakara.banking.bankingGUI;

import javax.swing.*;

public class DataTransaksiFrame extends JFrame {
    public DataTransaksiFrame() {
        setTitle("Data Transaksi");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Placeholder untuk tabel
        String[] kolom = {"ID Transaksi", "Tanggal", "Jumlah"};
        Object[][] data = {}; // Data kosong
        JTable table = new JTable(data, kolom);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
        setVisible(true);
    }
}
