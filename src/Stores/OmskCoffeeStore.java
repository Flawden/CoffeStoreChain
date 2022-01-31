package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class OmskCoffeeStore extends CoffeStore implements Biscuits {

    protected int buiscuitPrice = 20;

    @Override
    public void setFailChance() {
        failChance = 15;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Omsk";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Flat white"));
        coffePriceList.add(50);
        listOfCoffee.add(new Coffee("Vietnamese coffee"));
        coffePriceList.add(80);
        listOfCoffee.add(new Coffee("Cafe bombon"));
        coffePriceList.add(40);
        listOfCoffee.add(new Coffee("Viennese coffee"));
        coffePriceList.add(60);
        listOfCoffee.add(new Coffee("Melange"));
        coffePriceList.add(35);
        listOfCoffee.add(new Coffee("Mocha"));
        coffePriceList.add(50);
        listOfCoffee.add(new Coffee("Frappe"));
        coffePriceList.add(60);
    }

    @Override
    public void additionalGoods() {sellBiscuits();}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Your coffee was poisoned for trying to leave the city of Omsk.");
                break;
            }
            case 2: {
                System.out.println("Our coffee was taken over by a group of vicious pigeons. We're sorry");
                break;
            }
        }
    }

    @Override
    public void sellBiscuits() {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want some cookies? (Yes/No)");

        try {
            String answer = rd.readLine().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println("Here is your cookie");
                sellBiscuitsCounter++;
                sellBiscuitsTotal+= buiscuitPrice;
            }
            else if(answer.equals("no")) {
                System.out.println("Ok, let's continue.");
            }
            else {
                System.out.println("I guess it was \"no\"");
            }

        } catch (IOException e) {
            System.out.println("Incorrect value. Try again.");
        }
    }
}