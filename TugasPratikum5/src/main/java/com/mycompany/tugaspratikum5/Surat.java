/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspratikum5;

/**
 *
 * @author User
 */
public class Surat {
    int no_surat;
    String jenis_surat, pengirim, penerima, tanggal_terima;
    
    public Surat(){
        this.no_surat = 003;
        this.jenis_surat = "Undangan";
        this.pengirim = "Eunhyuk";
        this.penerima = "Sooae";
        this.tanggal_terima = "12 September 2025";
    }
    
    public Surat(int no_surat, String jenis_surat, String pengirim, String penerima){
        this.no_surat = no_surat;
        this.jenis_surat = jenis_surat;
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.tanggal_terima = "12 September 2025";
    }
    
    public Surat(int no_surat, String jenis_surat, String pengirim, String penerima, String tanggal_terima){
        this.no_surat = no_surat;
        this.jenis_surat = jenis_surat;
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.tanggal_terima = tanggal_terima;
    }
    
   
    
    public void tampilkanInfo() {
        System.out.println("No surat : " + this.no_surat);
        System.out.println("Jenis surat : " + this.jenis_surat);
        System.out.println("Pengirim : " + this.penerima);
        System.out.println("Penerima : " + this.pengirim);
        System.out.println("Tanggal Terima : " + this.tanggal_terima);
        System.out.println("=============================");
    }
    
    public void tampilkanInfo(int no_surat) {
        System.out.println("No surat : " + no_surat);
        System.out.println("Jenis surat : " + this.jenis_surat);
        System.out.println("Pengirim : " + this.penerima);
        System.out.println("Penerima : " + this.pengirim);
        System.out.println("Tanggal Terima : " + this.tanggal_terima);
        System.out.println("=============================");
    }
}
