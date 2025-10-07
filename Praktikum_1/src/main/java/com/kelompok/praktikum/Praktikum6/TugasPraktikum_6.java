/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author User
 */
public class TugasPraktikum_6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Bank bank1 = new Bank("taya", 621123456789L);
        Bank bank2 = new Bank("nabil", 629987654321L);
        
        Bank.infoNasabah();
        
        Rekening rekening1 = new Rekening(200000);
        rekening1.SetSaldo(250000);
        
        System.out.println("Nama Nasabah 1 : " +bank1.namaNasabah);
        System.out.println("Nomor Hp Nasabah 1 : " +bank1.getNomorHp());
        System.out.println("Nama Nasabah 1 : " +bank2.namaNasabah);
        System.out.println("Nomor Hp Nasabah 2 : " +bank2.getNomorHp());
        System.out.println("Jumlah Saldo Bank sekarang : " +rekening1.getSaldo());
    }    
}