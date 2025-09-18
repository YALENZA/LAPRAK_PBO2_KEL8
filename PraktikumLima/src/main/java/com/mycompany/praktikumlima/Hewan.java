/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumlima;

/**
 *
 * @author Rifqi
 */
abstract class Hewan {
    String nama;
    
    Hewan(String nama){
        this.nama = nama;
    }
    
    abstract void suara();
    
    void info(){
        System.out.println("Nama hewan : " + this.nama);
    }
}
