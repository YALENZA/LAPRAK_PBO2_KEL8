public class Warrior extends Hero{
    public Warrior(String nama, int nyawa, int baseDamage, int defense){
        super(nama, nyawa, baseDamage, defense);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int totalDamage = getDamage();
        double chance = Math.random();
        if(chance > 0.5) {
            totalDamage *=2;
            System.out.println(getNama() + "Menggunakan Skill power strike ");
            enemy.setNyawa(enemy.getNyawa() - totalDamage);
        }
        else{
            totalDamage = totalDamage;
            System.out.println(getNama() + "menggunakan serangan biasa");
        }
        System.out.println(getNama() + " menyerang " +enemy.getNama());
        System.out.println("Damage :" +  getDamage());
        System.out.println("Sisa nyawa " + enemy.getNama() + " sekarang : " + enemy.getNyawa());
    }
}
