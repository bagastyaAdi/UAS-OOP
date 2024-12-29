package com.primakara.banking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NasabahModel {
    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/tabungan";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }

    public void insertNasabah(Nasabah nasabah) {
        String sql = "INSERT INTO tb_nasabah(NIK, Kode_CIF, Nama_Nasabah, Alamat, Telp, Nama_IbuKandung, Pekerjaan, Penghasilan_RataRata) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = this.connect();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, nasabah.getNIK());
            statement.setInt(2, nasabah.getKode_CIF());
            statement.setString(3, nasabah.getNama_Nasabah());
            statement.setString(4, nasabah.getAlamat());
            statement.setInt(5, nasabah.getTelp());
            statement.setString(6, nasabah.getNama_IbuKandung());
            statement.setString(7, nasabah.getPekerjaan());
            statement.setDouble(8, nasabah.getPenghasilan_RataRata());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    public List<Nasabah> getAllNasabah() {
        List<Nasabah> nasabahList = new ArrayList<>();
        String sql = "SELECT * FROM tb_nasabah";
        try {
            Connection conn = this.connect();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Nasabah nasabah = new Nasabah(
                        rs.getInt("NIK"),
                        rs.getInt("Kode_CIF"),
                        rs.getString("Nama_Nasabah"),
                        rs.getString("Alamat"),
                        rs.getInt("Telp"),
                        rs.getString("Nama_IbuKandung"),
                        rs.getString("Pekerjaan"),
                        rs.getDouble("Penghasilan_RataRata")
                );
                nasabahList.add(nasabah);
            }
        } catch (SQLException e) {
            System.out.println("Retrieving data gagal: " + e.getMessage());
        }
        return nasabahList;
    }
}