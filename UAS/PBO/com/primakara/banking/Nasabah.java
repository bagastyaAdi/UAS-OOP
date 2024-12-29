package com.primakara.banking;

public class Nasabah {
    // Definisi Atribut
    private int NIK;
    private int Kode_CIF;
    private String Nama_Nasabah;
    private String Alamat;
    private int Telp;
    private String Nama_IbuKandung;
    private String Pekerjaan;
    private double Penghasilan_RataRata;

    // Constructor
    public Nasabah(int NIK, int Kode_CIF, String Nama_Nasabah, String Alamat, int Telp, String Nama_IbuKandung, String Pekerjaan, double Penghasilan_RataRata) {
        setNIK(NIK);
        setKode_CIF(Kode_CIF);
        setNama_Nasabah(Nama_Nasabah);
        setAlamat(Alamat);
        setTelp(Telp);
        setNama_IbuKandung(Nama_IbuKandung);
        setPekerjaan(Pekerjaan);
        setPenghasilan_RataRata(Penghasilan_RataRata);
    }

    // Method Setter
    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

    public void setKode_CIF(int Kode_CIF) {
        this.Kode_CIF = Kode_CIF;
    }

    public void setNama_Nasabah(String Nama_Nasabah) {
        this.Nama_Nasabah = Nama_Nasabah;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setTelp(int Telp) {
        this.Telp = Telp;
    }

    public void setNama_IbuKandung(String Nama_IbuKandung) {
        this.Nama_IbuKandung = Nama_IbuKandung;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public void setPenghasilan_RataRata(double Penghasilan_RataRata) {
        this.Penghasilan_RataRata = Penghasilan_RataRata;
    }

    // Method Getter
    public int getNIK() {
        return this.NIK;
    }

    public int getKode_CIF() {
        return this.Kode_CIF;
    }

    public String getNama_Nasabah() {
        return this.Nama_Nasabah;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public int getTelp() {
        return this.Telp;
    }

    public String getNama_IbuKandung() {
        return this.Nama_IbuKandung;
    }

    public String getPekerjaan() {
        return this.Pekerjaan;
    }

    public double getPenghasilan_RataRata() {
        return this.Penghasilan_RataRata;
    }
}
