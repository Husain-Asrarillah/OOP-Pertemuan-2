/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author Husain
 */
public class Mobil extends Kendaraan implements Pengemudi, Pemelihara, Pemilik {

    public Mobil(String merk, int tahun) {
        super(merk, tahun);
    }

    // Subclass bisa panggil getter dari superclass + print di sini
    public void Menyalakan() {
        System.out.println(getMerk() + " mulai jalan.");
    }

    public void Mematikan() {
        System.out.println(getMerk() + " berhenti.");
    }

    public void Membelokkan() {
        System.out.println(getMerk() + " belok ke kanan.");
    }

    public void MenggantiOli() {
        System.out.println(getMerk() + " sedang ganti oli.");
    }

    public void MengecekRem() {
        System.out.println(getMerk() + " sedang cek rem.");
    }

    public void Mencuci() {
        System.out.println(getMerk() + " sedang dicuci.");
    }

    public void Menggunakan() {
        System.out.println(getMerk() + " Digunakan Niko.");
    }

    public void Meminjamkan() {
        System.out.println("Pemilik " + getMerk() + " Meminjamkan Pada Orang Aceh.");
    }

    public void Menyewakan() {
        System.out.println("Pemilik " + getMerk() + " Menyewakan Pada Saudaranya.");
    }

    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", 2023);
        mobilku.info();

        mobilku.Menyalakan();
        mobilku.Mematikan();
        mobilku.Membelokkan();

        mobilku.MenggantiOli();
        mobilku.MengecekRem();
        mobilku.Mencuci();

        mobilku.Menggunakan();
        mobilku.Meminjamkan();
        mobilku.Menyewakan();
    }
}
