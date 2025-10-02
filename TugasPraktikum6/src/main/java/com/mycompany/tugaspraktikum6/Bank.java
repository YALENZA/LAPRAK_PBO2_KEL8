/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum6;

/**
 *
 * @author User
 */
public class Bank {
    public String namaNasabah;
    private long nomorHp;
    static int jumlahNasabah = 0;
    
    public Bank(String namaNasabah, long nomorHp){
        this.namaNasabah = namaNasabah;
        this.nomorHp = nomorHp;
        jumlahNasabah++;
    }
    
    public long getNomorHp(){
        return nomorHp;
    }
    
    public void setNomorHP(long nomorHp){
        this.nomorHp = nomorHp;
    }
    
    public static void infoNasabah(){
        System.out.println("Total nasabah yang dibuat adalah : " +jumlahNasabah);
    }
}
