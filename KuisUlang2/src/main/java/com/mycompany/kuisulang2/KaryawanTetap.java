/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisulang2;

/**
 *
 * @author User
 */
public class KaryawanTetap extends Karyawan implements IDGaji {

    private double gajiBulanan;

    public KaryawanTetap(String nama, String NIP, double gajiBulanan) {
        super(nama, NIP);
        this.gajiBulanan = gajiBulanan;
    }

    public double getGajiBulanan() {
        return gajiBulanan;
    }

    public void setGajiBulanan(double gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanSlipGaji() {
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status : Karyawan Tetap");
        System.out.println("Gaji Bulanan : " + getGajiBulanan());

    }

}
