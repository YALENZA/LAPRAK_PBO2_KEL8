/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspraktikumpbo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ClassMahasiswa {
    Scanner input  = new Scanner(System.in);
    String nama;
    Integer nim;
    String prodi;
    int tahunMasuk;
    
    public ClassMahasiswa (String nama, Integer nim, String prodi, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }
    
    public String biodata(String namaLengkap, String namaSingkat, int umur) {
       System.out.println ("Nama saya Anggita Natarina ");
       System.out.println ("biasanya saya dipanggiL Anggi ");
       System.out.println ("umur saya 19 tahun ");
     }
    public String biodata (String namaLengkap, String namaSingkat, int umur, String hobi){
       System.out.println ("Nama saya Anggita Natarina ");
       System.out.println ("biasanya saya dipanggi Anggi ");
       System.out.println ("umur saya 19 tahun ");
       System.out.println ("hobi saya mendengarkan musik");
     }
    
    public void tampilkanInfo () {
        System.out.println ("Masukkan nama lengkap : ");
        String namaLengkap = input.nextLine();
        
        
    }
    enum Prodi {
        S1TEKNIKELEKTRO, D3TEKNIKELEKTRO, S1TEKNIKINFORMATIKA
    }
    Prodi prodiSaatIni = Prodi.S1TEKNIKINFORMATIKA;
    
    if (prodiSaatIni == Prodi.S1TEKNIKINFORMATIKA) {
        System.out.println ("Prodi saya saat ini adalah " + prodiSaatIni);
   }
    System.out.println ("Prodi lain adalah " + Prodi.S1TEKNIKELEKTO);
    
    
    
    
    
    
    
}
    
   
    
    

