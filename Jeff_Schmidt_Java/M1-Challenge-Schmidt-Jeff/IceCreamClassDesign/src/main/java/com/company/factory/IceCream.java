package com.company.factory;

import java.util.Objects;

public class IceCream {
   private String flavor;
   private String howItsMade;
   private String quality;

   public void isTheBest(){
       System.out.println(flavor + " is the best ice cream!!!!");
   }
   public void isHomeMade (){
       System.out.println(howItsMade + " is the best way to make ice cream!!!");
   }
   public void highQuality(){
       System.out.println(quality + " is the only quality of ice cream!!!");
   }

    public IceCream(String flavor, String howItsMade, String quality) {
        this.flavor = flavor;
        this.howItsMade = howItsMade;
        this.quality = quality;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String gethowItsMade() {
        return howItsMade;
    }

    public void sethowItsMade(String howItsMade) {
        this.howItsMade = howItsMade;
    }

    public String getquality() {
        return quality;
    }

    public void setquality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Objects.equals(flavor, iceCream.flavor) && Objects.equals(howItsMade, iceCream.howItsMade) && Objects.equals(quality, iceCream.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, howItsMade, quality);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", howItsMade='" + howItsMade + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }
}
