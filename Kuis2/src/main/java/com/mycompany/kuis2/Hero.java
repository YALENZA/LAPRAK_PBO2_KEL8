/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis2;

/**
 *
 * @author User
 */
public class Hero extends Character{
    
    public Hero(String nama, int nyawa, int damage) {
        super(nama, nyawa, damage);
    }
    
    public void attackEnemy(Enemy enemy) {
        int totalDamage = getDamage();
        
        if(Math.random() <= 0.9) {
            totalDamage *= 2;
            System.out.println(enemy.getNama() + " mendapat serangan double!"); 
        }
       
        System.out.println(getNama() + " menyerang " + enemy.getNama());
        System.out.println("Damage: " + getDamage());
        System.out.println("Nyawa " + getNama() + " sekarang: " + getHp());
        System.out.println();

    }
   
        
   
        
        
    

}
