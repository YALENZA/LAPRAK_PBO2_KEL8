/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis2;

/**
 *
 * @author User
 */
public class Archer extends Hero {
    public Archer (String nama, int nyawa, int damage) {
        super(nama, nyawa, damage);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getNama()+ " menggunakan skill Double Shot");
        
    
}
}
