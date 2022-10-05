package com.company;

import com.company.factory.IceCream;

public class IceCreamDesign {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Cherry Garcia", "Homemade", "High quality");

        iceCream.isTheBest();
        iceCream.isHomeMade();
        iceCream.highQuality();
        System.out.println("===================");

        System.out.println("Jeff's favorite ice cream is "+ iceCream.getFlavor()+".");
        System.out.println("Jeff prefers ice cream when it "+ iceCream.gethowItsMade()+".");
        System.out.println("Jeff really enjoys ice cream that "+ iceCream.getquality()+".");
        System.out.println("===================");

        com.company.pointofsale.IceCream iceCream1 = new com.company.pointofsale.IceCream(true, true, true, true, 2);

        iceCream1.addsWhippedCream();
        iceCream1.addsCaramel();
        iceCream1.addsHotFudge();
        iceCream1.addsSprinkles();

        System.out.println("===================");
        System.out.println("Does the customer's ice cream have caramel? "+ iceCream1.isHasCaramel());
        System.out.println("Does the customer's ice cream have hot fudge? "+ iceCream1.isHasHotFudge());
        System.out.println("Does the customer's ice cream have sprinkles? "+ iceCream1.isHasSprinkles());
        System.out.println("Does the customer's ice cream have whipped cream? "+ iceCream1.isHasWhippedCream());
        System.out.println("Number of scoops this customer's ice cream has: "+ iceCream1.getScoops());


    }



}
