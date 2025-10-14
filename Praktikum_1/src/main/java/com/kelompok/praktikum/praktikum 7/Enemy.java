/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.belajar;

/**
 *
 * @author VICTUS
 */
public class Enemy {
    private String nama;
    private int nyawa;
    private int baseDamage;
    
    public Enemy(String namaEnemy, int nyawa, int damage) {
        this.nama = namaEnemy;
        this.nyawa = nyawa;
        this.baseDamage = damage;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String namaEnemy) {
        this.nama = namaEnemy;
    }
        
    public int getNyawa(){
        return nyawa;
    }
    
    public void setNyawa(int nyawa){
        this.nyawa = nyawa;
    }
    
    public int getDamage(){
        return baseDamage;
    }
    
    public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    
    public void attackPlayer(Player player) {
        int totalDamage = baseDamage;
        player.setNyawa(player.getNyawa() - totalDamage);
        System.out.println(nama + " menyerang " + player.getNama());
        System.out.println("Damage: " + totalDamage);
        System.out.println("Nyawa "+ player.getNama()+" sekarang: " + player.getNyawa());
        System.out.println();
    }
}
