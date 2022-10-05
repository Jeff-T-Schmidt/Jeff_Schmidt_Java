package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
    private boolean hasSprinkles;
    private boolean hasWhippedCream;
    private boolean hasHotFudge;
    private boolean hasCaramel;
    private int scoops;


    public void addsWhippedCream(){
        System.out.println("Added whipped cream, that's an extra $.25");
    }

    public void addsCaramel(){
        System.out.println("Added caramel, that's an extra $.75");
    }

    public void addsHotFudge(){
        System.out.println("Added hot fudge, that's an extra $1.00");
    }

    public void addsSprinkles(){
        System.out.println("Added hot sprinkles, that's an extra $.10");
    }
    public IceCream(boolean hasSprinkles, boolean hasWhippedCream, boolean hasHotFudge, boolean hasCaramel, int scoops) {
        this.hasSprinkles = hasSprinkles;
        this.hasWhippedCream = hasWhippedCream;
        this.hasHotFudge = hasHotFudge;
        this.hasCaramel = hasCaramel;
        this.scoops = scoops;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    public boolean isHasWhippedCream() {
        return hasWhippedCream;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    public boolean isHasHotFudge() {
        return hasHotFudge;
    }

    public void setHasHotFudge(boolean hasHotFudge) {
        this.hasHotFudge = hasHotFudge;
    }

    public boolean isHasCaramel() {
        return hasCaramel;
    }

    public void setHasCaramel(boolean hasCaramel) {
        this.hasCaramel = hasCaramel;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return hasSprinkles == iceCream.hasSprinkles && hasWhippedCream == iceCream.hasWhippedCream && hasHotFudge == iceCream.hasHotFudge && hasCaramel == iceCream.hasCaramel && scoops == iceCream.scoops;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasSprinkles, hasWhippedCream, hasHotFudge, hasCaramel, scoops);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "hasSprinkles=" + hasSprinkles +
                ", hasWhippedCream=" + hasWhippedCream +
                ", hasHotFudge=" + hasHotFudge +
                ", hasCaramel=" + hasCaramel +
                ", scoops=" + scoops +
                '}';
    }
}
