/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author Athaya Nabil Putra Halby
 */
public class TugasPraktikum_5 {
    public static void main(String[] args){
        
        //constructor overloading
        TataSurya bumi = new TataSurya();
        TataSurya mars = new TataSurya("Mars");
        TataSurya jupiter = new TataSurya("Jupiter", 9.9, 4331.0);
        
        //method overloading    
        bumi.infoPlanet();
        mars.infoPlanet();
        jupiter.infoPlanet(16);
        
    }
}
