/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum9;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Mahasiswa {

    private String nama;
    private String nim;
    private String prodi;
    private String jenisKelamin;
    private boolean active;

    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isActive() {
        return active;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Mahasiswa(String nama, String nim, String prodi, String jenisKelamin, boolean active) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.active = active;
    }

}
