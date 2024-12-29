package com.primakara.banking.bankingGUI;

import javax.swing.*;

public class LaporanFrame extends JFrame {
    public LaporanFrame() {
        setTitle("Laporan");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Laporan akan ditampilkan di sini.");
        add(label);
        setVisible(true);
    }
}
