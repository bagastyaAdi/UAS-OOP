package com.primakara.banking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel panelUtama;
    private JButton btnDataNasabah;
    private JButton btnTransaksi;
    private JButton btnLaporan;
    private JLabel labelJudul;

    DataNasabah nasabahPage = new DataNasabah();
    Transaksi transaksiPage = new Transaksi();
    Laporan laporanPage     = new Laporan();

    public Home() {
        btnDataNasabah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nasabahPage.showPage();
            }
        });
        btnTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transaksiPage.showPage();
            }
        });
        btnLaporan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laporanPage.showPage();
            }
        });
    }

    public void createPage() {
        JFrame frame = new JFrame("Core Banking System");
        frame.setContentPane(new Home().panelUtama);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
