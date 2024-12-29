package com.primakara.banking.bangkingGUI;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainMenuFrame extends JFrame {
    public MainMenuFrame() {
        setTitle("Menu Utama");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelUtama = new JPanel(new BorderLayout());
        panelUtama.setBorder(new EmptyBorder(20, 20, 20, 20)); // Padding atas, kiri, bawah, kanan


        // Panel tombol
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton btnTambahNasabah = new JButton("Tambahkan Nasabah");
        JButton btnDataTransaksi = new JButton("Data Transaksi");
        JButton btnLaporan = new JButton("Laporan");

        // Tambahkan tombol ke panel
        panel.add(btnTambahNasabah);
        panel.add(btnDataTransaksi);
        panel.add(btnLaporan);


        panelUtama.add(panel, BorderLayout.CENTER);
        add(panelUtama);
        setVisible(true);

        // Listener tombol
        btnTambahNasabah.addActionListener(e -> {
            new TambahNasabahFrame(); // Buka frame Tambah Nasabah
        });

        btnDataTransaksi.addActionListener(e -> {
            new com.primakara.banking.bankingGUI.DataTransaksiFrame(); // Buka frame Data Transaksi
        });

        btnLaporan.addActionListener(e -> {
            new com.primakara.banking.bankingGUI.LaporanFrame(); // Buka frame Laporan
        });
    }

    }