public class Archer extends Hero{
    public Archer (String nama, int nyawa ,int baseDamage, int defense){
        super(nama, nyawa, baseDamage, defense);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int totalDamage = getDamage();
        double chance = Math.random();

        if (chance >= 0.5){
            totalDamage *=2;
            System.out.println("Mendapatkan serangan double!!");
        }
        else{
            double mult = chance + 0.5;
            if(mult > 1.0){
                mult = 1.0;
            }
            totalDamage *=mult;
        }

        enemy.setNyawa(enemy.getNyawa() -  totalDamage);
        System.out.println(getNama() + " menyerang " + enemy.getNama());
        System.out.println("Damage: " + totalDamage);
        System.out.println("Nyawa " +enemy.getNama()+ " sekarang: " + enemy.getNyawa());
        System.out.println();
    }
}
