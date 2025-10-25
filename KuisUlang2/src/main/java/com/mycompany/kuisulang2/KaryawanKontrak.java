/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisulang2;

/**
 *
 * @author User
 */
public class KaryawanKontrak extends Karyawan implements IDGaji {

    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(String nama, String NIP, double upahHarian, int jumlahHariMasuk) {
        super(nama, NIP);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    @Override
    public void tampilkanSlipGaji() {
        double totalGaji = getUpahHarian() * getJumlahHariMasuk();
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status : Karyawan Kontrak");
        System.out.println("Total Gaji : " + totalGaji);

    }
}
