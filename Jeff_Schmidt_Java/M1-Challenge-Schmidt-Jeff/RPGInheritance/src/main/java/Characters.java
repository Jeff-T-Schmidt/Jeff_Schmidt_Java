public class Characters {
    public static void main(String[] args) {

        Farmer myFarmer = new Farmer();
        myFarmer.setName("Farmer Jeff");
        myFarmer.setStrength(75);
        myFarmer.setHealth(100);
        myFarmer.setStamina(75);
        myFarmer.setSpeed(10);
        myFarmer.setAttackPower(1);
        myFarmer.setRunning(false);
        myFarmer.setArrested(false);
        myFarmer.setPlowing(false);
        myFarmer.setHarvesting(false);

        Constable myConstable = new Constable();
        myConstable.setName("Constable Jeff");
        myConstable.setStrength(60);
        myConstable.setHealth(100);
        myConstable.setStamina(60);
        myConstable.setSpeed(20);
        myConstable.setAttackPower(5);
        myConstable.setRunning(false);
        myConstable.setArrested(false);

        Warrior myWarrior = new Warrior();
        myWarrior.setName("Warrior Jeff");
        myWarrior.setStrength(75);
        myWarrior.setHealth(100);
        myWarrior.setStamina(100);
        myWarrior.setSpeed(50);
        myWarrior.setAttackPower(10);
        myWarrior.setShieldStrength(100);
        myWarrior.setRunning(false);
        myWarrior.setArrested(false);

        myConstable.isAttacking(myFarmer);
        myFarmer.isAttacking(myConstable);
        myConstable.isArresting(myFarmer);
        myWarrior.isAttacking(myConstable);
    }

}
