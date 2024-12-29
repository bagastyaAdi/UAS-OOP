package com.primakara.banking;

import java.util.List;

public class NasabahView {
    public void printNasabahDetails(List<Nasabah> nasabahs) {
        System.out.println("--------------------------------");
        System.out.println("Data Nasabah");
        System.out.println("--------------------------------");
        for (Nasabah nasabah : nasabahs) {
            System.out.println("NIK                : " + nasabah.getNIK());
            System.out.println("Kode CIF           : " + nasabah.getKode_CIF());
            System.out.println("Nama Nasabah       : " + nasabah.getNama_Nasabah());
            System.out.println("Alamat             : " + nasabah.getAlamat());
            System.out.println("Telp               : " + nasabah.getTelp());
            System.out.println("Nama Ibu Kandung   : " + nasabah.getNama_IbuKandung());
            System.out.println("Pekerjaan          : " + nasabah.getPekerjaan());
            System.out.println("Penghasilan Rata-rata: " + nasabah.getPenghasilan_RataRata());
            System.out.println("--------------------------------");
        }
    }
}