/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum6;

/**
 *
 * @author User
 */
public class TugasPraktikum6 {

     public static void main(String[] args) {
        Bank bank1 = new Bank("Anggita", 621122334455L);
        Bank bank2 = new Bank("Natarina", 621122334455L);
        
        Bank.infoNasabah();
        
        Rekening rekening1 = new Rekening(200000);
        rekening1.SetSaldo(250000);
        
        System.out.println("Nama Nasabah 1 : " +bank1.namaNasabah);
        System.out.println("Nomor Hp Nasabah 1 : " +bank1.getNomorHp());
        System.out.println("Nama Nasabah 2 : " +bank2.namaNasabah);
        System.out.println("Nomor Hp Nasabah 2 : " +bank2.getNomorHp());
        System.out.println("Jumlah Saldo Bank sekarang : " +rekening1.getSaldo());
     }
}
