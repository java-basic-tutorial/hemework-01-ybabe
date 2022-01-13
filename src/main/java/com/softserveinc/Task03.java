package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();
        System.out.println( "Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int cups = scanner.nextInt();
        int minCups = 0;
        int minCupsFromWater = water/200;
        int minCupsFromMilk = milk/50;
        int minCupsFromBeans = beans/15;
        minCups = minCupsFromWater;
        if (minCupsFromMilk < minCups) {
            minCups = minCupsFromMilk;
        }
        if (minCupsFromBeans < minCups) {
            minCups = minCupsFromBeans;
        }
        if (cups == minCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(cups > minCups) {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can  make that amount of coffee (and even " + (minCups - cups) + " more than that)");
        }
    }
}
