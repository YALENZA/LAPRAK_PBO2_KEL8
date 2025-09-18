/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum5;

/**
 *
 * @author LENOVO
 */
public class TugasPraktikum5 {
    public static void main(String[] args) {
        TokoElektronik produkSatu = new TokoElektronik("Laptop", "ASUS", 1000000.0);
        TokoElektronik produkDua = new TokoElektronik("Smartphone", "Samsung");
        TokoElektronik produkTiga = new TokoElektronik();
        
        System.out.println("--- Produk 1 ---");
        produkSatu.tampilkanInfo(true);
        System.out.println("\n--- Produk 2 ---");
        produkDua.tampilkanInfo();
        System.out.println("\n--- Produk 3 ---");
        produkTiga.tampilkanInfo();
    }
}
