/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author Husain
 */
public class Kendaraan {

    private String merk;
    private int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected int getTahun() {
        return tahun;
    }

    protected void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Tahun: " + getTahun());
    }
}
