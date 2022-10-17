import java.util.Objects;

public class Constable extends BaseClass {

    private String jurisdiction;

    public Constable() {
        setName("Constable Jeff");
        setStrength(60);
        setHealth(100);
        setStamina(60);
        setSpeed(20);
        setAttackPower(5);
        setRunning(false);
        setArrested(false);
        setJurisdiction("King county");
    }

    public void isArresting(BaseClass Character){
        System.out.println(getName()  + " is arresting " + Character.getName() + ".");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}