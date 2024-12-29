package com.primakara.banking;



import java.util.Scanner;

public class NasabahController {
    private NasabahModel mymodel = new NasabahModel();
    private NasabahView myview = new NasabahView();

    public void run() {
        tampilkanMenu();
    }

    public void tampilkanMenu() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Menu :");
            System.out.println("1. Tambah Data Nasabah");
            System.out.println("2. Tampilkan Data Nasabah");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    inputDataNasabah();
                    break;
                case 2:
                    tampilkanDataNasabah();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid");
                    break;
            }
        }
    }

    public void inputDataNasabah() {
        System.out.println("--------------------------------");
        System.out.println("Input Data Nasabah");
        System.out.println("--------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIK                : ");
        int NIK = scanner.nextInt();
        System.out.print("Kode CIF           : ");
        int Kode_CIF = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nama Nasabah       : ");
        String Nama_Nasabah = scanner.nextLine();
        System.out.print("Alamat             : ");
        String Alamat = scanner.nextLine();
        System.out.print("Telp               : ");
        int Telp = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nama Ibu Kandung   : ");
        String Nama_IbuKandung = scanner.nextLine();
        System.out.print("Pekerjaan          : ");
        String Pekerjaan = scanner.nextLine();
        System.out.print("Penghasilan Rata-rata: ");
        double Penghasilan_RataRata = scanner.nextDouble();

        Nasabah nasabah = new Nasabah(NIK, Kode_CIF, Nama_Nasabah, Alamat, Telp, Nama_IbuKandung, Pekerjaan, Penghasilan_RataRata);
        mymodel.insertNasabah(nasabah);
    }

    public void tampilkanDataNasabah() {
        myview.printNasabahDetails(mymodel.getAllNasabah());
    }
}