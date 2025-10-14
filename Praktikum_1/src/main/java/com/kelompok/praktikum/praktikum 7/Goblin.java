/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.belajar;

/**
 *
 * @author VICTUS
 */
public class Goblin extends Enemy{
        
    public Goblin (String nama, int nyawa, int baseDamage) {
        super(nama, nyawa, baseDamage);
    }
    
    @Override
    public void attackPlayer(Player player) {
        int totalDamage = getDamage();
        
        if(Math.random() <= 0.05) {
            totalDamage *= 2;
            System.out.println(player.getNama() + " mendapat serangan double!");
        }
        
        player.setNyawa(player.getNyawa() - totalDamage);
        System.out.println(getNama() + " menyerang " + player.getNama());
        System.out.println("Damage: " + totalDamage);
        System.out.println("Nyawa "+ player.getNama()+" sekarang: " + player.getNyawa());
        System.out.println();
    }
    
}
