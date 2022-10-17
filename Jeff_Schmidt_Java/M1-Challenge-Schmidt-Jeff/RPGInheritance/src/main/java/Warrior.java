import java.util.Objects;

public class Warrior extends BaseClass {
    private int shieldStrength;

    public Warrior() {
        setName("Warrior Jeff");
        setStrength(75);
        setHealth(100);
        setStamina(100);
        setSpeed(50);
        setAttackPower(10);
        setShieldStrength(100);
        setRunning(false);
        setArrested(false);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}

