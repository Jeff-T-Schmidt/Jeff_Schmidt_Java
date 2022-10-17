public class Characters {
    public static void main(String[] args) {

        Constable officerToughGuy = new Constable();
        Farmer farmerMan = new Farmer();
        Warrior crazyWarrior = new Warrior();

        officerToughGuy.isAttacking(farmerMan);
        farmerMan.isAttacking(officerToughGuy);
        officerToughGuy.isArresting(farmerMan);
        crazyWarrior.isAttacking(officerToughGuy);


        }
    }


