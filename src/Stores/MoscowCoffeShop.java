package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MoscowCoffeShop extends CoffeStore implements Biscuits{

    protected int buiscuitPrice = 40;

    @Override
    public void setFailChance() {
        failChance = 5;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Moscow";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(130);
        listOfCoffee.add(new Coffee("Macchiato"));
        coffePriceList.add(120);
        listOfCoffee.add(new Coffee("Latte"));
        coffePriceList.add(230);
        listOfCoffee.add(new Coffee("Flat white"));
        coffePriceList.add(250);
        listOfCoffee.add(new Coffee("Vietnamese coffee"));
        coffePriceList.add(150);
        listOfCoffee.add(new Coffee("Cafe bombon"));
        coffePriceList.add(90);
        listOfCoffee.add(new Coffee("Viennese coffee"));
        coffePriceList.add(140);
        listOfCoffee.add(new Coffee("Melange"));
        coffePriceList.add(300);
        listOfCoffee.add(new Coffee("Mocha"));
        coffePriceList.add(315);
        listOfCoffee.add(new Coffee("Frappe"));
        coffePriceList.add(256);
    }

    @Override
    public void additionalGoods() {
        sellBiscuits();
    }

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 3);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Looks like your coffee hasn't been delivered yet. We are very sorry ");
                break;
            }
            case 2: {
                System.out.println("We're sorry, our tired programmer drank all the coffee");
                break;
            }
            case 3: {
                System.out.println("We're sorry, but your store is closed for quarantine");
                break;
            }
        }
    }

    @Override
    public void sellBiscuits() {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you like some cookies for " + buiscuitPrice + " roubles? (Yes/No)");

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
