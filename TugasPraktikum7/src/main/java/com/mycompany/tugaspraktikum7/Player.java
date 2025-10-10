/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum7;

/**
 *
 * @author User
 */
public class Player {
    private String nama;
    private int nyawa;
    private int baseDamage;
    
    public Player(String namaPlayer, int nyawa, int damage) {
        this.nama = namaPlayer;
        this.nyawa = nyawa;
        this.baseDamage = damage;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String namaPlayer) {
        this.nama = namaPlayer;
    }
        
    public int getNyawa(){
        return nyawa;
    }
    
    public void getNyawa(int nyawa){
        this.nyawa = nyawa;
    }
    
    public int getDamage(){
        return baseDamage;
    }
    
    public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    
    public void attackEnemy(Enemy enemy) {
        int totalDamage = baseDamage;
        
        if(Math.random() <= 0.05) {
            totalDamage *= 2;
            System.out.println(enemy.getNama() + " mendapat serangan double!");
        }
        
        enemy.getNyawa(enemy.getNyawa() - totalDamage);
        System.out.println(nama + " menyerang " + enemy.getNama());
        System.out.println("Damage: " + totalDamage);
        System.out.println("Nyawa " +enemy.getNama()+ " sekarang: " + enemy.getNyawa());
        System.out.println();
    }
    
}