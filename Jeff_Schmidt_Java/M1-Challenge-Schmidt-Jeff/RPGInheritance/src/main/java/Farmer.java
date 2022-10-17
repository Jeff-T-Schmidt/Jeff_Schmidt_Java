import java.util.Objects;

public class Farmer extends BaseClass {

    private boolean plowing;
    private boolean harvesting;


    public Farmer() {
        setName("Farmer Jeff");
        setStrength(75);
        setHealth(100);
        setStamina(75);
        setSpeed(10);
        setAttackPower(1);
        setRunning(false);
        setArrested(false);
        setPlowing(false);
        setHarvesting(false);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}
