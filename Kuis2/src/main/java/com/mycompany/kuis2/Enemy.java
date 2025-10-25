/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis2;

/**
 *
 * @author User
 */
public class Enemy {

    private String nama;
    private int hp;
    private int damage;

    public Enemy(String nama, int hp, int damage) {
        this.nama = nama;
        this.hp = hp;
        this.damage = damage;
    }

    public String getNama() {
        return nama;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attackHero(Hero hero) {
        int totalDamage = damage;

        if (Math.random() <= 0.9) {
            totalDamage *= 2;
            System.out.println(getNama() + " mendapat serangan double!");
        }

        System.out.println(getNama() + " menyerang " + hero.getNama());
        System.out.println("Damage: " + getDamage());

        System.out.println("Nyawa " + getNama() + " sekarang: " + getHp());
        System.out.println();

    }
}
