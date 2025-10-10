/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_7;

/**
 *
 * @author RIfqi
 */
public class Praktikum_7 {

    public static void main(String[] args) {
        Produk produk1 = new Produk ("Buku", 150000);
        BarangElektronik produk2 = new BarangElektronik ("Mouse", 150000, 12);
        
        produk1.tampilkanInfo();
        System.out.println("Pajak produk biasa : " + produk1.hitungPajak());
        System.out.println("Harga Akhir produk biasa : " + produk1.hitungHarga());
        System.out.println("--------------------");
        produk2.tampilkanInfo();
        produk2.tampilkanGaransi();
        System.out.println("Pajak produk elektronik : " + produk2.hitungPajak());
        System.out.println("Harga Akhir produk elektronik : " + produk2.hitungHarga());
        
    }
}
