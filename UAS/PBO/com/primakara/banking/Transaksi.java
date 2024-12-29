package com.primakara.banking;

import javax.swing.*;

public class Transaksi {
    private JPanel panelUtama;
    private JLabel labelJudul;
    JFrame frame = new JFrame("Core Banking System");

    public void showPage() {
        frame.setContentPane(new Transaksi().panelUtama);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void hidePage() {
        frame.setVisible(false);
    }
}
