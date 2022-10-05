public class BaseClass {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int shieldStrength;
    private boolean running;
    private boolean arrested;
    private boolean plowing;
    private boolean harvesting;


    //Abilities - arrest another character ==========
    public void isArresting(BaseClass Character){
        System.out.println(name + " is arresting " + Character.getName() + ".");
    }
    //Abilities - attack another character ==========
    public void isAttacking(BaseClass Character){
        System.out.println(name + " is attacking " + Character.getName()+ ".");
    }
    public BaseClass() {
    }

    public BaseClass(String name, int strength, int health, int stamina, int speed, int attackPower,
                     int shieldStrength, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
        this.running = running;
        this.arrested = arrested;
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                ", running=" + running +
                ", arrested=" + arrested +
                ", plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}