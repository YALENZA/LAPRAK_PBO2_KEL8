/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugaspraktikum7;

/**
 *
 * @author User
 */
public class TugasPraktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player("Nanami", 1000, 50);
        Enemy enemy1 = new Enemy("Eunhyuk", 1000, 50);
        Goblin goblin1 = new Goblin("Dohwa", 1000, 50);
        
        System.out.println("Mulai");
        enemy1.attackPlayer(player1);
        player1.attackEnemy(enemy1);
        player1.attackEnemy(enemy1);
        goblin1.attackPlayer(player1);
        player1.attackEnemy(goblin1);
    }
    
}