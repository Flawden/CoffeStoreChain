package stores;

import menu.*;

public class SamaraCoffeeStore extends CoffeStore {

    @Override
    public void setCoffeeStoreName() {
        city = "Samara";
    }

    @Override
    public void setFailChance() {
        failChance = 20;
    }

    @Override
    public void createCoffeList() {
        listOfCoffee.add(new Coffee("Cappuccino"));
        coffePriceList.add(30);
        listOfCoffee.add(new Coffee("Macchiato"));
        coffePriceList.add(40);
        listOfCoffee.add(new Coffee("Latte"));
        coffePriceList.add(50);
        listOfCoffee.add(new Coffee("Melange"));
        coffePriceList.add(60);
        listOfCoffee.add(new Coffee("Mocha"));
        coffePriceList.add(70);
        listOfCoffee.add(new Coffee("Frappe"));
        coffePriceList.add(80);
    }

    @Override
    public void additionalGoods() {}

    @Override
    public void failSituation() {
        numOfSituation = rnd.nextInt(1, 2);

        switch (numOfSituation) {
            case 1: {
                System.out.println("It looks like your coffee hasn't been delivered yet. We apologize");
                break;
            }
            case 2: {
                System.out.println("You have become our 1000 visitor. Coffee is yours for free!");
                break;
            }
        }
    }
}