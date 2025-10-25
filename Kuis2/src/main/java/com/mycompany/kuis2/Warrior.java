/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis2;

/**
 *
 * @author User
 */
public class Warrior extends Hero {

    public Warrior(String nama, int nyawa, int damage) {
        super(nama, nyawa, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int totalDamage = getDamage();
        int totalHp = (getHp()- 5);

        if (Math.random() <= 0.9) {
            totalDamage *= 2;
            System.out.println(enemy.getNama() + " mendapat serangan 2x damage");
            System.out.println("Sisa Hp sekarang: " + totalHp);
        }
         
        enemy.setHp(enemy.getHp() - totalDamage);
        System.out.println(getNama() + " menyerang " + enemy.getNama());
        System.out.println("Damage: " + totalDamage);
        System.out.println("Nyawa " + enemy.getNama() + " sekarang: " + enemy.getHp());
        System.out.println();
    }
    
   

}


