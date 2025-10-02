/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum6;

/**
 *
 * @author Rifqi
 */
public class Praktikum6 {

    public static void main(String[] args) {
        Produk device1 = new Produk("Laptop", 7000000, 15);
        Produk device2 = new Produk("Handphone", 15000000, 10);
        
        System.out.println(device1.nama);
        System.out.println(device1.stok);
//        System.out.println(p1.harga);

        device1.namaSupplierFix();
        device2.tampilkanInfo();

        System.out.println("Harga : " + device1.getHarga());
        
        p1.setharga(5000000);
        System.out.println("Harga baru produk 1 : " + p1.getHarga());

      
        
        Produk.infoJumlah();
    }
    
    
}
