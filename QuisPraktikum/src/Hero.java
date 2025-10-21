public class Hero extends Karakter{
    public Hero(String nama, int nyawa, int baseDamage, int defense){
        super(nama, nyawa, baseDamage, defense);
    }


    public void attackEnemy(Enemy enemy){
        int totalDamage = getDamage();
        enemy.setNyawa(enemy.getNyawa()- getDamage());
        System.out.println(getNama() + " Menyerang " + enemy.getNama());
        System.out.println("damage : " + getDamage());
        System.out.println("Sisa nyawa : " + enemy.getNama() + " sekarang : " + enemy.getNyawa());
    }
}
