package com.primakara.banking.bangkingGUI;

import com.primakara.banking.Nasabah;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TambahNasabahFrame extends JFrame {
    private NasabahModel nasabahModel = new NasabahModel(); // Gunakan NasabahModel

    public TambahNasabahFrame() {
        setTitle("Tambah Nasabah");
        setSize(900, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel Input
        JPanel panelInput = new JPanel(new GridLayout(9, 2, 10, 10));
        JLabel labelNIK = new JLabel("NIK");
        JLabel labelKodeCIF = new JLabel("Kode CIF");
        JLabel labelNamaNasabah = new JLabel("Nama Nasabah");
        JLabel labelAlamat = new JLabel("Alamat");
        JLabel labelTelp = new JLabel("Telepon");
        JLabel labelNamaIbuKandung = new JLabel("Nama Ibu Kandung");
        JLabel labelPekerjaan = new JLabel("Pekerjaan");
        JLabel labelPenghasilan = new JLabel("Penghasilan Rata-Rata");

        // Field Input
        JTextField fieldNIK = new JTextField();
        JTextField fieldKodeCIF = new JTextField();
        JTextField fieldNamaNasabah = new JTextField();
        JTextField fieldAlamat = new JTextField();
        JTextField fieldTelp = new JTextField();
        JTextField fieldNamaIbuKandung = new JTextField();
        JTextField fieldPekerjaan = new JTextField();
        JTextField fieldPenghasilan = new JTextField();

        // Tombol Simpan
        JButton btnSimpan = new JButton("Simpan");

        // Tambahkan komponen ke panel input
        panelInput.add(labelNIK);
        panelInput.add(fieldNIK);
        panelInput.add(labelKodeCIF);
        panelInput.add(fieldKodeCIF);
        panelInput.add(labelNamaNasabah);
        panelInput.add(fieldNamaNasabah);
        panelInput.add(labelAlamat);
        panelInput.add(fieldAlamat);
        panelInput.add(labelTelp);
        panelInput.add(fieldTelp);
        panelInput.add(labelNamaIbuKandung);
        panelInput.add(fieldNamaIbuKandung);
        panelInput.add(labelPekerjaan);
        panelInput.add(fieldPekerjaan);
        panelInput.add(labelPenghasilan);
        panelInput.add(fieldPenghasilan);
        panelInput.add(new JLabel());
        panelInput.add(btnSimpan);

        // Panel Tabel Data
        String[] listKolom = new String[]{
                "NIK", "Kode CIF", "Nama Nasabah", "Alamat", "Telepon",
                "Nama Ibu Kandung", "Pekerjaan", "Penghasilan Rata-Rata"
        };
        DefaultTableModel tableModel = new DefaultTableModel(listKolom, 0);
        JTable table = new JTable(tableModel);
        JScrollPane panelData = new JScrollPane(table);

        // Panel dengan padding (bungkus panel input dan tabel)
        JPanel panelWrapper = new JPanel(new BorderLayout(10, 10));
        panelWrapper.setBorder(new EmptyBorder(20, 20, 20, 20)); // Padding: atas, kiri, bawah, kanan
        panelWrapper.add(panelInput, BorderLayout.NORTH);
        panelWrapper.add(panelData, BorderLayout.CENTER);

        add(panelWrapper);
        setVisible(true);

        // Listener untuk tombol simpan
        btnSimpan.addActionListener(e -> {
            try {
                int nik = Integer.parseInt(fieldNIK.getText());
                int kodeCIF = Integer.parseInt(fieldKodeCIF.getText());
                String namaNasabah = fieldNamaNasabah.getText();
                String alamat = fieldAlamat.getText();
                int telp = Integer.parseInt(fieldTelp.getText());
                String namaIbuKandung = fieldNamaIbuKandung.getText();
                String pekerjaan = fieldPekerjaan.getText();
                double penghasilan = Double.parseDouble(fieldPenghasilan.getText());

                // Simpan ke database menggunakan NasabahModel
                Nasabah nasabah = new Nasabah(nik, kodeCIF, namaNasabah, alamat, telp, namaIbuKandung, pekerjaan, penghasilan);
                nasabahModel.insertNasabah(nasabah);

                // Tambahkan data ke tabel GUI
                tableModel.addRow(new Object[]{
                        nik, kodeCIF, namaNasabah, alamat, telp,
                        namaIbuKandung, pekerjaan, penghasilan
                });

                // Kosongkan field setelah data disimpan
                fieldNIK.setText("");
                fieldKodeCIF.setText("");
                fieldNamaNasabah.setText("");
                fieldAlamat.setText("");
                fieldTelp.setText("");
                fieldNamaIbuKandung.setText("");
                fieldPekerjaan.setText("");
                fieldPenghasilan.setText("");

                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Mohon isi data dengan format yang benar!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Menampilkan data awal dari database
        nasabahModel.getAllNasabah().forEach(nasabah -> tableModel.addRow(new Object[]{
                nasabah.getNIK(),
                nasabah.getKode_CIF(),
                nasabah.getNama_Nasabah(),
                nasabah.getAlamat(),
                nasabah.getTelp(),
                nasabah.getNama_IbuKandung(),
                nasabah.getPekerjaan(),
                nasabah.getPenghasilan_RataRata()
        }));
    }

    public static void main(String[] args) {
        new TambahNasabahFrame();
    }
}
