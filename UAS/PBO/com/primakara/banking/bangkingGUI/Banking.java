//Nama :kadek bagastya adi widyadhana-2301010075
// bisa melakukan GUI dalam 1 file

//package com.primakara.banking.bangkingGUI;
//
//import com.primakara.banking.Nasabah;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.util.List;
//
//public class Banking extends JFrame {
//    private NasabahModel mymodel = new NasabahModel();
//
//    public Banking() {
//        setTitle("Sistem Tabungan PBO UAS");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(600, 400);
//
//        // Set JFrame ke tengah layar
//        setLocationRelativeTo(null);
//
//
//        // Menyiapkan menu
//        JMenuBar menuBar = new JMenuBar();
//        JMenu menuMaster = new JMenu("Tambahkan");
//        JMenu menuLaporan = new JMenu("Laporan");
//        JMenu menuAbout = new JMenu("Tentang");
//        JMenuItem subMenuDataCustomer = new JMenuItem("Data Nasabah");
//        JMenuItem subMenuDataBarang = new JMenuItem("Data Transaksi");
//
//        // Tambahkan submenu ke menu
//        menuMaster.add(subMenuDataCustomer);
//        menuMaster.add(subMenuDataBarang);
//        menuBar.add(menuMaster);
//        menuBar.add(menuLaporan);
//        menuBar.add(menuAbout);
//
//        // Menyiapkan komponen Label
//        JPanel panelInput = new JPanel(new GridLayout(9, 2));
//        JLabel labelNIK = new JLabel(" NIK");
//        JLabel labelKodeCIF = new JLabel(" Kode CIF");
//        JLabel labelNamaNasabah = new JLabel(" Nama Nasabah");
//        JLabel labelAlamat = new JLabel(" Alamat");
//        JLabel labelTelp = new JLabel(" Telepon");
//        JLabel labelNamaIbuKandung = new JLabel(" Nama Ibu Kandung");
//        JLabel labelPekerjaan = new JLabel(" Pekerjaan");
//        JLabel labelPenghasilan = new JLabel(" Penghasilan Rata-Rata");
//
//        // Menyiapkan komponen field TextBox & Button
//        JTextField fieldNIK = new JTextField();
//        JTextField fieldKodeCIF = new JTextField();
//        JTextField fieldNamaNasabah = new JTextField();
//        JTextField fieldAlamat = new JTextField();
//        JTextField fieldTelp = new JTextField();
//        JTextField fieldNamaIbuKandung = new JTextField();
//        JTextField fieldPekerjaan = new JTextField();
//        JTextField fieldPenghasilan = new JTextField();
//        JButton btnSimpan = new JButton("Simpan");
//
//        // Tempatkan seluruh komponen pada panel Input
//        panelInput.add(labelNIK);
//        panelInput.add(fieldNIK);
//        panelInput.add(labelKodeCIF);
//        panelInput.add(fieldKodeCIF);
//        panelInput.add(labelNamaNasabah);
//        panelInput.add(fieldNamaNasabah);
//        panelInput.add(labelAlamat);
//        panelInput.add(fieldAlamat);
//        panelInput.add(labelTelp);
//        panelInput.add(fieldTelp);
//        panelInput.add(labelNamaIbuKandung);
//        panelInput.add(fieldNamaIbuKandung);
//        panelInput.add(labelPekerjaan);
//        panelInput.add(fieldPekerjaan);
//        panelInput.add(labelPenghasilan);
//        panelInput.add(fieldPenghasilan);
//        panelInput.add(new JLabel());
//        panelInput.add(btnSimpan);
//
//        // Siapkan komponen untuk Tabel Data
//        String[] listKolom = new String[]{"NIK", "Kode CIF", "Nama Nasabah", "Alamat", "Telepon", "Nama Ibu Kandung", "Pekerjaan", "Penghasilan Rata-Rata"};
//        DefaultTableModel tableModel = new DefaultTableModel(listKolom, 0);
//        JTable table = new JTable(tableModel);
//        JScrollPane panelData = new JScrollPane(table);
//
//        // Panel Utama: untuk menempatkan panelInput dan panelData
//        JPanel panelUtama = new JPanel(new BorderLayout());
//        panelUtama.add(panelInput, BorderLayout.NORTH);
//        panelUtama.add(panelData, BorderLayout.CENTER);
//
//        add(panelUtama);
//        setJMenuBar(menuBar);
//        panelUtama.setVisible(false);
//        setVisible(true);
//
//        // Listener untuk tombol simpan
//        btnSimpan.addActionListener(e -> {
//            int nik = Integer.parseInt(fieldNIK.getText());
//            int kodeCIF = Integer.parseInt(fieldKodeCIF.getText());
//            String namaNasabah = fieldNamaNasabah.getText();
//            String alamat = fieldAlamat.getText();
//            int telp = Integer.parseInt(fieldTelp.getText());
//            String namaIbuKandung = fieldNamaIbuKandung.getText();
//            String pekerjaan = fieldPekerjaan.getText();
//            double penghasilan = Double.parseDouble(fieldPenghasilan.getText());
//
//            Nasabah nasabah = new Nasabah(nik, kodeCIF, namaNasabah, alamat, telp, namaIbuKandung, pekerjaan, penghasilan);
//            mymodel.insertNasabah(nasabah);
//            tampilkanData(mymodel.getAllNasabah(), tableModel);
//            JOptionPane.showMessageDialog(null, "Data Sudah Tersimpan");
//        });
//
//        subMenuDataCustomer.addActionListener(e -> {
//            panelUtama.setVisible(true);
//            tampilkanData(mymodel.getAllNasabah(), tableModel);
//        });
//
//        tampilkanData(mymodel.getAllNasabah(), tableModel);
//    }
//
//    public void tampilkanData(List<Nasabah> nasabahList, DefaultTableModel tableModel) {
//        tableModel.setRowCount(0);
//        for (Nasabah nasabah : nasabahList) {
//            tableModel.addRow(new Object[]{
//                    nasabah.getNIK(),
//                    nasabah.getKode_CIF(),
//                    nasabah.getNama_Nasabah(),
//                    nasabah.getAlamat(),
//                    nasabah.getTelp(),
//                    nasabah.getNama_IbuKandung(),
//                    nasabah.getPekerjaan(),
//                    nasabah.getPenghasilan_RataRata()
//
//            });
//        }
//    }
//
//    public static void main(String[] args) {
//        new Banking();
//    }
//}
