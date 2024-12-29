package com.primakara.banking;

import javax.swing.*;

public class DataNasabah {
    private JPanel panelUtama;
    private JLabel labelJudul;
    private JPanel panelJudul;
    private JPanel panelTombol;
    private JButton btnSubmit;
    private JButton button1;
    private JButton button2;

    JFrame frame = new JFrame("Core Banking System");


    public void showPage() {
        frame.setContentPane(new DataNasabah().panelUtama);
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
