/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis2;

/**
 *
 * @author User
 */
public class Mage extends Hero {
    
    
    public Mage(String nama, int nyawa, int damage) {
        super(nama, nyawa, damage);
    }
    
    @Override
    public void attackEnemy(Enemy enemy) {
        
        if (Math.random() <= 0.7) {
            System.out.println(getNama() + " mendapat serangan sihir besar!");
            System.out.println(getNama() + " memiliki peluang 30% untuk gagal");
            System.out.println("total hp: "+ getHp());
            
        } else {
            System.out.println(getNama() + " tidak  mendapatkan serangan sihir besar!");
            
        
        
        }
        
        
        
        
        
    
    
}
}
