package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ChelyabinskCoffeeStore extends CoffeStore implements Biscuits{

    protected int buiscuitPrice = 15;

    @Override
    public void setCoffeeStoreName() {
        city = "Chelyabinsk";
    }

    @Override
    public void setFailChance() {
        failChance = 10;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(30);
        listOfCoffee.add(new Coffee("Macchiato"));
        coffePriceList.add(40);
        listOfCoffee.add(new Coffee("Latte"));
        coffePriceList.add(25);
        listOfCoffee.add(new Coffee("Flat white"));
        coffePriceList.add(50);
        listOfCoffee.add(new Coffee("Vietnamese coffee"));
        coffePriceList.add(15);
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
                System.out.println("Looks like your coffee hasn't been delivered yet. We apologize");
                break;
            }
            case 2: {
                System.out.println("I'm sorry, but your drink was out of stock.");
                break;
            }
            case 3: {
                System.out.println("Looks like your waiter ran off with your money..");
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
                System.out.println("There are your cookies");
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