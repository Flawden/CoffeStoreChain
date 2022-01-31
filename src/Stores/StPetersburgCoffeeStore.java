package stores;

import menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class StPetersburgCoffeeStore extends CoffeStore implements Biscuits{

    protected int buiscuitPrice = 40;

    @Override
    public void setFailChance() {
        failChance = 3;
    }

    @Override
    public void setCoffeeStoreName() {
        city = "Saint Petersburg";
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(130);
        listOfCoffee.add(new Coffee("Macchiato "));
        coffePriceList.add(230);
        listOfCoffee.add(new Coffee("Caffellatte"));
        coffePriceList.add(330);
        listOfCoffee.add(new Coffee("Flat white"));
        coffePriceList.add(340);
        listOfCoffee.add(new Coffee("Сà phê sữa đá"));
        coffePriceList.add(300);
        listOfCoffee.add(new Coffee("Café bombón"));
        coffePriceList.add(230);
        listOfCoffee.add(new Coffee("Wiener Espresso"));
        coffePriceList.add(240);
        listOfCoffee.add(new Coffee("Wiener Melange"));
        coffePriceList.add(170);
        listOfCoffee.add(new Coffee("Сaffè mocha"));
        coffePriceList.add(190);
        listOfCoffee.add(new Coffee("Frappé"));
        coffePriceList.add(250);
    }

    @Override
    public void additionalGoods() {sellBiscuits();}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("Looks like your coffee hasn't been delivered yet. We apologize");
                break;
            }
            case 2: {
                System.out.println("Looks like your coffee turned out to be tea. We apologize");
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