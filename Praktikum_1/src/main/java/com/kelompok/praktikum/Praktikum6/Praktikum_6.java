/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author VICTUS
 */
public class Praktikum_6 {
    public static void main(String[] args){
       Produk device1 = new Produk("Laptop", 7000000, 15);
       Produk device2 = new Produk("Handphone", 1500000, 10);
       
       System.out.println(device1.nama);
       System.out.println(device1.stok);
//       System.out.println(device1.harga);
//        device1.namaSuppliers();
        device1.namaSuppliersFix();
        device2.tampilkanInfo();               
        System.out.println(device1.getHarga());
        device1.setHarga(5000000);
        System.out.println("Harga baru untuk device 1 = " + device1.getHarga());
        Produk.infoJumlahProduk();
    }
}
