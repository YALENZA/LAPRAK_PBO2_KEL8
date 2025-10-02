/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum6;

/**
 *
 * @author Rifqi
 */
public class Rekening {
    private int saldo;
    
    public Rekening(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    
    public void SetSaldo(int saldo){
        this.saldo = saldo;
        System.out.println("Saldo dari Bank saat ini : " + saldo);
    }
    
  
}