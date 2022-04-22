package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        products.add("Red Hot Doritos");
        prices.add(2.99);
        products.add("Cool Ranch Doritos");
        prices.add(2.99);
        products.add("Coke");
        prices.add(0.99);
        products.add("Diet Coke");
        prices.add(0.99);
        products.add("Pepsi");
        prices.add(0.99);
        products.add("5 Hour Energy");
        prices.add(3.99);
        products.add("Sunflower Seeds");
        prices.add(0.99);
        products.add("Peanuts");
        prices.add(0.99);
        products.add("Mac Charger");
        prices.add(120.00);
        products.add("Dell Charger");
        prices.add(50.00);

        ArrayList<String> purchases = new ArrayList<>();

        int input = 0;
        double totalcost = 0.0;
        Scanner keyboard = null;
        while (input != 10) {
            System.out.println("What are you buying?: 0.Red Hot Doritos, 1.Cool Ranch Doritos, 2.Coke, 3.Diet Coke, 4.Pepsi, 5.5 Hour Energy, 6. Sunflower Seeds, 7.Peanuts, 8. Mac Charger, 9.Dell Charger, 10. Finish");
            keyboard = new Scanner(System.in);
            input = keyboard.nextInt();
            if (input >= 0 && (input < 10)) {
                purchases.add(products.get(input));
                totalcost = totalcost + prices.get(input);
            }

        }
        System.out.println("Your total is : " + "$" + totalcost);
        System.out.println(purchases);

    }

}


